import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe responsável por abrir a conexão com o banco de dados MySQL.
 *
 * IMPORTANTE: troque "root" e "1234" pelo usuário e senha do SEU MySQL local,
 * e confirme que o banco "cadastro" já foi criado (veja o script SQL no README).
 */
public class Conexao {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/cadastro";
            String user = "root";       // troque pelo seu usuário
            String password = "";   // troque pela sua senha

            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão: " + e.getMessage());
        }
    }
}
