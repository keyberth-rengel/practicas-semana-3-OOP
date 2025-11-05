package eduardo;

import java.util.ArrayList;
import java.util.List;

/// Ejercicio 3: Uso de colecciones con ArrayList<String>.
/// - Agrega 5 nombres, los imprime, elimina el tercero y vuelve a imprimir.
public class Q3_ArrayListStudents {

    public static void main(String[] args) {
        System.out.println("=== Collections (ArrayList) ===");

        // Crear un ArrayList de nombres de estudiantes
        List<String> students = new ArrayList<>();

        // Agregar al menos 5 nombres
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Edward");

        System.out.println("Full list of students:");
        for (String name : students) {
            System.out.println("- " + name);
        }

        // Eliminar el tercer nombre (índice 2)
        if (students.size() >= 3) {
            System.out.println("\nRemoving the third student: " + students.get(2));
            students.remove(2);
        }

        System.out.println("\nList after removing the third student:");
        for (String name : students) {
            System.out.println("- " + name);
        }
    }
}