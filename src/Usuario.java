package src;

public class Usuario {
 
    /* Classe utilizada para controlas usuários do sistema */

    // Atributos
    String nome;
    String cpf;
    String setor;
    String email;
    String senha;



    public Usuario(){
    }

    public boolean novoCliente(String nome, String cpf, String setor, String email, String senha){
        nome = nome;
        cpf=cpf;
        setor=setor;
        email=email;
        senha=senha;

        return true;
    }
}
