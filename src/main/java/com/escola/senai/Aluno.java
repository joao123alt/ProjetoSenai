package com.escola.senai;


public class Aluno extends Pessoa{
    
    //Atributo
    private String matricula;

    //Construtor    
    public Aluno(String _cpf, String _nome, String matricula) {
        super(_cpf, _nome);
        this.matricula = matricula;
        System.out.println("Aluno Matriculado com sucesso!");
         }
        
    public String getInfo(){
        return "Nome: " + getNome() + ", Cpf: " + getCpf() + ",Matricula: " + getMatricula();


    }     
           
         //GETTERS AND SETTERS
      
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
