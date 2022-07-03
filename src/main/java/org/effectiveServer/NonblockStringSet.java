package org.effectiveServer;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class NonblockStringSet implements StringSet {

    private final int mask;

    private final int binsLength;
    protected final AtomicReferenceArray<Node> bins;


    public NonblockStringSet(int minSize) {

        int binsLength = Utils.smallestGreaterPowerOfTwo(minSize);
        //int binsLength = minSize;

        this.mask = binsLength - 1;

        this.binsLength = binsLength;

        this.bins = new AtomicReferenceArray<>(binsLength);
    }

    @Override
    public void add(String word) {
        int binIndex = getBinIndex(word);
        Node bin = getBin(binIndex);
        Node toBeAdded = newNode(word);
        if (bin == null)
        {
            if(compareAndSetBin(binIndex,null,toBeAdded))
            {
                return;
            }
        }
        bin = getBin(binIndex);
        while(true){
            if(bin.wordEquals(word))
            {
                return;
            }
            else{
                if(bin.getNext()==null){
                    if(bin.setNext(toBeAdded)){
                        return;
                    }
                }
                bin = bin.getNext();
            }
        }
    }

    @Override
    public boolean contains(String word) {
        int binIndex = getBinIndex(word);
        for (Node n = getBin(binIndex);n!=null;n=n.getNext()){
            if(n.wordEquals(word)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        int size = 0;

        for(int i = 0; i < this.binsLength ; i++)
        {
            for (Node n = getBin(i);n!=null;n=n.getNext())
            {
                size++;
            }

        }

        return size;
    }



    private int getBinIndex(String word) {
        return word.hashCode() & mask;
    }

    private static class Node {

        private final String word;
        private final AtomicReference<Node> next;
        public Node(String word){
            this.word = word;
            this.next = new AtomicReference<>();
        }

        public boolean setNext(Node next)
        {
            return this.next.compareAndSet(null,next);
        }

        public Node getNext()
        {
            return next.get();
        }

        public boolean wordEquals(String word)
        {
            return this.word.equals(word);
        }
    }

    protected Node newNode(String word) {
        return new Node(word);
    }

    protected Node getBin(int binIndex){
        return bins.get(binIndex);
    }

    protected boolean compareAndSetBin(int binIndex, Node expectedNode, Node newNode)
    {
        return bins.compareAndSet(binIndex,expectedNode,newNode);
    }

}
