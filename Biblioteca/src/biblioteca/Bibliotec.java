package biblioteca;

//Será nesta classe onde funcões de cadastro, busca, relatórios gerais, e etc, serão implementadas

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

//Está classe será um tipo de controlador
//Métodos e variáveis estáticas para serem acessados pela interface

public class Bibliotec implements Serializable{
    private Config configuracoes;
    private static Usuario usuarios[] = new Usuario[100];
    private static Emprestimo emprestimos[] = new Emprestimo[100];
    private static Livro livros[] = new Livro[100];
    private static int contUsuarios = 0;
    private static int contEmprestimos = 0;
    private static int contLivros = 0;
    
    Bibliotec(){
        this.configuracoes = new Config();
    }
    
    public Config getConfiguracoes(){
        return configuracoes;
    }
    
    static int getContUsuarios(){
        return contUsuarios;
    }
    
    static int getContEmprestimos(){
        return contEmprestimos;
    }
    
    static int getContLivros(){
        return contLivros;
    }
    
    static void addContUsuarios(){
        contUsuarios ++;
    }
    
    static void addContEmprestimos(){
        contEmprestimos ++;
    }
    
    static void addContLivros(){
        contLivros ++;
    }
    
    static public void cadastrarAluno(String codigoUsuario, String nome, String curso, int ano){
        usuarios[contUsuarios] = new Aluno(codigoUsuario, nome, curso, ano);
        contUsuarios ++;
    }
    
    static public void cadastrarProfessor(String codigoUsuario, String nome, String titulacao){
        usuarios[contUsuarios] = new Professor(codigoUsuario,nome, titulacao);
        contUsuarios ++;
    }
    
    static public void cadastrarLivro(String codigoLivro, String nome, int ano){
        livros[contLivros] = new Livro(codigoLivro, nome, ano, false);
        contLivros++;
    }
    
    static public Livro buscaLivro(String codigoLivro){
        for(int i = 0; i < contLivros; i++){
            if((livros[i].getCodLivro()).equals(codigoLivro))return livros[i];
        }
        return null;
    }
    
    static public Usuario buscaUsuario(String codigoUsuario){   
        for(int i = 0; i < contUsuarios; i ++){
           if(((usuarios[i].getCodUsuario()).equals(codigoUsuario))) return usuarios[i];
        }
        return null;
    }
    
    static public Usuario buscaAluno(String codigoUsuario){   
        for(int i = 0; i < contUsuarios; i ++){
           if(((usuarios[i].getCodUsuario()).equals(codigoUsuario)) && ((usuarios[i].getTipo()).equals("aluno"))) return usuarios[i];
        }
        return null;
    }
    
    static public Usuario buscaProfessor(String codigoUsuario){
        for(int i = 0; i < contUsuarios; i ++){
            if(((usuarios[i].getCodUsuario()).equals(codigoUsuario)) && ((usuarios[i].getTipo()).equals("professor"))) return usuarios[i];
        }
        return null;
    }
    
    static public String relatorioTodosUsuarios(){
        String rel = "";
        for(int i = 0; i < contUsuarios; i ++){
            rel += usuarios[i].relatorio() + "\n";
        }
        return rel;
    }
    
    static public String relatorioAlunos(){
        String rel = "";
        for(int i = 0; i < contUsuarios; i ++){
            if((usuarios[i].getTipo()).equals("aluno")) rel += usuarios[i].relatorio() + "\n";
        }
        return rel;
    }
    
    static public String relatorioProfessores(){
        String rel = "";
        for(int i = 0; i < contUsuarios; i ++){
            if((usuarios[i].getTipo()).equals("professor")) rel += usuarios[i].relatorio() + "\n";
        }
        return rel;
    }
    
    static public String relatorioLivros(){
        String rel = "";
        for(int i = 0; i < contLivros; i ++){
            rel += livros[i].relatorio() + "\n";
        }
        return rel;
    }
    
    static public void registrarEmprestimo(Emprestimo emprestimo){
        emprestimos[contEmprestimos] = emprestimo;
        contEmprestimos ++;
    }
    
    static public String relatorioLivrosUsuario(String codigoUsuario){
        String rel = "";
        for(int i = 0; i < contEmprestimos; i ++){
            if((emprestimos[i].getCodUsuario()).equals(codigoUsuario)) rel += emprestimos[i].relatorioEmprestimoCompleto();
        }
        return rel;
    }
    
    static public Usuario[] getUsuarios(){
        return usuarios;
    }
    
    static public Emprestimo[] getEmprestimos(){
        return emprestimos;
    }
    
    static public Livro[] getLivros(){
        return livros;
    }
    
    public void usuariosArquivo() throws IOException{
        configuracoes.usuarioParaArquivo(usuarios);
    }
    
    public void emprestimosArquivo() throws IOException{
        configuracoes.emprestimoParaArquivo(emprestimos);
    }
    
    public void livrosArquivo() throws IOException{
        configuracoes.livrosParaArquivo(livros);
    }
    
    public void carregarUsuarios() throws IOException, FileNotFoundException, ClassNotFoundException{
        File f = new File(configuracoes.getArquivoUsuarios());
        if(f.exists())
            configuracoes.arquivoParaUsuario(usuarios, 100);
    }
    
    public void carregarEmprestimos() throws IOException, FileNotFoundException, ClassNotFoundException{
        File f = new File(configuracoes.getArquivoEmprestimos());
        if(f.exists())
            configuracoes.arquivoParaEmprestimo(emprestimos, 100);
    }
    
    public void carregarLivros() throws IOException, FileNotFoundException, ClassNotFoundException{
        File f = new File(configuracoes.getArquivoLivros());
        if(f.exists())
            configuracoes.arquivoParaLivros(livros, 100);
    }
    
    public void limparEmprestimos() throws IOException{
        configuracoes.limparEmprestimos(emprestimos);
        for(int i = 0; i < contLivros; i ++){
            livros[i].devolver();
        }
        Emprestimo emprestimos[] = new Emprestimo[100]; 
        contEmprestimos = 0;
    }
}
