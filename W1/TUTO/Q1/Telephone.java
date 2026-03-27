public class Telephone{
    private String areaCode;
    private int number;
    public static int numberOfTelephoneObject;
    public Telephone (String areaCode, int number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }
    public String getAreaCode(){
        return this.areaCode;
    }
    public int getNumber(){
        return this.number;
    }
    public void setAreaCode(String areaCode){
        this.areaCode=areaCode;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public String makeFullNumber(){
        return (this.areaCode+"-"+this.number);
    }
    public static void main(String[] args){
        Telephone [] telephones = new Telephone[5];
        String areaCode="03";
        int number = 79676300;
        for (int i=0;i<telephones.length;i++){
            telephones[i]=new Telephone(areaCode, number+i);
            System.out.println(telephones[i].makeFullNumber());
        }
    }
}