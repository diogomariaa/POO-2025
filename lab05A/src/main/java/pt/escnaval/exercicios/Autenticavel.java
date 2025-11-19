
public interface Autenticavel {
    /**
     * Autentica o objeto com a senha fornecida.
     * @param senha a senha a validar
     * @return true se autenticação bem-sucedida, false caso contrário
     */
    boolean autenticar(String senha);
    
    /**
     * Obtém o identificador único do objeto autenticável.
     * @return identificador (ex: email, username)
     */
    String getIdentificador();
}