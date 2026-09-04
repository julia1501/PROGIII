public class OperacoesBasicas {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        int escolha = 1; // 1-soma, 2-subtração, 3-divisão, 4-multiplicação

        double resultado;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;
            case 3:
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                break;
            case 4:
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
