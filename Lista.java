/*
 * Buscar un nodo por su posición, enumerando el prmero con la posición 0, el siguiente como el 1, 
 * etc. y devolver una referencia a él. 
 * Insertar un nuevo nodo antes del último.
 * Intercambiar un nodo por otro buscado.
 */
public class Lista {
    private Node top;
    private Node back;

    Lista() { 
        top = null;
        back = null;
    }

    //Agrega un nodo
    public void add(String data) {
        Node temp = new Node();
        temp.data = data;
        if (top == null) {
            top = temp;
            back = temp;
        } else {
            temp.next = top;
            top.back = temp;
            top = temp;
        }
    }
    //Agrega un nodo antes del ultimo
    public void addBeforeLast(String data) {
        Node temp = new Node();
        temp.data = data;
        if(top == null){
            top = temp;
            back = temp;
        }else{
            
            back.back.next = temp;
            temp.back = back.back;
            temp.next = back;
            back.back = temp;
            back = temp;
            
        }
    }
    //Intercambia un nodo por otro buscado
    public void swap(String data1,String data2){
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
        String result = "";
        Node temp = top;
        while (temp != null) {
            result += temp.data + " ";
            temp = temp.next;
        }
        return result;
    }

}