import java.util.Scanner;

/**
 * Created by veronika on 05.02.18.
 */
public class CreateMyOwnParse {

    public static void main(String[] args){
        System.out.println((parseInt("5478")));
        System.out.println((Integer.parseInt("5478")));
        System.out.println((parseInt("5478")) == Integer.parseInt("5478"));
    }

    public static int parseInt(String s){
        int res = 0;
        int n = s.length();
        int k = 1;

        for(int i = 0; i < n; ++i){
            res = res + (s.charAt(n-1-i)-'0')*k;
            k=k*10;
        }

        return res;
    }

}


