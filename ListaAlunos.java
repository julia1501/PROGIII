import java.util.ArrayList;
import java.util.Iterator;

public class ListaAlunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>();

        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carla");
        alunos.add("Diego");
        alunos.add("Elisa");

        System.out.println("Lista original:");
        Iterator<String> i = alunos.iterator();
        while (i.hasNext()) {
            String nome = i.next();
            System.out.println(nome);
        }

        alunos.remove("Bruno");

        System.out.println("\nLista após remover 'Bruno':");
        Iterator<String> i2 = alunos.iterator();
        while (i2.hasNext()) {
            String nome = i2.next();
            System.out.println(nome);
        }
    }
}
