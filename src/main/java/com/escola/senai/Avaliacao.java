package com.escola.senai;

 
public class Avaliacao extends Disciplina {
        private Double nota;
        private Aluno aluno;
        
        //Construtores
       
        public Avaliacao(String nome, String professor,  Double nota,  Aluno aluno) {
            super(nome, professor);
            this.nota = nota;
            this.aluno = aluno;
        }

        //Getters and Setters

        public Double getNota() {
            return nota;
        }

        public void setNota(Double nota) {
            this.nota = nota;
        }

       

        public Aluno getAluno() {
            return aluno;
        }

        public void setAluno(Aluno aluno) {
            this.aluno = aluno;
        }

        
}
