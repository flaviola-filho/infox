/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;
import java.sql.*;


/**
 *
 * @author Administrator
 */
public class ModuloConexao {
    // metodo responsavel por estabelecer conexão com o banco
    public static Connection conector(){
        Connection conexao = null;
    // a linha a baixo chama o drive importado para biblioteca
        String driver = "com.mysql.cj.jdbc.Driver";
    // armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "721126";
    // estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    
    }
    
}
