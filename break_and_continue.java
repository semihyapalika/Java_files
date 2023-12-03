import java.util.Scanner;

public class break_and_continue {
    public static void main(String[] args){
/* break; döngünün içinde nerede kullanılırsa kullansın direk döngüyü sonlandırır.

continue; ise olduğu satırdan sonraki hiçbir komutu çalıştırmaz ve döngüyü tekrar ettirir

kendim bir ornek yapıyorum altta yazdıklarım, sen 0 yazana kadar girilen sayıları toplayacak
 */

    Scanner entry= new Scanner (System.in);
    int a ;
    int result=0;

    while (true){
        System.out.println("lütfen sayı giriniz :  çıkmak için'0'a sanızız : eğer '7' girerseniz geçersiz sayılacaktır");
        a=entry.nextInt();
        if (a==0){
            System.out.println("sonuç=  "+result);
            break;
        }
        else if (a==7){
            continue;

        }
        else {
            result+=a;
        }
    }









    }
}
