import okul.islem_nesnesi;

import java.util.ArrayList;


    /*
     Bir nesnenin özelliklerinden bahsederken ingilizce felds özellik kullnılıyor
    bierde bu nesnenin değişik işlevleri bulunuyor yani methodları oluyor
    istediğimiz kadar nesne üretmek istersek bu nesneye atanacak özellikleri ve işlevleri
    class larımızda tanımlıyoruz ve classlar ımızla obje ürettiğimizde bu class ın içinde tanımladığımız özellikler
    ve methodlar aynı şekilde kalıyorlar.
    main methodunun çalıştırılabilir bir java projesinin içinde mutlaka olması gerekiyor ama biz çalıştırılabilir bir
    java projesi değilde bir back up kütüphane oluşturmak istiyorsak main methodunun bulunmasına gerek olmuyor

    ben bir class tanımladım nesnemin özelliklerini herşeyi yazdım daha sonra başka bir class da projede bu classın
    özelliklerine değer atayabildim tanımlanan clası bir objeye atıyoruz
    class_ismi Obje_ismi= new class_ismi;
    arık bu obje üzernden tanımlanan classın içindeki istediğimiz özelliği methoda ulaşabilir içine yeni değerler
    farklı tanımlamalar yapabiliriz.
    objenin_ismi.istenilen_method_ya_da_özellik = Değer ;

    peki classların içinde tanımladığımız özellikleri ve methodları tanımlarken public kullandık ve başka bir class
    üzerinden direk ulaşabildik public bir acses modifire yani bir erişim belirleyicisi ve public olursa istediğim
    başka bir classta hertaraftan erişilebildiği anlamına gelir. eğer privet olsaydı sadece tanımladığımız calassdan
    erişilebilirdi.privite alanlarda sadece tanımladığımız class larda erişebiliyoruz.

    privite bir alana dışardan erişmek için public bir fonksiyon yazıyoruz parametresine erişmek istediğim değeri yazıyoruz bunun gibi

    prtivate String color;

    public void setColor(String color){
        color=color;
    }

    fakat program bize bunun hiçbir anlamı olmadığını söylüyor ikitane color değişkeni var hangisi olduğu belli değil
    this kullanıyoruz bu objenin içindeki color ı color a ata ve herkese erişilebilir bir fonksiyoniçinde kullanılabilsin

public void setColor(String color){
        this.color=color;
    }

    aslında biz normalde olan bir değeri public bir fonksiyonda parametre vererek dolaylı yoldan dışarda kullanılmasını sağlıyoruz
    ve bunların ayırd edilebilmesi için get ve set isimlerini kullanıyoruz set yazmak için değiştirmek set etmek için get de ise
    return ederek sadece o değeri getColor deyince onun için döndürüyor ve sadece kullanabilyor. bu değişkenleri de kontrol edebiliyoruz
    bu kontrolede get set fonksiyonlarına da ecapsulation kapsülleme deniyor.

    public String getColor(){
        return this.color;
        }

                                                   Consturactorlar Konusu
    nesne oluşturulurken mainde yazarken tek tek her değeri belirtmek her seferinde yazmak obje.color="kırımızı";
    obje.malzeme="sunta"; gibi tek tek belirtmek sajma oluyor bunu engellememizi sağlayan şey ise constractor method yapıcı method
    bu method public olup bizim objemizle class ismimizle aynı olması lazım ve tanımlanan değerlei bu constractora parametre olarak
    tanımlıyoruz veri tipini belirterek bu clastaki değerlerin anlaşılması içinde this.color =color; gibi belirtiyoruz

    public class islem_nesnesi {

        public String isim;
        public String soyisim;
        public int oturum_suresi;
        public int offline_down;

        public islem_nesnesi(String isim,String soyisim,int oturum_suresi,int offline_down){
        this.isim=isim;
        this.soyisim=soyisim;
        this.oturum_suresi=oturum_suresi;
        this.offline_down=offline_down;
    }
    }

    gibi olması gerekiyor main içinde objede kullanırkende objeyi değişkene nesneye tanımlarken direk belirtebiliyoruz.
    islem_nesnesi adam = new islem_nesnesi("ahmet","doğan",5,2);

    değer atamadan hiç bir parametreyi yazmayarak var sayılan değerler atayarak boş parametreli bir alan oluşturaniliriz

    public islem_nesnesi(){
        this.isim="isim yok";
        this.soyisim="soyisim yok ";
        this.offline_down=0;
        this.oturum_suresi=0;
    }

    burada ise başka bir boyuta geçiliyor constractorlar arası paslaşılabiliyor biz bir constractor oluşrurduk parametrelerini verdik
    obje oluşrutulurken giriliyor parametrelerin içindeki değereler değişkenlere atanıyor birde boş parametreli bir constractor
    oluşturduk hiç bir değer girilmediğinde var sayılan olarak bazı değerleri verecek yukarıdaki gibi. şöyle bir olay var biz bu
    parametresiz oluşturduğumuz constractoru parametreli olan constractora atıf yaparak this kullanarak
    o constractorun parametrelerini girerek de atayabiliriz

    public islem_nesnesi(){
        this("isim Yok","soyisim yok",0,0)
    }

    böyle böyle her durum için her eksik girilen parametre için varsayılan değerler oluşturulabilir orada da girilen parametreler
    belirtiliyor fonksiyonda aşağıda this de çağrlılırken yine parametre değişkenlerinin isimleriyle yazılıp yazılmayan değerleinki
    farklı istenen değereler yazılabiliyor.
    mesela aşağıda isim soyismi tanımlanırken belirtilmiş bir objenin tanımlanmayan oturum süresi ile offline süresi 0 oluyor

    public islem_nesnesi(String isim,String soyisim){
        this(isim,"soyisim",0,0)
    }

    main in içinde yazarsak
    islem_nesnesi isim_soyisim= new islem_nesnesi("hasan","başş");

        Static fonksiyon ya da değişkenler classtan nesne oluştrmadan direkt class ismi üzerinden erişmemizi sağlar
        değişkeni ya da methodu tanımlarken erişim belirleyiciden sonra statici yazıyoruz.Daha sonra başka bir dosyadan
        direk istediğimiz gibi bir nesne oluşturmak zorunda kalmadan class_ismi.değer=istenen_değer gibi belirtilebiliyor


    RECURSİVE fonksiyon YAKLAŞIMI
    methodun kullanım yaklaşımıdır ayrı bir tür değildir kullanım farklılığıdır.
    Kendi içerisinde kendisini çağıran/tetikleyen fonksiyonlardır. Öz yinelemeli fonksiyon da denir. öngörülemeyen ,
    derinliği tahmin edilemeyen , sonu bilinmeyen durumlarda tercih edilir.

    fonksiyonun içinde kendini çağırdığında kendisini çağırdığı koddan itibaren diğer satırları çağıramıyor çünkü
    tekrardan kendini tetikliyor. herhangi bir kontrol sağlıyacaksak herhangi bir karşılaştırma yapacasak parametreden
    yola çıkacağız aşağıdaki gibi

    public void x (int i=1){


        System.out.println("merhaba");
        if (i<3){
            x(++i);
        }
        System.out.println("kardeş");
    }




                                             R E F E R A N S L A R
    Normal olarak bir obje tanımlayıp bu objeyi başka bir değişkene atayarak bilgisayarda iki tane aynı gösterilen
    class kadar yer kaplayan aynı özellikleri olan obje nesne oluyor

    public static void main(String[] args){
        islem_nesnesi adam = new islem_nesnesi("ahmet","doğan",5,2);

        islem_nesnesi adam1 = adam;

    biz [islem_nesnesi adam2; ] dersek adam2 oluşuyor ama herhandi bir yeri referans göstermedeiği için java ne olduğunu
    anlayamıyor bunun için bir referans = new islem_nesnesi(); gibi oluşturduğu alana bir yol belirtmeliyiz ister başka
    bir objeyi referans oluşturalım ister classımızı

    birde null referansımız var bu da bellekte boş bir yeri gösteriyor demek oluyor herhandi bir obje class yok boş alanı
    gösteriyor

    islem_nesnesi adam3 = null;

    biz normal bir string ifade tanımlarken bu şekilde tanımlıyorduk
    String ad
    ama bunu String classı ile tanımlarsak bir obje oluşturyoruz

    String ad = new String ("mustafa");
    String ad2 = new String ("mustafa");
    if(ad == ad2){
        System.out.println("eşit");
    }
    else{
        System.out.println("eşit değil");
    }

    dersek bize eşit değil dönderecek bunun sebebide aslında karşılaştırma yapılırken bu iki değer birer obje oldukları
    için ikiside farklı farklı bölümlerde aynı referansın özelliklerini barındıran alanları karşılaştırıyoruz bu yüzden
    eşit olmuyorlar ama içindeki değerleri karşılaştırmak isterse ad == ad2 yerine ad.equals(ad2) diyerek ikisinin içindeki
    değişkenler karşılaştırılır

                                                   A R R A Y L İ S T L E R
    araylist aslında bir class ve bu classın methodlaı ile işler kolaylaştırılmış araylist tanımlarken normal obje
    tanımlar gibi araylist<veri tipi> iki parantezin içine veri tipini  sonra atanacak olan aray listin ismi en sonda
    referansoı yani araylisti yazıyoruz

    ArrayList<String> groups = new ArrayList<String>();


    bu araylistimizi bir değer eklemek istersek add methodu ile ekleyebiliriz normal araylerde olduğu gibi sayısl sıralama
    0 dan başlayarak gidiyor

    groups.add("Hamidiye");


    değerleri almak içinde get metgodu ile aray numarasını vererek sadece çağırabiliyoruz

    groups.get(0);

    uzunluğunu öğrenmek için de groups.size() yapabiliriz ve kaç elemanlı olduğunu görebiliriz



    istediğimiz değeri silmek içinde kullanabileceğimiz renove methodu iki veri tipi alabiliyoru buna overloding yapmışlar
    hem direk değeri objeyi yazabiliriz ahmeti bul sil diye hem de aray numarasını verebiliriz
    groups.remove("hamidiye");

    bir değein aray numarasını öğrenmek için ise indexOf() methodu kullanılıyor groups.indexOf("hamidiye"); ve daha çok
    methodu ihtiyaç dahilinde aratırılabilir



    burada yine referans konusuna kayıyıoruz o da normal String bir değişkeni tanımlarken bir değer belirtiyor
    referansı bir değer oluyor bu nedenle başka bir değişkene de aynı değer verirsem ben karşılaştırma yapınca eşit
    true sonucunu alırım çünkü büradaki iki gösterilen referansada ortak bir değer fakat bunlar değer değilde
    bir class olsalardı ayrı ayrı bir yerleri temsil ettikleri için herhangi bir şekilde eşit olamayacakları için
    false değerini görecektik

    burada string tanımlanmış bir ifadenin herhangi bir harfini .charAt() ile dizin numarası ile çağırabiliyoruz
    string ifade nin harf karakter uzunluğunu da .lenght() ile inticer bir uzunluk verir bize . örnekteki gib son karakter
    ad.charAt(ad.lenght()-1);

                                           İ N H E R İ T A N C E (Kalıtım)
    ortak özellikleri olan sınıfları classları birbirine bağlayarak çok daha optimize çalışan dosyalar elde edebiliriz
    alttaki klaslar tüm field ları miras alırlar bu mirası veren super ya da base class deniyor altaki miras alanlar ise
    sub class ya da drive class deniyor
    bunları tanımlarken sadece kalıtımı alacak olan class ın yanına extends dosyanın_ismini yazıyoruz bunu kalıtımı alacak
    tüm dosyalara yapıyoruz
    eğer miras aldığımız class da bir constractor var ise bunu da miras almış oluyoruz ve bu constractor u tanımlamak
     zorundayız yok ise hata alıyoruz. burada biz de kendi class ismimizle bir constractor oluşturuyoruz değişkenlerin
     isimleri veri tipleri aynı olacak biçimde daha sonra diğer constracro ı çağırmamız gerekiyor onuda biz bu xonstractoru
     super class dan aldığğımız için super ile çağırabiliriz ve üstten aldığımız constractorlar eşitlemiş oluyoruz
     public class özellikler extends üst_özellikler {
     public Manager (mirasın içindeki constractorların aynı veri tipi değişkenler){
        super(değişkenlerin hepsi);

     }
     }

                              Kalıtımda Ekstra Özellikler ve Methodlar eklemek

    private baba(String memleket,int yas,String hastaliklari){
        this.memleket=memleket;
        this.yas=yas;
        this.hastaliklari=hastaliklari;
    }
    }

    private class soon extends baba{
        String okulu="odtü ";
        private soon(String memleket,int yas,String hastaliklari,String okulu){
            super(memleket,yas,hastaliklari);
            this.okulu=okulu;
        }
    }

    Örnekte olduğu gibi inheritance den gelen constractor ları tanımladım alt kulasımızla aynı isimde olarak
    parametrelerin tipini de aynı şekilde sonra super ile belirttim aynı parametrelere eşdeğer olduklarına
    ve ayriyetten yeni ekleyeceğim okuluda paramedrede belirttim ama superin içine yazmadım çünnkü üst
    sınıfımızla bir işimiz yok ayriyetten bu sınıfa özel olarak tanımlıyorum bunu


                                                O V E R R İ D E
    üst class ımızdan aldığımız herhangi bir methodu tekrardan tanımlayabilir ve ek olarak bir özellik ekleyebiliriz
    ya da istersek fonksiyonun sadece ismi aynı olur geriye kalan herşeyini değiştiririz.
    override yaparken alt class da tamamen aynı şekilde tanımlıyoruz methodu eğer özellikleri üst classla aynı olsun
    üzeine ekleyelim istiyorsak
    super.fonksiyonun_ismi();
    yazıyoruz.

        private class baba{
        private String  memleket="Arguvan";
        private int yas=35;
        private String hastaliklari="koah";

    private baba(String memleket,int yas,String hastaliklari){
        this.memleket=memleket;
        this.yas=yas;
        this.hastaliklari=hastaliklari;
    }

    private void yazdir(){
        System.out.println("memleket"+memleket);
        System.out.println("yaş"+yas);
        System.out.println("hastalıklar"+hastaliklari);
    }

    }

    private class soon extends baba{
        String okulu="odtü ";
        private soon(String memleket,int yas,String hastaliklari,String okulu){
            super(memleket,yas,hastaliklari);
            this.okulu=okulu;
        }
        private void yazdir(){
            super.yazdir();
            System.out.println("okulu"+okulu);
        }
    }

                                        Object Sınıfı ve toString
    Biz herhangi bir değişken ya da method oluşturken defould olarak belli objeler yüklenerek geliyor .equals gibi
    toString gibi biz bir classı yazdıracağımız zaman direk olarak toString ile yazdırıyor
            System.out.println(baba);
    dersek garip ifadelerde yazdıracak yanında. yazdıracağımız classımızın içinde sağ tık yapınca source de oberride/implement
    methodu nun içinde istediğimziz methodları override edebiliriz toString komutuna istediğiz özelliği atayarak classı
    yazdırdığında başka birşeyler yazdırabilri

                                   P O L Y M O R P H İ S M (çok biçimlilik)




    */

    class Animal{
        private String name;

        public Animal(String name){
        this.name=name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void speak(){
            System.out.println("hayvan konuşuyor....");
        }
    }

    class Dog extends Animal{
        public Dog(String name){
            super( name);
        }
        public void speak(){
            System.out.println(getName()+"havlıyor...");
        }

    }

    class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        @Override
        public void speak() {
            System.out.println(getName() + "ötüyor...");
        }
    }
        class horse extends Animal{

        public horse(String name) {
            super(name);
        }

        @Override
        public void speak() {
            System.out.println(getName()+"kişniyor ...");
        }
    }
