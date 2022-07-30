package mssqlCommand;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author asus
 */
public abstract class Baglan {
    Connection baglan;
    public Baglan(Connection con){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=fatura_database;username=sa;password=1453";
            
            con=DriverManager.getConnection(url);
            this.baglan=con;
            System.err.println("SQL Database Bağlantısı Başarılı...");
        } catch (Exception e) {
            System.err.println("SQL Bağlantıda bir problem oluştu.");
        }
    }

    public Connection getBaglan() {
        return baglan;
    }
    
}
