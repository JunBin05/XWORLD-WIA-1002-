package W2.LAB.Q1;

public class MyGeneric<E>{
    private E e;
    public MyGeneric(){

    }
    public MyGeneric(E e){
        this.e=e;
    }
    public void setE(E e){
        this.e=e;
    }
    public E getE( ){
        return this.e;
    }
    public void main(String[]args){
        MyGeneric <String> strObj = new MyGeneric<>("Genetic");
        MyGeneric <Integer> intObj = new MyGeneric<>(50);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}