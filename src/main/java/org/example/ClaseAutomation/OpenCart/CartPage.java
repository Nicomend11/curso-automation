package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Page {

    private By selectProduct = By.xpath("//a[contains(@href, 'product_id=30') and text()='Canon EOS 5D']");
    private By nameCamera = By.xpath("//h1[text()='Canon EOS 5D']");
    private By selectOptions = By.xpath("//select[@name='option[226]' and @id='input-option226']");
    private By selectColor = By.xpath("//option[@value='16' and text()='Blue']");
    private By addToCartBtn = By.xpath("//button[@id='button-cart' and text()='Add to Cart']");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public boolean nombreCamara() {
        return isDisplayed(nameCamera);
    }
    public void seleccionarCamara() {
        click(this.selectProduct);
    }
    public void seleccionarOpciones() {
        click(this.selectOptions);
    }
    public void seleccionarColor() {
        click(this.selectColor);
    }
    public void agregarAlCarrito() {
        click(this.addToCartBtn);
    }
}
