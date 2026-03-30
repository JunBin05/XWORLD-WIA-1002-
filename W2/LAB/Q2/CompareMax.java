package W2.LAB.Q2;
public class CompareMax{
    public static <E extends Comparable<E>> E maximum(E a, E b, E c){
        E max = a;
        if (b.compareTo(max)>0){
            max=b;
        }
        if (c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    public static void main(String [] args){
        System.out.println(maximum(10.0, 20.0, 15.0));
    }
}