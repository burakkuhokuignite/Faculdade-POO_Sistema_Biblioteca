package biblioteca;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Config implements Serializable{
    private String arquivoLivros = ".\\livros.dat";
    private String arquivoUsuarios = ".\\usuarios.dat";
    private String arquivoEmprestimos = ".\\emprestimos.dat";
    private int diasAluno = 10;
    private int diasProfessor = 20;

    public String getArquivoEmprestimos() {
        return arquivoEmprestimos;
    }

    public void setArquivoEmprestimos(String arquivoEmprestimos) {
        this.arquivoEmprestimos = arquivoEmprestimos;
    }

    public String getArquivoLivros() {
        return arquivoLivros;
    }

    public void setArquivoLivros(String arquivoLivros) {
        this.arquivoLivros = arquivoLivros;
    }

    public String getArquivoUsuarios() {
        return arquivoUsuarios;
    }

    public void setArquivoUsuarios(String arquivoUsuarios) {
        this.arquivoUsuarios = arquivoUsuarios;
    }

    public int getDiasAluno() {
        return diasAluno;
    }

    public void setDiasAluno(int diasAluno) {
        this.diasAluno = diasAluno;
    }

    public int getDiasProfessor() {
        return diasProfessor;
    }

    public void setDiasProfessor(int diasProfessor) {
        this.diasProfessor = diasProfessor;
    }
    
    public void usuarioParaArquivo(Usuario usuarios[]) throws FileNotFoundException, IOException{
        Integer tam = Bibliotec.getContUsuarios();
        FileOutputStream f = new FileOutputStream(arquivoUsuarios);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(tam);
        for(int i = 0; i < tam ; i ++){
            o.writeObject(usuarios[i]);
        }
        o.close();
        f.close();
    }
    
    public void arquivoParaUsuario(Usuario usuarios[], int tam) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream f = new FileInputStream(arquivoUsuarios);
        ObjectInputStream o = new ObjectInputStream(f);
        Integer tam2 = (int)o.readObject();
        int tam3 = Bibliotec.getContUsuarios();
        for(int i = 0; i < tam2 && tam3 < tam; i ++){
            Usuario user = (Usuario)o.readObject();
            usuarios[tam3] = user;
            Bibliotec.addContUsuarios();
            tam3 = Bibliotec.getContUsuarios();
        }
        o.close();
        f.close();
    }
    
    public void emprestimoParaArquivo(Emprestimo emprestimos[]) throws FileNotFoundException, IOException{
        Integer tam = Bibliotec.getContEmprestimos();
        FileOutputStream f = new FileOutputStream(arquivoEmprestimos);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(tam);
        for(int i = 0; i < tam ; i ++){
            o.writeObject(emprestimos[i]);
        }
        o.close();
        f.close();
    }
    
    public void arquivoParaEmprestimo(Emprestimo emprestimos[], int tam) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream f = new FileInputStream(arquivoEmprestimos);
        ObjectInputStream o = new ObjectInputStream(f);
        Integer tam2 = (int)o.readObject();
        int tam3 = Bibliotec.getContEmprestimos();
        for(int i = 0; i < tam2 && tam3 < tam; i ++){
            Emprestimo emp = (Emprestimo)o.readObject();
            emprestimos[tam3] = emp;
            Bibliotec.addContEmprestimos();
            tam3 = Bibliotec.getContEmprestimos();
        }
        o.close();
        f.close();
    }
    
    public void livrosParaArquivo(Livro livros[]) throws FileNotFoundException, IOException{
        Integer tam = Bibliotec.getContLivros();
        FileOutputStream f = new FileOutputStream(arquivoLivros);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(tam);
        for(int i = 0; i < tam ; i ++){
            o.writeObject(livros[i]);
        }
        o.close();
        f.close();
    }
    
    public void arquivoParaLivros(Livro livros[], int tam) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream f = new FileInputStream(arquivoLivros);
        ObjectInputStream o = new ObjectInputStream(f);
        Integer tam2 = (int)o.readObject();
        int tam3 = Bibliotec.getContLivros();
        for(int i = 0; i < tam2 && tam3 < tam; i ++){
            Livro liv = (Livro)o.readObject();
            livros[tam3] = liv;
            Bibliotec.addContLivros();
            tam3 = Bibliotec.getContLivros();
        }
        o.close();
        f.close();
    }
    
    public void limparEmprestimos(Emprestimo emprestimos[]) throws FileNotFoundException, IOException{
        Integer tam = 0;
        FileOutputStream f = new FileOutputStream(arquivoEmprestimos);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(tam);
        for(int i = 0; i < tam ; i ++){
            o.writeObject(emprestimos[i]);
        }
        o.close();
        f.close();
    }
}
