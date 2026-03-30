package W2.TUTO.Q5_6;

public class Duo<A,B>{
    private A first;
    private B second;
    public Duo (A first, B second){
        this.first=first;
        this.second=second;
    }
    public static void main(String[]args){
        Duo<String,Integer> sideShape = new Duo<>("Side",50);
        Duo<Double,Double> points = new Duo<>(10.0,20.0);
    }
}