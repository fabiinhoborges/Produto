/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.produto.util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vinicius
 */
public class Conexao {
    
    
    public Connection connection;
	
	/**
     * Método que devolve conexão
     * @return 
     */
    public Connection conectar(){
        try {
                  
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://201.16.160.18:3306/produtos","root", "1234");
            
            return connection;
        } catch (Exception e) {
            System.out.println("Erro ao conectar. Motivo: " + e.getMessage());
            return null;
        }        
    }
    
    
    /**
     * Método que desconecta
     */
    public void desconectar(){
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("Erro ao desconectar. Motivo: " + e.getMessage());
        }
    }
    
}
