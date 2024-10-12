package model;

import java.util.Scanner;

public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    public CarroPasseio() {
        this("","",0,0,0);
    }

    public CarroPasseio(String cor, String modelo, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void leitor() {
        super.leitor();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cor: ");
        setCor(scanner.nextLine());
        System.out.print("Digite o modelo: ");
        setModelo(scanner.nextLine());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Cor: " + getCor() + "\nModelo: " + getModelo());
    }
}
