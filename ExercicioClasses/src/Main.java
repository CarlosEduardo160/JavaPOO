public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Celta";
        carro.modelo = "Chevrolet";
        carro.ano = 2003;

        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);
        System.out.println("---------------------");

        carro2.nome = "Corrola";
        carro2.modelo = "Toyota";
        carro2.ano = 2009;

        System.out.println(" Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
