package Encapsulation;


public class Product {
    private int productId;
    private String productName;
    private int price;

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }
    public int getPrice() {
        return price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(int price) {
        if(price>=0){
            this.price = price;
        }
        else{
            System.out.println("invalid price");
        }
    }
}
