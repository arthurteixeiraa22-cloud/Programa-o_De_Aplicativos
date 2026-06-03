package Sistema_De_Delivery_De_Restaurante.entities;

public class Autenticador {
    private Usuario usuarioCadastro;
    public Autenticador(Usuario usuarioCadastro){
        this.usuarioCadastro=usuarioCadastro;
    }
    public boolean autenticar(String login, String senha){
        return usuarioCadastro.getLogin().equals(login)
                && usuarioCadastro.getSenha().equals(senha);
    }
}
