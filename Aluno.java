public abstract class Aluno extends Pessoa {
	private String matricula;
	
	public Aluno(String cpf, String nome, int idade, String matricula) {
		super(cpf, nome, idade);
		this.matricula = matricula;
	}
	
	public abstract void pagarMensalidade();
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}