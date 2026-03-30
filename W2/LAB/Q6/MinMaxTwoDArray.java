package W2.LAB.Q6;

public class MinMaxTwoDArray{
    public static <E extends Comparable<E>> E min(E[][] list){
        int min1=0,min2=0;
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list[i].length; j++){
                if (list[i][j].compareTo(list[min1][min2])<0){
                    min1=i;
                    min2=j;
                }
            }
        }
        return list[min1][min2];
    }
    public static <E extends Comparable<E>> E max(E[][] list){
        int max1=0,max2=0;
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list[i].length; j++){
                if (list[i][j].compareTo(list[max1][max2])>0){
                    max1=i;
                    max2=j;
                }
            }
        }
        return list[max1][max2];
    }
    public static void main(String[]args){
        Integer a [][] = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("MINIMUM: "+min(a));
        System.out.println("MAXIMUM: "+max(a));
    }
}