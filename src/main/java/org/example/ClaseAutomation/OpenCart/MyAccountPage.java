package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends Page {

    private By title = By.xpath("//h2[text()='My Account']");
    private By alertAccount = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    private By alertAccountEmail = By.xpath("//div[@class='text-danger']");
    private By titleCameras = By.xpath("//h2[text()='Cameras']");
    private By titleDeseos = By.xpath("//h2[text()='Account']");
    private By camerasBtn = By.xpath("//a[text()='Cameras']");
    private By favoriteHeartBtn = By.xpath("//button[contains(@onclick, \"wishlist.add('30')\")]");
    private By listaDeseos = By.xpath("//i[@class='fa fa-heart']");
    private By productName = By.xpath("//td[@class='text-left' and text()='Product 3']");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean tituloEsVisible() {
        return isDisplayed(title);
    }
    public boolean mensajeDeErrorEsVisible2() {
        return isDisplayed(alertAccount);
    }
    public boolean mensajeDeErrorEmail() {
        return isDisplayed(alertAccountEmail);
    }
    public boolean tituloCameraVisible() {
        return isDisplayed(titleCameras);
    }
    public boolean tituloListaDeseos() {
        return isDisplayed(listaDeseos);
    }
    public boolean nombreProducto() {
        return isDisplayed(productName);
    }
    public void accederACameras() {
        click(this.camerasBtn);
    }
    public void agregarAFavorites() {
        click(this.favoriteHeartBtn);
    }
    public void ingresarAListaDeseos() {
        click(this.listaDeseos);
    }

}