package model;

import java.util.Scanner;

public class Veiculo {

    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        this(0, 0, 0);
    }

    public Veiculo(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void leitor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso(massa) do veículo em Kg: ");
        setPeso(scanner.nextInt());
        System.out.print("Digite a velocidade máxima do veículo em Km/h: ");
        setVelocMax(scanner.nextInt());
        System.out.print("Digite o preço do veículo em R$: ");
        setPreco(scanner.nextFloat());
    }

    public void imprimir() {
        System.out.printf("Peso: %d Kg%nVelocidade máxima: %d Km/h%nPreço: R$ %.2f%n", getPeso(), getVelocMax(), getPreco());
    }
}
