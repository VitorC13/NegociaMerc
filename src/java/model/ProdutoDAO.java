/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanec
 */
public class ProdutoDAO {
    
    public void cadastrar(Produto produto) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        
        PreparedStatement comando = con.prepareStatement("insert into mercadorias.merc (tipMerc, nomeMerc, qntdMerc, precMerc, tipoNegoc, deltMerc) values ('?','?',?,?, true,false)");
        comando.setString(1, produto.getTipMerc());
        comando.setString(2, produto.getNomeMerc());
        comando.setInt(3, produto.getQntdMerc());
        comando.setDouble(4, produto.getPrecMerc());
        comando.execute();
        
        con.close();
    }
    
    public List<Produto> consultarTodos() throws ClassNotFoundException, SQLException {
        
        Connection con = Conexao.getConexao();
        
        PreparedStatement comando = con.prepareStatement("select * from Produto");
        ResultSet resultado = comando.executeQuery();
        
        List<Produto> todosProdutos = new ArrayList<Produto>();
        while (resultado.next()) {
            
            Produto p = new Produto();
            
            p.setIdMerc(resultado.getInt("idMerc"));
            p.setTipMerc(resultado.getString("tipMerc"));
            p.setNomeMerc(resultado.getString("nomeMerc"));
            p.setQntdMerc(resultado.getInt("qntdMerc"));
            p.setPrecMerc(resultado.getDouble("preco"));
            p.setTipoMerc(resultado.getBoolean("tipoNegoc"));
            
            todosProdutos.add(p);
            
        }
        
        con.close();
        
        return todosProdutos;
    }
}
