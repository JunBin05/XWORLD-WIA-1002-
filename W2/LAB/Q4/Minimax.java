package W2.LAB.Q4;
public class Minimax{
    public static void main (String [] args){
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }

    public static <E extends Comparable<E>> String minmax(E [] arr){
        int n = arr.length;
        int min = 0, max = 0;
        for (int index = 0; index<n-1; index++){
            if (arr[index+1].compareTo(arr[min])<0){
                min = index+1;
            }
            if (arr[index+1].compareTo(arr[max])>0){
                max = index+1;
            }
        }
        return ("Min = "+arr[min]+" Max = "+arr[max]);
    }
}