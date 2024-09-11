package com.escola.senai;

public class Pessoa {

    //Atributos

    private String nome;
    private String cpf;


   //Construtor
   
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    } 


    //GETTERS AND SETTERS
       
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
      
}
