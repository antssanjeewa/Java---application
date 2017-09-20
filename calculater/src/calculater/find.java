package calculater;

 

import java.util.Scanner;
 import java.util.regex.*;
public class find {
    public static void main(String[] args) {
        
    Scanner s= new Scanner(System.in);
    Pattern p= Pattern.compile(",.,");
    Matcher m= p.matcher(s.next());
    while(m.find()){
        System.out.println("index  "+m.start());
        System.out.println("digit  "+m.group());
    }
}
}
