import java.nio.channels.SelectableChannel;
import java.util.Random;
import java.util.Scanner;

public class sayi_harf {
    public static void main(String[] args) {
        Random randoom= new Random();
        Scanner enty = new Scanner(System.in);

        //Doğru alfabe sırasının olduğu dizi
        String[] CHARECTER = {"a","b","c","d","e","f","g" ,"ğ" ,"h" ,"i" ,"ı","j","k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z"};


        String[] select_charecter= new String[10];
        int[] select_rdm= new int[10];


        for (int  i=0;i<10;i++){
            //rast gele sayıların üretildiği rdm değişkeni
            int rdm=randoom.nextInt(CHARECTER.length);

            //select_charecter[] dizisine tutulan rdm sayısına karşılık gelen harfler atılıyor
            select_charecter[i]=CHARECTER[rdm];

            //tutulan rast gele rakam select_rdm[] dizisine atılıyor
            select_rdm[i]=rdm;




            //tutulan sayıılara karşılık gelen harflerin tutuduğu dizi her i sayısında bir bir artarak yazılıyor
            System.out.print(select_charecter[i]+"  ");

        }

        System.out.println("  ");


        int deger;
        for (int i=0;i<select_rdm.length;i++){
            for (int j =0;j<select_rdm.length-1;j++){

                if (select_rdm[j]>select_rdm[j+1]){
                    deger = select_rdm[j];
                    select_rdm[j]=select_rdm[j+1];
                    select_rdm[j+1]=deger;

                }
            }


        }

        System.out.println("doğru sıralanmış harfler");
        for (int a=0;a<10;a++){
            System.out.print(CHARECTER[select_rdm[a]]+"  ");
        }




    }
}