class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+"kişniyor ...");
    }
}



        public class classlar_oop {
            private static void speaktry(Animal animal){
                animal.speak();
                //eğer animal.speak(); tanımlarsak biz bu methodu istediğim alt nesnelerde kullanabiliriz tek tek yazmak
                //zorunda kalmayacağız direk istediğiz gibi sadece içine referansımızı yazıp constracrorunu tanımlayacağız

            }


        public static void main(String[] args) {
        Animal animal= new Animal("hayvan");
        Bird bird= new Bird("maviş");
        Horse horse= new Horse("düldül");
        Dog dog= new Dog("kurt");

        /*animal.speak();
        bird.speak();
        horse.speak();
        dog.speak();*/

        //biz burda animal objemize referans olarak bir alt class tanımlayabiliriz
            //Animal animal2=new horse("şimşek ");
            //animal2.speak();
        //peki ya bu polimorphisim ne işimize yarıyor diye soracaksak önceden yazdığımız bir kodu tekrar tekrar düzeltilmesini
        //engelliyor bu da bizim sürekliliğimizin bozulmamsını daha kararlı uygulamalar yapmamızı sağlıyor mesela alttaki
        //gibi bir fonksiyon tanımlayalım

            speaktry(new Bird("mavişşşşş "));

        }

    }