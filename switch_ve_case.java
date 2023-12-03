import java.util.Scanner;

public class switch_ve_case {
    public static void main(String[] args){
        /* bir değerin eşitlik durumlarını tek tek iflerle yazacağımıza case lerle eşitlik durumlarına göre işlemler
        gerçekleştirilebiliyor case durum demek.
        caselerin içindeki durumlar gerçekleştikten sonra sağlasın yada sğlamasın diğer duruma case geçiyor sadece sağlanan
        durumu çalıştırp bitirmesi için break koyuyoruz .
        Tüm durumlar çalışmadığında ise başka bir durum çalıştırılmak istenirse default durumu çalıştırılır bunun sonuna break
        koysakta olur koymasakta çünkü kendinden sonra çalışacak bir durum olmasığı için geçeceği bir durum yok.
        caselerin içine ifle yokarakta istediğiniz değeri istediğiniz şarta sokabiliriz

        switch(değişken){

        case durum1:

            break;

        case drurum2:

            break;

        deafault:

            break;


        }

         */

        Scanner entry= new Scanner (System.in);


        System.out.println("Bakiyeyi görmek için -1-");
        System.out.println("para yatırmak için  -2-");
        System.out.println("para çekmek için -3-");
        System.out.println("sistemden çıkmak için -4-");

        int sayi=entry.nextInt();
        int bakiye = 2000;


        switch (sayi){

            case 1:
                System.out.println("bakiyeniz =  " +  bakiye);

                break;

            case 2:
                System.out.println("girilecek tutarı giriniz");
                int girilecek= entry.nextInt();
                bakiye+=girilecek;
                System.out.println("yeni bakiyeniz =  "+bakiye);

                break;

            case 3:
                System.out.println("çekilecek tutarı giriniz");
                int cekilecek=entry.nextInt();
                if (cekilecek>bakiye){
                    System.out.println("bakiyenizde çekmek istediğiniz kadar para bulunmamaktadır");

                }
                else {
                    bakiye -= cekilecek;
                    System.out.println("yeni bakiyeniz =  " + bakiye);
                }
                break;

            case 4:
                System.out.print("sistemden çıkış yapılıyor");

                break;

            default:
                System.out.println("geçerli bir değer giriniz");




        }

    }
}
