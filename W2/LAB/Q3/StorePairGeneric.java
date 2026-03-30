package W2.LAB.Q3;
public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>> {
    private T first;
    private T second;
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof StorePairGeneric<?>){
            StorePairGeneric<?> obj = (StorePairGeneric<?>) o;
            return java.util.Objects.equals(obj.getFirst(),this.first);
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(StorePairGeneric<T> another){
        return (this.first.compareTo((another.getFirst())));
    }

    public static void main (String[]args){
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
        System.out.println("----.equals()----");
        System.out.println("a & b: "+a.equals(b));
        System.out.println("a & c: "+a.equals(c));
        System.out.println("b & c: "+b.equals(c));
        System.out.println("----.compareTo()----");
        System.out.println("a & b: "+a.compareTo(b));
        System.out.println("a & c: "+a.compareTo(c));
        System.out.println("b & c: "+b.compareTo(c));
    }
}