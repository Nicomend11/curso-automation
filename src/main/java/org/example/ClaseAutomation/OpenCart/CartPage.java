package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Page {

    private By selectProduct = By.xpath("//a[contains(@href, 'product_id=30') and contains(@href, 'route=product/product') and contains(@href, 'path=33') and text()='Canon EOS 5D']");
    private By nameCamera = By.xpath("//a[contains(@href, 'product_id=30') and text()='Canon EOS 5D']");
    private By selectOptions = By.xpath("//select[@name='option[226]' and @id='input-option226']");
    private By selectColor = By.xpath("//option[@value='16']");
    private By addToCartBtn = By.xpath("//button[@id='button-cart' and text()='Add to Cart']");
    private By shoppingCartBtn = By.xpath ("//button[contains(@class, 'btn-inverse') and contains(@class, 'btn-block') and contains(@class, 'btn-lg') and contains(@class, 'dropdown-toggle')]");
    private By viewCartBtn = By.xpath("//strong[contains(text(), 'View Cart') and i[@class='fa fa-shopping-cart']]");
    private By existsProduct = By.xpath("//td[@class='text-left' and a[contains(@href, 'product_id=30')] and small[text()='Select: Blue'] and small[contains(text(), 'Reward Points: 200')]]");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public boolean nombreCamara() {
        return isDisplayed(nameCamera);
    }
    public boolean existeUnProucto() {
        return isDisplayed(existsProduct);
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
    public void seleccionarCarrito() {
        click(this.shoppingCartBtn);
    }
    public void verCarrito() {
        click(this.viewCartBtn);
    }
}
