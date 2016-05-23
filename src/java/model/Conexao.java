package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() throws ClassNotFoundException, SQLException {

        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/mercadorias";
            String usuario = "root";
            String senha = "0122607";
            Class.forName("com.mysql.jdbc");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha conexão: " + e.getMessage());
        }

        return con;
    }

}
