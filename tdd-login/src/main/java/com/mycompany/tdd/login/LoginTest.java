import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.mycompany.tdd.login.TelaLogin;
/**
 *
 * @author Amanda Lopes
 */
public class LoginTest {
    
    /**
     * Teste controlado
     */
    @Test
    public void TesteLogin(){
        // Instância da classe TelaLogin
        TelaLogin login = new TelaLogin();

        // Teste do método de Login com credenciais válidas
        boolean resultado = login.login("mandssltn", "12345");
        
        // Retorno esperado
        Assertions.assertTrue(resultado, "Login realizado com sucesso.");
    }
    
    /**
     * Teste com dados incorretos
     */
    @Test
    public void TesteLoginErro(){
        // Instância da classe TelaLogin
        TelaLogin login = new TelaLogin();
        
        // Teste do método login com credenciais inválidas
        boolean resultado = login.login("Amanda Lopes", "ablubleble");
        
        // Retorno esperado
        Assertions.assertFalse(resultado, "Não foi possível realizar o login");
        
    }
}
