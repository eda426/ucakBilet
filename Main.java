import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double discount;
        double discountedAmount;


        Scanner user = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz:");
        int distance = user.nextInt();
        System.out.println("Yaşınızı giriniz:");
        int age = user.nextInt();
        System.out.println("Yolculuk tipini giriniz(1=>Tek Yön,2=>Gidiş Dönüş):");
        int selection = user.nextInt();
        double ticket = (distance * (0.10));
        if (distance>0 && age>0 && (selection==1 || selection==2 )) {

            if (age < 12) {
                discount = ticket * 0.50;



            } else if (age > 12 && age < 24) {
                discount = ticket * 0.10;


            } else if(age>65) {
                discount = ticket * 0.30;


            }
            else {
                discount=0;
            }
            ticket-=discount;
            if (selection==2)
            {
                discountedAmount=ticket*0.20;
                ticket=(ticket-discountedAmount)*2;
            }
            System.out.println("Toplam tutar:"+ticket);
        }
        else {
            System.out.println("Hatalı veri girdiniz!");
        }





        }
    }
