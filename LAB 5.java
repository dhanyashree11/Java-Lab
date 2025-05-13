package D_BM23AI058;
import java.util.Vector;
class product{
    String name;
    double price;
    String category;
    public product(String name,double price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

}
public class onlineshoppingmanager {
    private Vector<product> inventory;

    public onlineshoppingmanager() {
        inventory = new Vector<>();
    }

    public void addProduct(String name, double price, String category) {
        product prod = new product(name, price, category);
        inventory.add(prod);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }

    public void displayInventory() {
        System.out.println("\nintentory:");
        for (product prod : inventory) {
            System.out.println("name:" + prod.name + "\tprice:" + prod.price + "\tcategory:" + prod.category);
        }
    }

    public static void main(String[] args) {
        onlineshoppingmanager manager = new onlineshoppingmanager();
        manager.addProduct("laptop", 89000, "laptops");
        manager.addProduct("book", 80, "books");
        manager.displayInventory();
        manager.removeProduct("book");
        manager.displayInventory();
    }
}
