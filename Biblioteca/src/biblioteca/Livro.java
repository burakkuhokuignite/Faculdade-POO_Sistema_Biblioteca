package biblioteca;

import java.io.Serializable;


public class Livro implements Serializable{
    private String codLivro;
    private String nome;
    private int ano;
    private boolean emprestado;

    public Livro(String codLivro, String nome, int ano, boolean emprestado) {
        this.codLivro = codLivro;
        this.nome = nome;
        this.ano = ano;
        this.emprestado = emprestado;
    }
    

    public String getCodLivro() {
        return codLivro;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public void emprestar(){
        emprestado = true;
    }
    
    public void devolver(){
        emprestado = false;
    }
    
    public String relatorio(){
        String rel = "Codigo do Livro: " + codLivro + "\n";
        rel += "Nome: " + nome + "\n";
        rel += "Ano: " + ano + "\n";
        if(emprestado == true) rel += "Situação: Emprestado \n";
        else rel += "Situação: Disponível \n";
        return rel;
    }
}
