
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int a = scanner.nextInt();
        System.out.println("bir sayi daha giriniz:");
        int b = scanner.nextInt();
        System.out.println("bir sayi daha giriniz:");
        int c = scanner.nextInt();
        if(a>b&&a>c&&b>c){
            System.out.println("sonuc: " + a +" > " + b +" > "+c);  
        }
        else{
                if(a>b&&a>c&&c>b){
                System.out.println("sonuc: " + a +" > " + c +" > "+b);  
            }
            else{
                        if(b>a&&a>c&&b>c){
                    System.out.println("sonuc: " + b +" > " + a +" > "+c);  
                }
                else{
                                if(b>a&&c>a&&b>c){
                       System.out.println("sonuc: " + b +" > " + c +" > "+a);  
                   }
                     else{
                                        if(b>a&&c>a&&c>b){
                           System.out.println("sonuc: " + c +" > " + b +" > "+a);  
                       }
                         else{
                                                if(a>b&&c>a&&c>b){
                               System.out.println("sonuc: " + c +" > " + a +" > "+b);  
                           }
                                                
                         }
                     }
                }
            }
        }
    }
}
