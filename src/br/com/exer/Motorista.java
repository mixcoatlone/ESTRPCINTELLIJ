package br.com.exer;

import java.util.Optional;

/**
 * Created by BRUNO on 05/09/2017.
 */
public class Motorista {
    private String nome;
    private Integer idade;
    private Optional<Caminhao> caminhao;
   // private Caminhao caminhao;

    public Motorista(String nome, Integer idade, Optional<Caminhao> caminhao) {
        this.nome = nome;
        this.idade = idade;
        this.caminhao = caminhao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Optional<Caminhao> getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Optional<Caminhao> caminhao) {
        this.caminhao = caminhao;
    }
}
