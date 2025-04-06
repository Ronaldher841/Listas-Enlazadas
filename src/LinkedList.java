// Clase LinkedList: contiene todos los métodos para manipular la lista
public class LinkedList {
    private Node head; // Nodo inicial (cabeza) de la lista

    // Constructor: inicia una lista vacía
    public LinkedList() {
        head = null;
    }

    // Método para agregar un nodo al final
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Método para agregar un nodo al inicio
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Apunta al actual primer nodo
        head = newNode;      // Ahora este nuevo nodo es el primero
    }

    // Método para agregar un nodo en una posición específica
    public void addMiddle(int data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Posición fuera de rango.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Método para eliminar el primer nodo que contiene el valor "data"
    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    // Método para imprimir todos los nodos en la lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(); // Salto de línea final
    }

    // Método para invertir el orden de la lista enlazada
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;   // Guardamos el siguiente nodo
            current.next = prev;   // Invertimos la dirección
            prev = current;        // Avanzamos prev y current
            current = next;
        }

        head = prev; // Nuevo inicio de la lista
    }

    // Método para verificar si un valor está presente en la lista
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }
}
