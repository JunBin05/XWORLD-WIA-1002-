public class FindMax{
    public static class Circle implements Comparable<Circle>{
        private double radius;
        public Circle(double radius){
            this.radius=radius;
        }
        public double getRadius(){
            return this.radius;
        }
        @Override
        public int compareTo(Circle cir2){
            if (this.radius>cir2.getRadius()){
                return 1;
            }else if (this.radius<cir2.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String [] args){
        Integer [] a = {1,2,3};
        String [] b = {"red","green","blue"};
        Circle [] c = {new Circle(3), new Circle (2.9), new Circle(5.9)};
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c).getRadius());
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        int n = list.length;
        int max=0;
        for (int index=1; index<n; index++){
            if (list[index].compareTo(list[max])>0){
                max=index;
            }
        }
        return list[max];
    }
}