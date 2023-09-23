package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Page {

    private By selectProduct = By.xpath("//a[contains(@href, 'product_id=30') and text()='Canon EOS 5D']");
    private By nameCamera = By.xpath("//h1[text()='Canon EOS 5D']");
    private By selectOptions = By.xpath("//select[@name='option[226]']");
    private By selectColor = By.xpath("//option[@value='16']");
    private By addToCartBtn = By.xpath("//button[@id='button-cart']");
    private By shoppingCartBtn = By.xpath ("//button[contains(@class, 'btn-inverse')]");
    private By viewCartBtn = By.xpath("//strong[contains(text(), 'View Cart')]");
    private By existsProduct = By.xpath("//td[@class='text-left' and text()='Product 3']");
    private By shoppCartBtn = By.xpath("//a[contains(@href, 'route=checkout/cart') and contains(@title, 'Shopping Cart')]");
    private By removeBtn = By.xpath("//i[@class='fa fa-times-circle']");
    private By emptyMessage = By.xpath("//p[text()='Your shopping cart is empty!']");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public boolean nombreCamara() {
        return isDisplayed(nameCamera);
    }
    public boolean existeUnProucto() {
        return isDisplayed(existsProduct);
    }
    public boolean mensajeCarritoVacio() {
        return isDisplayed(emptyMessage);
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
    public void accederCarrito() {
        click(this.shoppCartBtn);
    }
    public void removerProducto() {
        click(this.removeBtn);
    }
}
