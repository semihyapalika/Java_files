import java.util.Scanner;

public class siparisss {
    public static void main(String[] args){
        Scanner entry =new Scanner(System.in);


        int [][]y_fiyat={{85,50,60,90,60},{55,50,30,30,40},{20,10,15,15,10},{20,25,30,20,40}};
        String [][]y_isim={{"KUZU TANDIR","KAVURMA    ","PATLICAN TAVA","KAĞIT KEBABI","DOMATESLİ KAVURMA"},{"DÜĞÜN ÇORBASI","YUVALAMA ÇORBASI","EZOGELİN ÇORBASI","MERCİMEK ÇORBASI","TARHANA ÇORBASI"}, {"KOLA    ","AYRAN    ","ŞALGAM    ","ACILI AYRAN ","MEYVE SUYU "}, {"TAŞ KADAYIF","TEL KADAYIF","MUHALLEBİ  ","ŞÖBİYET    ","BAKLAVA    "}};

        int []fiyat=new int[20];
        String []isim=new String[20];

        int total=0;
        int value=0;



        System.out.println("                   Lokantamıza hoş geldiniz ");
        System.out.println("----------------------------------------------------------------");

        while (true) {
            System.out.println("----------------------------------------------------------------");

            System.out.println("         Yemek menüsü için 1 e basınız  ");
            System.out.println("         Çorba menüsü için 2 e basınız  ");
            System.out.println("         İçecek menüsü için 3 e basınız ");
            System.out.println("         Tatlı menüsü için 4 e basınız ");
            if (value>0){
                System.out.println("         ADİSYON İÇİN '0' A BASINIZ");
            }
            System.out.print("---------");

            int ycit = entry.nextInt();
            if (ycit==0) break;




            switch (ycit) {

                case 1:
                    System.out.println("         ---------------------------------------------------------");
                    System.out.println("         ANA MENÜYE DÖNMEK İÇİN '6' BASINIZ SİPARİŞ VERMEK İÇİN YEMEK NUMARASINI YAZMANIZ YETERLİ ");
                    System.out.println("                          1.Kuzu tandır = 85TL");
                    System.out.println("                          2.KAVURMA = 50TL");
                    System.out.println("                          3.PATLICAN TAVA = 60TL");
                    System.out.println("                          4.KAĞIT KEBABI = 90TL");
                    System.out.println("                          5.DOMATESLİ KAVURMA = 60TL");
                    System.out.print("                          SEÇİMİNİZ ==");

                    int choice=entry.nextInt();
                    if (choice==6) ycit=6;
                    else{
                        fiyat[value]=y_fiyat[0][choice-1];
                        isim[value]=y_isim[0][choice-1];
                        value++;
                    }                    break;
                case 2:
                    System.out.println("         ---------------------------------------------------------");
                    System.out.println("         ANA MENÜYE DÖNMEK İÇİN '6' BASINIZ SİPARİŞ VERMEK İÇİN YEMEK NUMARASINI YAZMANIZ YETERLİ ");
                    System.out.println("                          1.DÜĞÜN ÇORBASI = 55TL");
                    System.out.println("                          2.YUVALAMA ÇORBASI = 50TL");
                    System.out.println("                          3.EZOGELİN ÇORBASI = 30TL");
                    System.out.println("                          4.MERCİMEK ÇORBASI = 30TL");
                    System.out.println("                          5.TARHANA = 40TL");
                    System.out.print("                          SEÇİMİNİZ ==");
                    choice=entry.nextInt();

                    if (choice==6) ycit=6;

                    else{
                        fiyat[value]=y_fiyat[1][choice-1];
                        isim[value]=y_isim[1][choice-1];
                        value++;
                    }
                    break;

                case 3:
                    System.out.println("         ---------------------------------------------------------");
                    System.out.println("         ANA MENÜYE DÖNMEK İÇİN '6' BASINIZ SİPARİŞ VERMEK İÇİN YEMEK NUMARASINI YAZMANIZ YETERLİ ");
                    System.out.println("                          1.KOLA = 20TL");
                    System.out.println("                          2.AYRAN = 10TL");
                    System.out.println("                          3.ŞALGAM = 15TL");
                    System.out.println("                          4.ACILI AYRAN = 15TL");
                    System.out.println("                          5.MEYVE SUYU = 10TL");
                    System.out.print("                          SEÇİMİNİZ ==");

                    choice=entry.nextInt();

                    if (choice==6) ycit=6;

                    else{
                        fiyat[value]=y_fiyat[2][choice-1];
                        isim[value]=y_isim[2][choice-1];
                        value++;
                    }
                    break;


                case 4:
                    System.out.println("         ---------------------------------------------------------");
                    System.out.println("         ANA MENÜYE DÖNMEK İÇİN '6' BASINIZ SİPARİŞ VERMEK İÇİN YEMEK NUMARASINI YAZMANIZ YETERLİ ");
                    System.out.println("                          1.TAŞ KADAYIF = 20TL");
                    System.out.println("                          2.TEL KADAYIF = 25TL");
                    System.out.println("                          3.MUHALLEBİ = 30TL");
                    System.out.println("                          4.ŞÖBİYET = 20TL");
                    System.out.println("                          5.BAKLAVA = 40TL");
                    System.out.print("                          SEÇİMİNİZ ==");

                    choice=entry.nextInt();

                    if (choice==6) ycit=6;

                    else{
                        fiyat[value]=y_fiyat[3][choice-1];
                        isim[value]=y_isim[3][choice-1];
                        value++;
                    }

                    break;

                case 6:

                    continue;



            }



        }

        System.out.println("         ********************************************");

        System.out.println("                       AFİYET OLSUN");
        System.out.println("         ÜRÜNLER                      FİYATLAR        ");

        for (value--;value>=0;value--){
            System.out.println("         " + isim[value] + "                    " + fiyat[value]);
            total += fiyat[value];
        }

        System.out.print("         TOPLAM TUTAR =                   "+total);




    }
}
