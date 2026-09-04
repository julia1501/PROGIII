public class Contador {
    static int totalObjetos;

    Contador() {
        totalObjetos = totalObjetos + 1;
    }

    static void mostrarTotal() {
        System.out.println("Total de objetos criados: " + totalObjetos);
    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        Contador.mostrarTotal();
    }
}
