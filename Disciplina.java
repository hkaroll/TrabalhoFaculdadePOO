public class Disciplina {
	    private String codigo;
	    private String nome;
	    private String semestre;

	    public Disciplina(String codigo, String nome, String semestre) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.semestre = semestre;
	    }

	    public String getCodigo() {
	        return codigo;
	    }
	    
	    public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }

	    public String getNome() {
	        return nome;
	    }
	    
	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getSemestre() {
	        return semestre;
	    }
	    
	    public void setSemestre(String semestre) {
	        this.semestre = semestre;
	    }
}
