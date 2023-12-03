import java.util.Scanner;

public class do_while_donguleri {
    public static void main(String[]args){
/* do while döngülerinin while döngülerinden farkı şartı sağlasada sağlamasada birkere çalışmasıdır ilk önce do nun içindeki
satırları çalıştırır ondan sonra while ın şartını sağlıyorsa sağlamayana kadar dönmeye devam eder

burada yapacağımız işlemde girilen sayının rakamlarının toplamlarını verecek. bunun içinde do while döngümüzde girilen sayıyı
10 a bölümümden kalanları  bir toplam değişkeninde her döndüğünde üst üste eklenirken aynı zamanda girlen sayıyı ona bölerek
basamak düşültüp girilen sayının değişkenine eşitleyerek her döndüğünde bir basamağın yok olması sağlanıyor

burada number en sonki dönüşünde 12 yazdık mesela en sonki dönüşünde 0,2 oluyor ama biz inticer olarak aldığımız için değeri
0 olarak çıkıyor

 */

Scanner entry= new  Scanner (System.in);

System.out.print("rakamlarının toplanmasını istediğiniz sayıyı giriniz== ");
int number= entry.nextInt();
int total=0;

do{
    total += number%10;
    number /=10;

    System.out.println("sayı  "+number+"  total= "+total);
}
while(number>=1);
System.out.println("girdiğiniz sayının rakamları toplamı= "+ total);
System.out.println("number"+number);



    }
}
