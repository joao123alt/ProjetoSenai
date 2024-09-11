package com.escola.senai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SenaiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);
	
         //Atributos
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Disciplina> disciplinas= new ArrayList<>();

        //MENU
		Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Mostrar professores da instituição.");
            System.out.println("2. Mostrar alunos matriculados.");
            System.out.println("3. Matricular aluno.");
			System.out.println("4. Contratar professor.");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("==========LISTA DE PROFESSORES==========");
 
                    for (Professor p: professores) {
                        System.out.println(p.getInfo());
                    }

					break;
                case 2:
                    System.out.println("==========LISTA DE ALUNOS MATRICULADOS==========");
                    
                    for (Aluno a: alunos) {
                        System.out.println(a.getInfo());
                    }
                
                    break;
                
                case 3:
                                //Imprime requisições ao usuários
                Scanner matricula = new Scanner(System.in);

                System.out.println("Digite o CPF do aluno:"); 
                    String cpfaluno = matricula.nextLine();
                System.out.println("Digite o nome do aluno: ");
                    String nomealuno = matricula.nextLine();
                System.out.println("Digite a matrícula do aluno: ");
                    String matriculaaluno = matricula.nextLine();
                    
                                    //Instancia um novo aluno 
                
                Aluno aluno = new Aluno(cpfaluno, nomealuno, matriculaaluno);
                alunos.add(aluno);
                
                                //Confirmação de matricula
                System.out.println("Aluno matriculado com sucesso!");
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                    break;
				
                case 4:
                    //Requisições ao usuario
                Scanner scannerprofessor = new Scanner(System.in);
                    System.out.println("==========PROCESSO DE CONTRATAÇÃO==========");
                System.out.print("Digite o CPF do professor: "); 
                    String cpfprocessor = scannerprofessor.nextLine();
                System.out.print("Digite o nome do professor: ");
                    String nomeprofessor = scannerprofessor.nextLine();
                System.out.print("Digite a matrícula do professor: ");
                    String matriculaprofessor = scannerprofessor.nextLine();
                System.out.print("Digite a especialidade do professor: ");
                        String especialidade = scannerprofessor.nextLine();

                        //Instncia um novo professor
                Professor professor = new Professor(cpfprocessor,nomeprofessor,matriculaprofessor,especialidade  );
                professores.add(professor);

                        //Confirma que deu certo
                        
                System.out.println("Professor contratado com sucesso!");
                System.out.println("CPF: " + professor.getCpf());
                System.out.println("Nome: " + professor.getNome());
                System.out.println("Matrícula: " + professor.getMatricula());
                System.out.println("Especialidade: " + professor.getEspecialidade());


                    break;
                    case 5:
                    //Requisições ao usuario
                    Scanner scannerdisciplina = new Scanner(System.in);
                    System.out.println("==========ADICIONAR DISCIPLINA==========");
                    System.out.print("Digite o nome da disciplina: "); 
                    String nomedisciplina = scannerdisciplina.nextLine();
                    System.out.print("Digite o nome da disciplina: "); 
                    String professordisciplina = scannerdisciplina.nextLine();                    
                        //Instncia um novo professor
                
                    Disciplina disciplina = new Disciplina(nomedisciplina, professordisciplina);
                    disciplinas.add(disciplina);
                    //Confirma
                    System.out.println("Disciplina Adicionada com sucesso!");
                    System.out.println("CPF: " + disciplina.getNome());
                    System.out.println("Nome: " + disciplina.getProfessorDisciplina());
                        
                

                    break;	
                    case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
	
	
	