package trabExtra;

public class Aluno {
	 
    private static Aluno uniqueInstance;
    private String nome;
    private String matricula;
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getMatricula() {
    	return matricula;
    }
    
    public void setMatricula(String matricula) {
    	this.matricula = matricula;
    }
    
    public static synchronized Aluno getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Aluno();
 
        return uniqueInstance;
    }
}