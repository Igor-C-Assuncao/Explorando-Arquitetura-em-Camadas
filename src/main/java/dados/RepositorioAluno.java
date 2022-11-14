package dados;

import java.util.ArrayList;
import java.util.List;
import negocio.aluno.Aluno;

public class RepositorioAluno implements IRepositorioAluno{
  private List<Aluno> alunos;

  public RepositorioAluno(){
    this.alunos = new ArrayList<>();
  }

  

  private boolean alunoExistente(String matricula){
    if(buscarAluno(matricula) == null){
      return false;
    }
    return true;
  }

  @Override
  public void inserirAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }

  
    

  

public void removerAluno(String matricula){
  Aluno aluno = buscarAluno(matricula);
    if (matricula != null){
      alunos.remove(aluno);
      
    }
    
  }

@Override
public void alterarAluno(Aluno aluno) {

  for(Aluno alunoSearch : alunos){
    if(alunoSearch.getMatricula() == aluno.getMatricula()){
      alunos.get(alunos.indexOf(aluno)).setEndereco(aluno.getEndereco());
      alunos.get(alunos.indexOf(aluno)).setNome(aluno.getNome());

      }
    }

  
}

@Override
public Aluno buscarAluno(String matricula) {
  for(Aluno aluno: alunos){
    if(aluno.getMatricula() == matricula){
      return aluno;
    }
  }
  return null;
  }
}







