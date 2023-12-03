import java.util.Scanner;

public class kosullu_durumlar {
    public static void main(String[] args){
        /*  karşılaştırma oreratorleri
        a==b ----> eşit mi(eşitse true değilse false)
        a!=b ----> eşit değil mi farklı mı (eşit değilse true eşitse false)
        a>b ---->a b den büyükse true değilse false
        a<b  a<=  a>= bu koşulları direk yazdırırsak zaten çıkardığı boolean değerleri görürüz

        if(koşul){
            koşul sağlandığında  yürütülecek işlemler
        }
        */


        int a=4;
        System.out.println("sonuç "+ (a<5));



        /*    if komutu ise eğer anlamına gelir eğer şu şu şartları sağlarsanız altındaki komutlar sağlanır

        else ise başka yoksa gibi anlamlara gelir ve if şartlarının hiçbiri sağlanmadıysa çalışır

        else if ise sadece ve sadece if sağlanmadığında kendi şartını konutrol eder ama alt alta
        ifler yüztane bile olsa herbiri kendi şartını sağlayıp sağlamadığına bakar


         */

        Scanner girdi= new Scanner(System.in);

        System.out.println("notunuzu giriniz");
        int sayi=girdi.nextInt();

        if (sayi>100){
            System.out.println("öyle not mu olur gardeeş");

        }

        else if(sayi>90) System.out.println(" fena değil");

        else if(sayi<80){
            System.out.println("git biraz çalış knk");

        }

        else System.out.println("geçmiş olsun ") ;





    }
}
