package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa{
    public final String emailYazmaAlani = "txtUserName";
    public final String emailim = "ibrahim_nayman@hotmail.com";
    public final String GirisYapButton = "btnLogin";



    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }

}
