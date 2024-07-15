package main.java.com.meuprojeto;

import main.java.com.meuprojeto.model.ContaCorrente;
import main.java.com.meuprojeto.model.ContaPoupanca;
import main.java.com.meuprojeto.service.BancoService;

public class App {
    public static void main(String[] args) {
        BancoService banco = new BancoService();

        ContaCorrente cc1 = new ContaCorrente("001", 100.0);
        ContaPoupanca cp1 = new ContaPoupanca("002", 0.05);

        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);

        cc1.depositar(500.0);
        cp1.depositar(1000.0);

        cc1.sacar(200.0);
        cp1.transferir(cc1, 300.0);

        System.out.println("Saldo da conta corrente 001: " + cc1.getSaldo());
        System.out.println("Saldo da conta poupança 002: " + cp1.getSaldo());
    }
}
