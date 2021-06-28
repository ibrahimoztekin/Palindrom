import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    static int isPalindrom(int number){

        int temp=number, reverseNumber=0, lastNumber;

        while (temp !=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp=temp/10;
        }

        return reverseNumber;
    }

    public static void main(String[] args) {

        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k=input.nextInt();
        int variable =isPalindrom(k);

        if(variable==k){
            System.out.println(variable+" bir palindrom sayıdır.");
        }
        else System.out.println(variable+" bir palindrom sayı değildir.");

    }
}
