import java.util.Scanner;

public class mantiksal_oparatorler {

    public static void main(String[] args){
        /*
 ! (Not)
Kullanımı:!(3<5)
anlamı: true bir değeri false, false değeri true ya çevirir

&&(And)
Kullanımı:(5<40)&&(a==b)
Anlamı:
true,true  ----> true
true,false ----> false
false,true ----> false
false,false ----> false

||(Or)
Kullanımı:(8>a) || (8>c)
Anlamı:
true,true ----> true
false,true ----> true
true,false ----> true
false,fale ----> false

burda bu bilgileri daha önceden belirlernmiş kullanıcı adı ve paraloyla deneyeceğiz fakat belirlediğimiz string ifadeler
"mehmet"=="mehmet" olarak kıyaslanamıyor bu yüzden kay_kullanici_adi ve gir_kullanici_adi nın içindeki değerlerin
eşit olup olmadığını sorgulamak için (kay_kullanici_adi.equals(gir_kullanici_adi)) kullanıyoruz

if lerimizde girilen kullanıcı adının yanlış olduğu durumda çalışmasını istediğimiz Not mantıksal oporatorünü kullanıyoruz
 !(kay_kullanici_adi.equals(gir_kullanici_adi)) yankış giriliyor yani içindeki değer
kay_kullanici_adi eşit değil gir_kullanici_adi ya false çıkıyor ama not koyduğumuz için false yi true ya
çeviriyoruz

bu arada en baştaki maini yazarken public void main yazarsak herhangi bir hata vermiyor fakat bu editörde çalıştıamıyoruz ve ayrıca soldaki simgelerde
play tuşu olmuyor static yazmassak programda çalıştıramıyoruz

*/
    String kay_kullanici_adi="samihyapalikan",kay_parola="1233214";

    Scanner girdi= new Scanner(System.in);

    System.out.println("Kullanıcı adınızı giriniz");
    String gir_kullanici_adi=girdi.nextLine();

    System.out.println("parolanızı giriniz");
    String gir_parola=girdi.nextLine();

    if ( !(kay_kullanici_adi.equals(gir_kullanici_adi)) &&  !(gir_parola.equals(kay_parola))){

    System.out.println("şifre ve kullanıcı adi yanlış");

    }

    else if ((kay_kullanici_adi.equals(gir_kullanici_adi)) && !(gir_parola.equals(kay_parola))){
    System.out.println("parolanız yanlış");

    }


    else if(  !(kay_kullanici_adi.equals(gir_kullanici_adi)) ) {

    System.out.println("kullanıcı adınızı yanlış girdiniz");
    }

    else System.out.println("girişiniz başarılı......");


}
}
