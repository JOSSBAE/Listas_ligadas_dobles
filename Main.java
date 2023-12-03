public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        
        System.out.println("Lista original: ");
        System.out.println(lista);
        lista.swap("A", "E");
        System.out.println("Lista con A y E intercambiados: ");
        System.out.println(lista);
        lista.swap("B", "D");
        System.out.println("Lista con B y D intercambiados: ");
        System.out.println(lista);
        lista.swap("A", "C");
        System.out.println("Lista con A y C intercambiados: ");
        System.out.println(lista);
        System.out.println("Buscando por posición: ");
        System.out.println(lista.search(0).data);
        System.out.println(lista.search(1).data);
        System.out.println(lista.search(2).data);
        System.out.println(lista.search(3).data);
        System.out.println(lista.search(4).data);
        System.out.println("Agregando antes del último: ");
        lista.addBeforeLast("F");
        System.out.println(lista);
    }
}