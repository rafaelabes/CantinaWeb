/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author apmagalhaes
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/lp3", "root", "123456");

        } catch (SQLException erro) {
            System.out.println("erro, verifique se o driver foi incluido como biblioteca do projeto");
        } finally {
            return conexao;
        }
    }
}
