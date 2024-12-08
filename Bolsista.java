class Bolsista extends Aluno {

	public Bolsista(String cpf, String nome, int idade, String matricula) {
		super(cpf, nome, idade, matricula);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("O aluno bolsista " + getNome() + " pagou a mensalidade");
	}
}
