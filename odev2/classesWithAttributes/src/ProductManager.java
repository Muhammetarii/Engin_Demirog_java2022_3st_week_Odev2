public class ProductManager {
    public void add(Product product){
        //JDBC kodları ile veritabanına kaydedeceğiz.
        System.out.println("Ürün eklendi " + product.getName());
    }
}
