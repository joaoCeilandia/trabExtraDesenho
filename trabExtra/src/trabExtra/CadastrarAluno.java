package trabExtra;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



public class CadastrarAluno {
   public static void main(String[] args){
	   int entrada;
	   Scanner s = new Scanner(System.in);
	   String nomeAluno;
	   String aux;
	   String matriculaAluno;
	   Aluno novoAluno = new Aluno();
	   StoreCommand mySwitch = new StoreCommand();
	   do{
		   System.out.println("Voce deseja adicionar um novo aluno?");
		   System.out.println("Digite 0 para nao e qualquer outra tecla para sim.");
		   entrada = s.nextInt();
		   aux = s.nextLine();

		   if(entrada == 0) {
			   break;
		   }
		   System.out.println("Digite o nome do aluno:");
		   nomeAluno = s.nextLine();
		   System.out.println("Digite a matricula do aluno:");
		   matriculaAluno = s.nextLine();
		   Command createStudent = new CreateStudentCommand(novoAluno,nomeAluno,matriculaAluno);
		   mySwitch.storeAndExecute(createStudent);  
		   System.out.println("Aluno criado");


	   } while (entrada != 0);

      

      
      
   }
}
