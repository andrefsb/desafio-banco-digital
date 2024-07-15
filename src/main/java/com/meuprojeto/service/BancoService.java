package main.java.com.meuprojeto.service;

import java.util.ArrayList;
import java.util.List;
import main.java.com.meuprojeto.model.Conta;

public class BancoService {
    private List<Conta> contas;

    public BancoService() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> listarContas() {
        return contas;
    }
}
