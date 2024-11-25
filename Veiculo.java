// Classe abstrata Veiculo
abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstrato
    public abstract String informacoesVeiculo();

    // Getter para ano
    public int getAno() {
        return ano;
    }

    // Setter para ano
    public void setAno(int ano) {
        this.ano = ano;
    }
}

// Classe Carro herdando de Veiculo
class Carro extends Veiculo {
    public int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String informacoesVeiculo() {
        return "Carro - Marca: " + marca + ", Modelo: " + modelo + 
               ", Ano: " + getAno() + ", Número de Portas: " + numeroPortas;
    }
}

// Classe Moto herdando de Veiculo
class Moto extends Veiculo {
    private int cilindrada;

    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    // Getter para cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    // Setter para cilindrada
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto - Marca: " + marca + ", Modelo: " + modelo + 
               ", Ano: " + getAno() + ", Cilindrada: " + cilindrada + "cc";
    }
}

// Classe Main para teste
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        // Criando um objeto da classe Moto
        Moto moto = new Moto("Honda", "CB500", 2021, 500);

        // Exibindo as informações dos veículos
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
