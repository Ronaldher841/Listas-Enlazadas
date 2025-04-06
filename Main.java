//Alumno: Ronald Isaias Godinez Hernández
//Carne: 202402155
//Estructura de datos 1
//Inge: Brandon Chitay

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Creando lista desde el DPI...");
        System.out.println("Lista inicial del DPI:");

        // Paso 0: Insertar dígitos del DNI en la lista
        int[] dniNumeros = {3,0,3,1,0,8,9,2,4,0,1,0,8};
        for (int num : dniNumeros) {
            list.add(num);
        }
        list.printList();

        // Paso 1: Agregar 1 al inicio
        System.out.println("1. Agregar número 1 al inicio");
        list.addFirst(1);
        list.printList();

        // Paso 2: Agregar 3 al final
        System.out.println("2. Agregar número 3 al final");
        list.add(3);
        list.printList();

        // Paso 3: Agregar 5 en la posición 1
        System.out.println("3. Agregar número 5 en la posición 1");
        list.addMiddle(5, 1);
        list.printList();

        // Paso 4: Mostrar lista actual
        System.out.println("4. Mostrar lista actual:");
        list.printList();

        // Paso 5: Eliminar el número 3 (el que agregamos al final)
        System.out.println("5. Remover el número 3 que agregamos");
        list.remove(3);

        // Paso 6: Lista después de la eliminación
        System.out.println("6. Lista después de la eliminación:");
        list.printList();

        // Paso 7: Agregar número 7 al final
        System.out.println("7. Agregar número 7 al final");
        list.add(7);
        list.printList();

        // Paso 8: Verificar si contiene el número 5
        System.out.println("8. ¿Contiene el número 5?");
        System.out.println("Resultado: " + list.contains(5));

        // Paso 9: Verificar si contiene el número 9
        System.out.println("9. ¿Contiene el número 9?");
        System.out.println("Resultado: " + list.contains(9));

        // Paso 10: Revertir la lista
        System.out.println("10. Revertir la lista");
        list.reverse();

        // Paso 11: Mostrar lista después de revertir
        System.out.println("11. Lista después de revertir:");
        list.printList();

        // Paso 12: Agregar número 9 al inicio
        System.out.println("12. Agregar número 9 al inicio");
        list.addFirst(9);

        // Paso 13: Lista final
        System.out.println("13. Lista final:");
        list.printList();
    }
}
