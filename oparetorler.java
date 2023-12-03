public class oparetorler {
    public static void main(String[] args){
    int a=10,b=4,x=0,y;
    /*eğer yapacağımız bölme işleminin sonucu virgüllü çıkıyprsa ve biz inticer olarak karakterleri
    tanımlamışsak cevap tam sayı olarak çıkacak eğer virgüllü çıkmasını istiyorsak işlem sırasında ya da daha önceden float
    olarak tanımlarsak virgüllüsonuçları gösteriyor. işlem yazılma sırasına göre değil matematikteki öncelik sırasına göre
    çalışır

    kalanlı bulması içinde % işaretini kullanıyoruz soldaki sayının sağdaki sayıya bölümünden kalanı veriyor
    tek çifti bulması için mesela ikiye bölümünden kalan kaç gibi

    */
    System.out.println("sonuç"+ a/b);
    System.out.println("sonuç" + (float)a/b);
    System.out.println ("SONUÇ" + (a+5/10-b));
    System.out.println("sonuç"+ a%2);

    /*
    birer birer arttırmak içinde a+4=a demek içinde kısa yollar var yani a döngünün içinde birer birer atması iiçin
    a+1=a değilde ++a yazılyoruz ++a ile a++ ya fa --a ile a-- nin farkı. işlem soldaysa işlemi yapıyor a ya atyor sağdaysa
    a ya yapılacak işlemi aklında tutuyor ve bir sonraki satırda işlemi gerçekleştiriyor.
     */

    x=1+x;
    x+=1;

    x=2*x;
    x*=2;
    System.out.println(x);

    y=5 ;
    System.out.println(y--);
    System.out.println(y);
    System.out.println(--y);



    }
}




