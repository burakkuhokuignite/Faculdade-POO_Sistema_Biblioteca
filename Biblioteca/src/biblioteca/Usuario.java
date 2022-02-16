package biblioteca;

import java.io.Serializable;


public abstract class Usuario implements Serializable{
    protected String codUsuario;
    protected String nome;
    protected int diasEmprestimo;
    protected String tipo;
        
    Usuario(String codUsuario, String nome){
        this.codUsuario = codUsuario;
        this.nome = nome;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiasEmprestimo(int diasEmprestimo) {
        this.diasEmprestimo = diasEmprestimo;
    }
    
    abstract String relatorio();
    
    abstract String getCurso();
    
    abstract int getAno();
    
    abstract String getTitulacao();
        
}
