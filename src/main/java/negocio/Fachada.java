package negocio;

import negocio.aluno.Aluno;

public class Fachada implements IFachada{
  private ControladorAluno controladorAluno;

  public Fachada(){
    this.controladorAluno = new ControladorAluno();
  }

  @Override
  public void inserirAluno(Aluno aluno) {
    this.controladorAluno.inserirAluno(aluno);
  }

  @Override
  public void alterarAluno(Aluno aluno) {
    this.controladorAluno.alterarAluno(aluno);

  }

  @Override
  public void removerAluno(String matricula) {
    this.controladorAluno.removerAluno(matricula);

  }

  @Override
  public Aluno buscarAluno(String matricula) {
    return this.controladorAluno.buscarAluno(matricula);
  }
}
