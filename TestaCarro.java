public class TestaCarro {
    public static void main(String[] args) {
        Carro carro1;
        carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2015;

        Carro carro2;
        carro2 = new Carro();
        carro2.marca = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2022;

        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
