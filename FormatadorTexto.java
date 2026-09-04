public class FormatadorTexto {
    public static void main(String[] args) {
        String frase = "   Programação Orientada a Objetos com Java   ";

        // Remove espaços em branco do início e do fim
        String frasetratada = frase.trim();
        System.out.println("Frase tratada: " + frasetratada);

        // Quantidade total de caracteres da frase tratada
        System.out.println("Quantidade de caracteres: " + frasetratada.length());

        // Frase completamente em maiúsculas
        System.out.println("Frase em maiúsculas: " + frasetratada.toUpperCase());

        // Substitui "Java" por "Linguagem Java"
        String fraseSubstituida = frasetratada.replace("Java", "Linguagem Java");
        System.out.println("Frase com substituição: " + fraseSubstituida);

        // Caractere na posição de índice 5
        System.out.println("Caractere na posição 5: " + frasetratada.charAt(5));
    }
}
