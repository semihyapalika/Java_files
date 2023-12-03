import java.util.Locale;
import java.util.Scanner;

public class girdi_alma {
    public static void main(String[] args){
        Scanner GIRDI= new Scanner(System.in);

        GIRDI.useLocale(Locale.US);

        System.out.println("BİRİNCİ SAYI GİRİNİZ");
        int a = GIRDI.nextInt();

        System.out.println("İKİNCİ ONDALIKLI SAYIYI GİRİNİZ");
        double b = GIRDI.nextDouble();

        System.out.println("a değişkeninin değeri " + a);
        System.out.println("b değişkeninin değeri " + b);
    /*
    girdi istemek için istenilen bir karaktere scanner kütüphanesindeki System.in kütüphanesini bağkıyoruz ve
    istenilen girdinin değişkenini atanılan karakterin içindeki nextInt kütüphanesinden çağırıyoruz


    sayı ve ölçü birimleri farklılıklarının giderilmesi için hangi ülkaenin
    birimini kullanacaksak sıkıntı çıkmaması için belirtebiliriz

     */
    }


}
