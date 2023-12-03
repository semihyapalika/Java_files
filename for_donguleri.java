public class for_donguleri {
    public static void main(String[] args){
/* for döngülerinde üç parametreyi yanına tanımlıyoruz. istenirse değişkenler döngüden öncede tanımlana bilir ama paramaetrenin yerine noktalı
virgülü gene koymalıyız ya da  tekrardan tanımlanmış değişkene değer atayabiliriz.

int i=0
for(int i=10;i<20;++i){
}

bir parametrede birden fazla değişkeni ya da değere tanımlayabilir, karşılaştırabiliriz.

for döngülerinin içinde başka for döngüleride oluşturabiliriz while döngülerinde while döngülerini, if in içinde for ya da while döngülerini
 oluşturabildiğimiz gibi.

 aşağıdaki çalışan orneklerde aynı işkemi yapan iki döngünün farklarını göreceğiz

    for (int i=0,j=0 ; i<10&&j<5 ; i+=2, ++j){
    System.out.println("i= "+i +"  j= "+j);
    }
 */

        for (int i=0;i<5;++i){
            for (int j=0;j<5;++j) {
                System.out.println("i= " + i + " j= " + j);
            }
        }



        int a=0,b=0;
        while (a<5){
            b=0;
            while (b < 5) {
                System.out.println("a= " + a + "  b= " + b);
                ++b;


            }
            System.out.println("a= "+a+"  b= "+b);

            ++a;
        }










/*
        int a=0,b=0;
        while (a<5){
        b=0;
            while (b < 5) {
                System.out.println("a= " + a + "  b= " + b);
                ++b;

        System.out.println("a= "+a+"  b= "+b);

        ++a;
        }
    }
        buada garip bir şey oldu yanlışlıkla 2.while ın içinde yaptım çıktı işlemini birincide yapacakken kırlangıcı yanlış koyduğumdan olmadı
        ve ikişer ikişer sıralı olarak artıyolar aslında böyle birşeyi yapmaya çalışsam düşünerek bulmakta zorlanabilirdim kalsın burada
 */




    }
}
