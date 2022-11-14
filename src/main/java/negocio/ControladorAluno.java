package negocio;

import dados.IRepositorioAluno;
import dados.RepositorioAluno;
import negocio.aluno.Aluno;

public class ControladorAluno {
  private IRepositorioAluno repositorioAluno;

  public ControladorAluno(){
    this.repositorioAluno = new RepositorioAluno();
  }

  public void inserirAluno(Aluno aluno) {
    this.repositorioAluno.inserirAluno(aluno);
  }

  public void removerAluno(String matricula) {
    this.repositorioAluno.removerAluno(matricula);
  }

  public void alterarAluno(Aluno aluno) {
    this.repositorioAluno.alterarAluno(aluno);
  }
  
  public Aluno buscarAluno(String matricula){
    return this.repositorioAluno.buscarAluno(matricula);
  }


}
