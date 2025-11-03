class Product {
    int productID;
    String pName;
    double price;
    int quantity;

    void setProduct(int id, String name, double p, int q) {
        productID = id;
        pName = name;
        price = p;
        quantity = q;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + pName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setProduct(301, "Mouse", 500.0, 5);
        p.displayProduct();
    }
}
