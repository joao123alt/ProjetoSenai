package com.escola.senai;
 
public class Disciplina {
    
    private String nome;
    private String professor;
    
   //MÉTODOS
   
    public Disciplina(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
     }
     //GETTERS AND SETTERS
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProfessorDisciplina() {
        return professor;
    }
    public void setProfessorDisciplina(String professordisciplina) {
        this.professor = professordisciplina;
    }
}