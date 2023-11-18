/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eriani M
 */
public class Conection {
     
  public static void connect() {
      Connection conn = null;
      try {
          // db parameters
          String url = "jdbc:sqlite:meuBancoDeDados.db";
          // create a connection to the database
          conn = DriverManager.getConnection(url);

          System.out.println("Conectado com o banco de dados.");

      } catch (SQLException e) {
          System.out.println(e.getMessage());
      } finally {
          try {
              if (conn != null) {
                  conn.close();
              }
          } catch (SQLException ex) {
              System.out.println(ex.getMessage());
          }
      }
  }
  
}