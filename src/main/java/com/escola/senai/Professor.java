package com.escola.senai;


    public class Professor extends Pessoa {
    private String matricula;
    private String especialidade;

    
    //Métodos
    

    public Professor(String _cpf, String _nome, String matricula, String especialidade) { //Construtor
       
        super(_cpf,_nome);
        this.matricula = matricula;
        this.especialidade = especialidade;
        System.out.println("Professor contratado com sucesso!");
}

    public String getInfo(){
        return "Nome: " + getNome() + ", Cpf: " + getCpf() + ",Matricula: " + getMatricula()+ ", Especialidade: " + getEspecialidade();

    }    

    //Getters and Setters

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    }


