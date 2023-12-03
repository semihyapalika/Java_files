import java.util.Scanner;

public class while_dongusu {
    public static void main(String[] args){
/*wile föngüsünde bir koşul vardır ve bu koşul sağlanmayana kadar döngü dönmeye devam eder

döngü değişkeni
while (değişkeninin koşulu){
    işlem
    işlem
    değişkeni arttırma ya da azaltma

}
bununla girilen sayının faktöriyelini hesaplayan birşey yapalım ben üstüne ekleyerek sayı eksi girildiğinde de
bir döngüye sokmaya çalıştımda olmadı

 */

    Scanner entry= new Scanner (System.in);
    int factory=1;

    System.out.print("sayıyı giriniz=  ");
    int number = entry.nextInt();


    while (number >1){
    factory= number*factory;

    --number;


    }
    System.out.println("sonuç= "+ factory + "   sayı= "+ number);






    }
}
