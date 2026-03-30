package W3.LAB.Q1;
import java.util.Arrays;
public final class ArrayBag<T> implements BagInterface<T>{
    private T [] bag;
    public static int DEFAULT_CAPACITY = 25;
    private int numberOfEntries=0;
    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayBag(int capacity){
        this.bag = (T[]) new Object[capacity];
    }
    public int getCurrentSize(){
        return this.numberOfEntries;
    }
    public boolean isFull(){
        return (this.numberOfEntries==this.bag.length);
    }
    public boolean isEmpty(){
        return (this.numberOfEntries==0);
    }
    public boolean add(T newEntry){
        if (!isFull()){
            bag[this.numberOfEntries]=newEntry;
            this.numberOfEntries++;
            return true;
        }
        return false;
    }

    public T remove(){
        if(!isEmpty()){
            T itemRemoved = this.bag[this.numberOfEntries-1];
            bag[--this.numberOfEntries]=null;
            return itemRemoved;
        }
        return null;
    }

    public boolean remove(T anEntry){
        if(!isEmpty()){
            int i=Arrays.asList(this.bag).indexOf(anEntry);
            if (i>=0){
                for (int index = i;index<this.numberOfEntries-1; index++){
                    bag[index]=bag[index+1];
                }
                bag[--this.numberOfEntries]=null;
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for (int i=0; i<this.numberOfEntries; i++){
            this.bag[i]=null;
        }
        this.numberOfEntries=0;
    }

    public int getFrequencyOf(T anEntry){
        int frequency = 0;
        if (!isEmpty()){
            for (int i=0; i<this.numberOfEntries;i++){
                if (this.bag[i].equals(anEntry)){
                    frequency++;
                }
            }
        }
        return frequency;
    }

    public boolean contains(T anEntry){
        if (!isEmpty()){
            for (int i=0; i<this.numberOfEntries;i++){
                if (this.bag[i].equals(anEntry)){
                    return true;
                }
            }
        }
        return false;
    }

    public T[] toArray(){
        T[] array = (T[]) new Object[this.numberOfEntries];
        for (int i=0; i<this.numberOfEntries;i++){
            array[i]=this.bag[i];
        }
        return array;
    }
}