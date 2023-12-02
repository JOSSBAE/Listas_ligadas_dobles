
public class Lista {
    private Node top;

    Lista() { 
        top = null;
    }

    // Agregar un nodo antes del ultimo
    public void add(String data) {
        Node temp = new Node();
        temp.data = data;
        if (top == null) {
            top = temp;
        } else {
            temp.next = top;
            top = temp;
        }
    }

    // Intercambiar un nodo por otro buscado por su data
    public void swap(String data1, String data2) {
        Node temp = top;
        Node temp1 = null;
        Node temp2 = null;
        while (temp != null) {
            if (temp.data.equals(data1)) {
                temp1 = temp;
            }
            if (temp.data.equals(data2)) {
                temp2 = temp;
            }
            temp = temp.next;
        }
        if (temp1 != null && temp2 != null) {
            String aux = temp1.data;
            temp1.data = temp2.data;
            temp2.data = aux;
        }
    }

    // Buscar un nodo por su posición, enumerando el prmero con la posición 0, el
    // siguiente como el 1, etc. y devolver una referencia a él.
    public Node search(int pos) {
        Node temp = top;
        int i = 0;
        while (temp != null) {
            if (i == pos) {
                return temp;
            }
            temp = temp.next;
            i++;
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "";
        Node temp = top;
        while (temp != null) {
            s += temp.data + " ";
            temp = temp.next;
        }
        return s;
    }

}