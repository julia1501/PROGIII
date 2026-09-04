public class NumerosPrimos {
    public static void main(String[] args) {
        int inicio = 1;
        int fim = 50;

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int numero = inicio; numero <= fim; numero++) {
            boolean primo = true;

            if (numero < 2) {
                primo = false;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }
    }
}
