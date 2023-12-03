import java.util.Scanner;

public class fonksiyonlar {
/* diğer isimleriyle metotlar aslında bizim en baştan yaptığımız System.out.println(); kullandığımız tanımlanmış kısa yollar
her seferinde yazdığımız "public static void main(String[] args)" da fonksiyonu tanımladığımız yermiş bu da bir fonksiyon
main fonksiyonunu çağırıyoruz aslında .
Bu fonksiyonların faydası eğer ben bir işlemi projenin içinde sürekli kullanıyorsam bu işlemlerin tüm satırını yazarak dosyanın boyutunu şişirmem
hemde daha anlaşılıe olur yazdığım proje.

PARAMETRELER
parametreler fonksiyonun yanındaki parantez içinde tanımlanır. her paramaetre den sonra virgül konulup ver tipinin tanımlanması gerekiyor .
bu parametreleri tanımlanan değerelere istenilen işlemler yapılabiliyor.
fonksiyonu main içinde kullanırkende tanımlanmış parametrelerin yerlerini boş bırakamıyoruz.
*/

    public static void welcome(String a,int b){

        System.out.println("HOŞGELDİN "+a+" Reiss");
        System.out.println("bune reiss "+b+" kg billur mu olur ne yaptın sen");


    }
    public static void factorial(){
        Scanner entry = new Scanner(System.in);

        int factorial=1;

        while (true) {
            int number=entry.nextInt();

            if (number < 0) {
            System.out.println("lütfen pozitif bir değer giriniz");
            continue;


            }
            while (number > 0) {
                factorial*=number;
                --number;

            }

            System.out.println("faktöriyel işleminizin sonucu:  "+factorial);
            break;
        }
    }
    public static void main(String[] args){

    System.out.println("lütfen faktöriyelinin hesaplanmasını istediğiniz pozitif sayıyı giriniz");
    factorial();


        Scanner entry= new Scanner (System.in);

        System.out.println("lütfen kişinin ismini giriniz");
        String i=entry.nextLine();
        System.out.println("lütfen kişinin size göre değerini ifade eden sayısal bir değer giriniz");
        int t=entry.nextInt();

        welcome(i,t);




    }
}
