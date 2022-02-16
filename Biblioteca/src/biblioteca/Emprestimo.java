package biblioteca;

import java.io.Serializable;
import java.util.Calendar;


public class Emprestimo implements Serializable{
    private String codEmprestimo;
    private String codUsuario;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;
    private Item itens[] = new Item[10];
    private int contItens = 0;
    static int codigo = 0;
    
    Emprestimo(String codEmprestimo, Usuario usuario){
        this.codEmprestimo = codEmprestimo;
        this.codUsuario = usuario.getCodUsuario();
        codigo ++;
    }
    
    Emprestimo(){
        codigo ++;
        this.codEmprestimo = Integer.toString(codigo);
    }
    
    void addItem(Item item){
        itens[contItens] = item;
        contItens ++;
    }
    
    public String getCodUsuario(){
        return codUsuario;
    }

    public String getCodEmprestimo() {
        return codEmprestimo;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public int getContItens() {
        return contItens;
    }

    public void setCodEmprestimo(String codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public String relatorioEmprestimoBasico(){
        String rel = "Código do Empréstimo: " + codEmprestimo + "\n";
        for(int i = 0; i < contItens; i ++){
            rel += "\n";
            rel += "Livro " + Integer.toString(i) + "\n";
            String codigo = itens[i].getCodLivro();
            Livro livro = Bibliotec.buscaLivro(codigo);
            rel += "Código do Livro: " + codigo + "\n"; 
            rel += "Nome do Livro: " + livro.getNome() + "\n";
        }
        return rel;
    }
    
    public String relatorioEmprestimoCompleto(){
        String rel = "";
        for(int i = 0; i < contItens; i ++){
            rel += "Codigo do Emprestimo: " + itens[i].getCodEmprestimo() + "\n";
            String codigo = itens[i].getCodLivro();
            Livro livro = Bibliotec.buscaLivro(codigo);
            rel += "Código do Livro: " + codigo + "\n"; 
            rel += "Nome do Livro: " + livro.getNome() + "\n";
            Calendar data = itens[i].getDataDevolucao();
            String dataDev = Integer.toString(data.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(data.get(Calendar.MONTH)) + "/" + Integer.toString(data.get(Calendar.YEAR));
            rel += "Data de Devolução: " + dataDev + "\n";
            rel += "\n";
        }
        return rel;
    }
    
    public void setDataDevolucaoItens(){
        for(int i = 0; i < contItens; i ++){
            itens[i].setDataDevolucao(dataDevolucao);
        }
    }
}
