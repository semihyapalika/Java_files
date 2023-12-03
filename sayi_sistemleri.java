import java.util.Scanner;

public class sayi_sistemleri {
    public static void main(String[] args){
        Scanner entry= new Scanner(System.in);

        System.out.println("ikilik sisteme dönüşmesini istediğiniz sayıyı giriniz");

        int number= entry.nextInt();

        System.out.println("------------------------------------------------------");


        int ikilik[]= new int[100];


               for (int a =0;number>0;a++) {

                   int kalan =number % 2;

                   ikilik[a]=kalan ;


                   number /= 2;


                   if (number < 2){
                        a++;
                       ikilik[a]=number;

                       for (;a>=0;a--){
                           System.out.print(ikilik[a]);

                       }

                       break;
                   }



               }









    }

}
