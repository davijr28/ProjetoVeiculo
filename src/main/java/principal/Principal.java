package principal;

import java.util.Scanner;
import model.CarroPasseio;
import model.Caminhao;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Escolha o tipo de veículo:\n[1] - Carro de passeio\n[2] - Caminhão");
        x = scanner.nextInt();
        switch (x) {
            case 1:
                CarroPasseio carro = new CarroPasseio();
                carro.leitor();
                carro.imprimir();
                break;
            case 2:
                Caminhao caminhao = new Caminhao();
                caminhao.leitor();
                caminhao.imprimir();
                break;
            default:
                break;
        }
    }
}
