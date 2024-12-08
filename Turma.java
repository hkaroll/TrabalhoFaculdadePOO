import java.util.ArrayList;

public class Turma {
	private String codigo;
	private Disciplina disciplina;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	
	
	public Turma(String codigo, Disciplina disciplina, Professor professor) {
		super();
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.professor = professor;
		this.alunos = new ArrayList<>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public void listarAlunos() {
		System.out.println("Alunos matriculados:");
		for (Aluno aluno : alunos) {
			System.out.println("Aluno(a) " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
		}
	}
	
	public void imprimirInformacoes() {
		System.out.println("\nInformações da Turma");
		System.out.println(codigo);
		System.out.println("Disciplina " + disciplina.getNome() + 
				" (Código: " + disciplina.getCodigo() + 
				" - Semestre " + disciplina.getSemestre() + ")");
		System.out.println("Professor " + professor.getNome() +
				" (Centro: " + professor.getCentro() + ")");
		listarAlunos();
	}

	
}
