public class Main {
	public static void main (String[] args) {
		Disciplina disciplina1 = new Disciplina("POO", "Programação Orientada a Objetos", "2024.2");
		Disciplina disciplina2 = new Disciplina("RLA", "Raciocínio Lógico Algoritmo", "2024.2");
		Disciplina disciplina3 = new Disciplina("FSC", "Fundamentos Sistemas Computacionais", "2024.2");
		
		Regular alunoRegular1 = new Regular("123.456.789-10", "Lucas Almeida", 19, "2024001");
		Regular alunoRegular2 = new Regular("321.654.987-01", "Mariana dos Santos", 27, "2024002");
		Bolsista alunoBolsista = new Bolsista("147.258.369-00", "Pedro Feitosa", 23, "2024003");
		
		Professor professor = new Professor("741.852.963-11", "Dr. Luiz Ricardo", 50, "Análise e Desenvolvimento de Sistemas");
		
		Visitante visitante1 = new Visitante("159.487.263-55", "Ana Maria Cavalcante", 20);
		Visitante visitante2 = new Visitante("326.748.951-21", "José Silva", 30);
		
		Turma turma1 = new Turma("Turma 1: ", disciplina1, professor);
		Turma turma2 = new Turma("Turma 2: ", disciplina2, professor);
		Turma turma3 = new Turma("Turma 3: ", disciplina3, professor);
		
		turma1.adicionarAluno(alunoRegular1);
		turma1.adicionarAluno(alunoRegular2);
		turma1.adicionarAluno(alunoBolsista);
		
		turma2.adicionarAluno(alunoRegular1);
		turma2.adicionarAluno(alunoRegular2);
		turma2.adicionarAluno(alunoBolsista);
		
		turma3.adicionarAluno(alunoRegular1);
		turma3.adicionarAluno(alunoRegular2);
		turma3.adicionarAluno(alunoBolsista);
		
		turma1.imprimirInformacoes();
		turma2.imprimirInformacoes();
		turma3.imprimirInformacoes();
		
	}
}
