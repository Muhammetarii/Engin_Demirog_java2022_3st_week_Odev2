public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",3000,3,"Blue","L1");
       /* Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
       // System.out.println(product.name);*/

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getCod());
    }
}
