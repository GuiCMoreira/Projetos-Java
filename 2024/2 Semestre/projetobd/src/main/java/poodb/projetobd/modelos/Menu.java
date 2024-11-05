package poodb.projetobd.modelos;

public enum Menu {
    Alunos("/alunos","Aluno"),
    Professores("/professores","Professor"),
    Disciplinas("/disciplinas","Disciplina"),
    Matriculas("/Matriculas","Matricula");

    public final String url;
    public final String titulo;

    private  Menu(String url,String titulo){
        this.url = url;
        this.titulo = titulo;
    }
}
