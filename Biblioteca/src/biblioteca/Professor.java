package biblioteca;

import java.io.Serializable;


public class Professor extends Usuario implements Serializable{
    protected String titulacao;
    
    Professor(String codUsuario, String nome, String titulacao){
        super(codUsuario, nome);
        this.tipo = "professor";
        this.titulacao = titulacao;
        this.diasEmprestimo = 20;
    }
    
    @Override
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    @Override
    protected String getCurso(){
        return "Atributo Inexistente";
    }
    
    @Override
    protected int getAno(){
        return 0;
    }
    
    @Override
    public String relatorio(){
        String rel = "Código: " + codUsuario + "\n";
        rel += "Tipo: " + tipo + "\n";
        rel += "Nome: " + nome + "\n";
        rel += "Dias Emprestimo: " + diasEmprestimo + "\n";
        rel += "Titulação: " + titulacao + "\n";
        return rel;
    }
}
