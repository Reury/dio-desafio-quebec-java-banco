package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

    private String nome= "";
    private String endereco = "";
    private String telefone = "";
    private LocalDate dataNascimento;

    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(this.dataNascimento,dataAtual);
        return periodo.getYears();
    }

    public void setIdade(LocalDate aniversario) throws Exception {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(aniversario,dataAtual);
        int idade = periodo.getYears();
        if(idade<18){
            throw new Exception("Menor de idade não pode abrir conta");
        }else {
            this.dataNascimento = aniversario;
        }

    }

    public String getNome() {
        return nome;
    }

    public Cliente(String nome, String endereco,String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Cliente(String nome, String endereco,String telefone, LocalDate aniversario){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = aniversario;
    }
    public Cliente(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
