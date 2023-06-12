package tests;

import Sayfalar.AnaSayfa;
import Sayfalar.GirisYapSayfasi;
import Sayfalar.SifreGirmeSayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;
    private SifreGirmeSayfasi sifreGirmeSayfasi;



    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        sifreGirmeSayfasi = new SifreGirmeSayfasi(driver);


    }
    @Test
    void hepsiburadaLoginTesti() throws InterruptedException{
        driver.get("https://www.hepsiburada.com/");
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.hesabim);
        anaSayfa.tusaBas(anaSayfa.hesabim); //GirisYapTiklandi
        Thread.sleep(5000);

        anaSayfa.tusaBas(anaSayfa.girisYap); //Acılan pencerede GirisYapTıklandi
        Thread.sleep(4000);

        girisYapSayfasi.tusaBas(girisYapSayfasi.emailYazmaAlani); //emailYazmaAlanına tıklandi
        Thread.sleep(3000);

        girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.emailYazmaAlani,girisYapSayfasi.emailim);//email yazıldı
        Thread.sleep(3000);
        girisYapSayfasi.tusaBas(girisYapSayfasi.GirisYapButton); //GirisYapbutonuna tıklandi
        Thread.sleep(4000);

        girisYapSayfasi.tusaBas(sifreGirmeSayfasi.emailSifreYazmaAlani);//SifreYazmaAlanına tıkladı
        Thread.sleep(3000);
        sifreGirmeSayfasi.alanaYaziYaz(sifreGirmeSayfasi.emailSifreYazmaAlani, sifreGirmeSayfasi.emailSifre);//Sifre yazıldı
        Thread.sleep(3000);


        sifreGirmeSayfasi.tusaBas(sifreGirmeSayfasi.SifreGirisButton); //SifreGirisButonuna tıklandi
        Thread.sleep(3000);


    }

    @AfterEach
    void tearDown(){
         driver.close();
    }

}



