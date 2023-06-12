package Sayfalar;

import org.openqa.selenium.WebDriver;

public class SifreGirmeSayfasi extends Sayfa{
    public final String emailSifreYazmaAlani = "txtPassword";
    public final String emailSifre = "123789Ccc1";
    public final String SifreGirisButton = "btnEmailSelect";
    public final String goz = "[fill='#FA3F3F']";
    public SifreGirmeSayfasi(WebDriver driver) {
        super(driver);
    }
}
