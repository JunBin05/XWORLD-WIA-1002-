package W2.TUTO.Q2;
import java.util.Arrays;

 public class MyArray{
    public static <E> void listAll(E[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void main(String [] args){
        Integer [] numbers = {1,2,3,4,5};
        String [] names = {"Jane","Tom","Bob"};
        Character [] alphabet = {'a','b','c'};
        System.out.print("Integer Array: ");
        listAll(numbers);

        System.out.print("String Array: ");
        listAll(names);

        System.out.print("Character Array: ");
        listAll(alphabet);
    }
 }