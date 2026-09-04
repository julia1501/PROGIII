import java.util.ArrayList;
import java.util.Iterator;

public class CadastroPessoa {

    static boolean validarNome(String nome) {
        if (nome == null) {
            return false;
        }
        if (nome.trim().isEmpty()) {
            return false;
        }
        if (nome.trim().length() < 3) {
            return false;
        }
        return true;
    }

    static boolean buscarUsuario(ArrayList<String> lista, String busca) {
        Iterator<String> i = lista.iterator();
        while (i.hasNext()) {
            String nome = i.next();
            if (nome.equalsIgnoreCase(busca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<String>();

        String[] candidatos = {"Ana", "Bruno", "Carla", "Diego"};

        for (String nome : candidatos) {
            if (CadastroPessoa.validarNome(nome)) {
                usuarios.add(nome);
            }
        }

        System.out.println("Usuários cadastrados:");
        Iterator<String> i = usuarios.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        String busca1 = "carla";
        String busca2 = "Roberto";

        System.out.println("------------------------");
        System.out.println("Buscando '" + busca1 + "': " + CadastroPessoa.buscarUsuario(usuarios, busca1));
        System.out.println("Buscando '" + busca2 + "': " + CadastroPessoa.buscarUsuario(usuarios, busca2));
    }
}
