package biblioteca;

import java.io.Serializable;
import java.util.Calendar;


public class Item implements Serializable{
    private String codEmprestimo;
    private String codLivro;
    private Calendar dataDevolucao;
    
    Item(String codEmprestimo, String codLivro){
        this.codEmprestimo = codEmprestimo;
        this.codLivro = codLivro;
    }

    public String getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(String codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
}
