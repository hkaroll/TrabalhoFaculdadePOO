public class Professor extends Pessoa {
	private String centro;
	
	public Professor(String cpf, String nome, int idade, String centro) {
		super(cpf, nome, idade);
		this.centro = centro;
	}
	
	public void darAula() {
		System.out.println("Professor " + getNome() + " está dando aula.");
	}
	
	public String getCentro() {
		return centro;
	}
}
