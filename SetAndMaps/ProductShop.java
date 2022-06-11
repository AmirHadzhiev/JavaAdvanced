package SetAndMaps;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        //shop}, {product}, {price}".

         Scanner scanner = new Scanner(System.in);
         String imput = scanner.nextLine();
        Map<String, List<Product>> map = new TreeMap<>();
        while (!imput.equals("Revision")){
         String [] data = imput.split(", ");
         String shop = data[0];
         String product = data[1];
         double price = Double.parseDouble(data[2]);
            Product product1 = new Product(product,price);
            if (map.containsKey(shop)){
                map.get(shop).add(product1);

            } else {

                map.put(shop,new ArrayList<>());
                map.get(shop).add(product1);

            }



            imput =scanner.nextLine();
        }
        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
            System.out.printf("%s->%n",entry.getKey());
            for (Product product : entry.getValue()) {
                System.out.printf("Product: %s, Price: %.1f%n",product.product,product.getPrice());
                
            }

        }







    }
   public static class Product{
        String product;
        double price;

       public Product(String product, double price) {
           this.product = product;
           this.price = price;
       }

       public String getProduct() {
           return product;
       }

       public void setProduct(String product) {
           this.product = product;
       }

       public double getPrice() {
           return price;
       }

       public void setPrice(double price) {
           this.price = price;
       }
   }
}
