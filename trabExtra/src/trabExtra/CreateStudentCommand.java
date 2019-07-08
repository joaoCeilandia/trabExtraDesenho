package trabExtra;

import java.util.ArrayList;
import java.util.List;



public class CreateStudentCommand implements Command {
	   private Aluno novoAluno;
	   private String nome;
	   private String matricula;

	   public CreateStudentCommand(Aluno aluno, String nome,String matricula) {
	      this.novoAluno = aluno;
	      this.nome = nome;
	      this.matricula = matricula;
	   }

	   public void execute() {
	      novoAluno.setNome(this.nome);
	      novoAluno.setMatricula(this.matricula);
	   }
	}