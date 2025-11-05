package nelver;

import java.util.ArrayList;
import java.util.List;

/// Ejercicio 4: Inventario sencillo con sobrecarga y validación.
/// - Métodos sobrecargados addProduct(...) con distintas firmas.
/// - Valida que price y quantity no sean negativos.
public class Q4_InventoryOverloading {

    public static void main(String[] args) {
        System.out.println("=== Inventory with Overloading and Validation ===");

        Inventory inventory = new Inventory();

        // Agregar productos usando diferentes métodos sobrecargados
        inventory.addProduct("Notebook");                 // solo nombre
        inventory.addProduct("Pencil", 0.5);              // nombre + precio
        inventory.addProduct("Backpack", 25.0, 10);       // nombre + precio + cantidad

        // Ejemplos con datos inválidos (precio o cantidad negativos)
        inventory.addProduct("InvalidProduct1", -10.0, 5);
        inventory.addProduct("InvalidProduct2", 5.0, -2);

        System.out.println("\nInventory products:");
        inventory.printProducts();
    }
}

/// Representa un producto del inventario.
class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name) {
        this(name, 0.0, 0);
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Representación textual simple del producto
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}

/// Maneja una lista de productos con métodos sobrecargados y validación básica.
class Inventory {
    private final List<Product> products = new ArrayList<>();

    // Sobrecarga: solo nombre
    public void addProduct(String name) {
        addProductInternal(name, 0.0, 0);
    }

    // Sobrecarga: nombre + precio
    public void addProduct(String name, double price) {
        addProductInternal(name, price, 0);
    }

    // Sobrecarga: nombre + precio + cantidad
    public void addProduct(String name, double price, int quantity) {
        addProductInternal(name, price, quantity);
    }

    // Método interno que realiza la validación y el agregado
    private void addProductInternal(String name, double price, int quantity) {
        if (price < 0 || quantity < 0) {
            System.out.println("Error: price and quantity must not be negative (product: " + name + ").");
            return;
        }
        products.add(new Product(name, price, quantity));
    }

    public void printProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
