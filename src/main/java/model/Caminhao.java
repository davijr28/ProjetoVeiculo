package model;

import java.util.Scanner;

public class Caminhao extends Veiculo {

    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao(){
        this(0,0,0,0,0,0);
    }

    public Caminhao(int toneladas, int alturaMax, int comprimento, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void leitor() {
        super.leitor();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a carga máxima em toneladas: ");
        setToneladas(scanner.nextInt());
        System.out.print("Digite a altura máxima em metros: ");
        setAlturaMax(scanner.nextInt());
        System.out.print("Digite o comprimento em metros: ");
        setComprimento(scanner.nextInt());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Carga máxima: "+getToneladas()+" t\nAltura máxima: "+getAlturaMax()+" m\nComprimento: "+getComprimento()+ " m");
    }
}
