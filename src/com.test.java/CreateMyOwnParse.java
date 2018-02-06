import java.util.Scanner;

/**
 * Created by veronika on 05.02.18.
 */
public class CreateMyOwnParse {

    public static void main(String[] args){
        parseInt("543210");
    }

    public static int parseInt(String s){
        int parsedValue = 0;
            if((s != null)&&(!s.equals(""))&&(s.length()<=7)){
                for(int i = 1; i <= s.length(); ++i){
                    int counter = (int)Math.pow(1,i);
                    i=i*10;
                    System.out.println(counter);

                    //System.out.println(s.charAt(4));
                    //System.out.println(s.length());
                }
            }
        return parsedValue;
    }

}


