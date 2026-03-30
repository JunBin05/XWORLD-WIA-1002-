package W2.TUTO.Q1;
public class Container <T> {
    private T t;
    public Container(){

    }
    public void add(T param){
        this.t= param;
    }
    public T retrieve(){
        return this.t;
    }
    public static void main(String[] args){
        Container <Integer> intContain = new Container<>();
        Container <String> stringContain = new Container<>();
        intContain.add(50);
        stringContain.add("Java");
        System.out.println("Object in Integer Container: "+intContain.retrieve());
        System.out.println("Object in String Container: "+stringContain.retrieve());
    }
}