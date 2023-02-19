import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,toplam=0;

        System.out.println("Sayıyı giriniz:");
        num = input.nextInt();

        do{
            System.out.println("Sayıyı giriniz:");
            num = input.nextInt();
            if(num%2==1){
                toplam += num;
            }

        }while(num>0);

        System.out.println("Toplam: " + toplam);
    }
}