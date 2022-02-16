package biblioteca;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Biblioteca {
    
    private static Bibliotec B = new Bibliotec();
    
    static Bibliotec getBiblioteca(){
        return B;
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        B.carregarUsuarios();
        B.carregarEmprestimos();
        B.carregarLivros();
        IUPrincipal principal = new IUPrincipal();
        principal.setVisible(true);
        principal.setTitle("Sistema de Biblioteca");
        principal.toFront();
        
    }
    
}
