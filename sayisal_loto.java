import java.util.Random;
import java.util.Scanner;

public class sayisal_loto {
    public static void main(String[] args) {

        Random random= new Random();
        Scanner entry = new Scanner(System.in);
        /*
        int rastgele1 =random.nextInt((30-15)+15);
        int rastgele2 =random.nextInt((45-30)+30);
        int rastgele3 =random.nextInt((60-45)+45);
        int rastgele4 =random.nextInt((75-60)+60);
        int rastgele5 =random.nextInt((100-75)+75);

        */
        int[] dizi= new int[6];



            for (int i = 0; i < dizi.length; ++i) {

                dizi[i] = random.nextInt(100);
            }
                for (int s=0; s < 6 ;++s){
                    if (dizi[5]==dizi[s]) dizi[5]=random.nextInt(100);
                    else if (dizi[4]==dizi[s]) dizi[4]=random.nextInt(100);
                    else if (dizi[3]==dizi[s]) dizi[3]=random.nextInt(100);
                    else if (dizi[2]==dizi[s]) dizi[2]=random.nextInt(100);
                    else if (dizi[1]==dizi[s]) dizi[1]=random.nextInt(100);
                    else if (dizi[0]==dizi[s]) dizi[0]=random.nextInt(100);
                }

                System.out.println("kura ile belirlenecek 6 kolon için 19 kolon tahmin hakkınız var kaç adet tahminde bulunacaksınız giriniz");
                System.out.print("==");
                int number_request = entry.nextInt();
                while (!(number_request>0 && number_request<20)) {
                    System.out.println("adam akıllı sayı gir");
                    number_request = entry.nextInt();

                }

                int truee[]= new int[19];

                for (int x=0;x<number_request;++x){



                    System.out.println(x+1+". sayıyı giriniz");
                    int number= entry.nextInt();



                    if (number==dizi[5] || number==dizi[4] || number==dizi[3] || number==dizi[2] || number==dizi[1] || number==dizi[0]){
                        truee[x]=number;


                    }


                }


            System.out.println("Kura sonuçları 6 kolon rakamları şöyledir_______");
        System.out.println("__________________________________________");
        for (int a=0;a<dizi.length;a++){
            System.out.print(dizi[a]+"   ");
        }


        int b=0;
        System.out.println("");
        System.out.println("Tahminlerinizin sonucu_______");
        System.out.println("__________________________________________");
        for (int a=0;a<dizi.length;a++){
            if (truee[a]>0) {
                System.out.println(truee[a]+"  DOĞRU BİLDİNİZ TEBRİKLER       ");

                b++;
            }


        }
        if (b==0) System.out.println("0    Bari birtane bilseydin be");




    }
}
