/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlCommand;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Ekle extends Baglan{

    public Ekle(Connection con,int Id,int stok,String Description,float UnitPrice,int TaxRate,int Amount) {
        super(con);
        try {
            PreparedStatement prepare=con.prepareStatement("INSERT INTO  fatura_tables (Id,StockCode,Description,UnitPrice,TaxRate,Amount) VALUES (?,?,?,?,?,?)");
            prepare.setInt(1, Id);
            prepare.setInt(2, stok);
            prepare.setString(3, Description);
            prepare.setFloat(4, UnitPrice);
            prepare.setInt(5, TaxRate);
            prepare.setInt(6, Amount);
            prepare.executeUpdate();
            System.out.println("Ekleme işlemi başarılı.");
        } catch (Exception e) {
            Logger.getLogger(Ekle.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
