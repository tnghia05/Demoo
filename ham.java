package scr;

import java.util.Scanner;


public class ham {
     static int random(){
            int n = (int)(Math.random() *11);
            return n;
        }
    public static void main(String[] args) {
        System.out.println("Nhap So May Man ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        String b = (random()%2==0) ? "Chan" :" le";
        System.out.println(b);
        scanner.close();

     System.out.println(random());
      
       

    }
}
