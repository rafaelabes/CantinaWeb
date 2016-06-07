/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uoston
 */
public class FabricaConexao {
    public FabricaConexao(){
    }
       public boolean executar(String sql) {
        boolean resposta = false;
        Connection con = null;
        try {           
            // conectando
            con = new ConnectionFactory().getConnection();          
            PreparedStatement stmt = con.prepareStatement(sql);
          
            stmt.execute();
            resposta = true;
            stmt.close();
            con.close();
            
        } catch (SQLException erro) {
            System.out.println(erro);
        } finally {
            System.out.println("Sucesso!");
            return resposta;
        }     
    }
  
}
