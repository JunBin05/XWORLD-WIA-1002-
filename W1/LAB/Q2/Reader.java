package W1.LAB.Q2;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Reader{
    public static void main(String[]args){
        String [] special = {",",", ","; ","\\d+"};

        for (int i=1; i<=4; i++){
            int num=0;
            try{
                Scanner input = new Scanner(new File("W1/LAB/Q2/text"+i+".txt"));
                while (input.hasNextLine()){
                    String [] alphabet = input.nextLine().split(special[i-1]);
                    String ans = String.join("",alphabet);
                    num+=ans.length();
                    System.out.println(ans);
                }
                System.out.println("Number of characters: "+num+"\n");
                input.close();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
    }
}