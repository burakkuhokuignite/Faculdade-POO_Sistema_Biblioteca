package biblioteca;

import java.io.Serializable;


public class Aluno extends Usuario implements Serializable{
    protected String curso;
    protected int ano;
    
    Aluno(String codUsuario, String nome,String curso, int ano){
        super(codUsuario, nome);
        this.tipo = "aluno";
        this.curso = curso;
        this.ano = ano;
        this.diasEmprestimo = 10;
    }
    
    @Override
    public String getCurso() {
        return curso;
    }
    
    @Override
    public int getAno() {
        return ano;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    protected String getTitulacao(){
        return "Atributo Inexistente";
    }
    
    @Override
    public String relatorio(){
        String rel = "Código: " + codUsuario + "\n";
        rel += "Tipo: " + tipo + "\n";
        rel += "Nome: " + nome + "\n";
        rel += "Dias Emprestimo: " + diasEmprestimo + "\n";
        rel += "Curso: " + curso + "\n";
        rel += "Ano: " + ano + "\n";
        return rel;
    }
}
