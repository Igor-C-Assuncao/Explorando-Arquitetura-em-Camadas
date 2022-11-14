package dados;

import negocio.aluno.Aluno;

public interface IRepositorioAluno {

  public void inserirAluno(Aluno aluno);

 

  public void alterarAluno(Aluno aluno);

  public void removerAluno(String matricula);

  public Aluno buscarAluno(String matricula);

}
