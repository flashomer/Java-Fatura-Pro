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
public class Guncelle extends Baglan{

    public Guncelle(Connection con,int Id,int stok,String ad,float UnitPrice,int TaxRate,int Amount) {
        super(con);
        try {
            Statement durum=con.createStatement();
            
            String guncelle="UPDATE fatura_tables SET StockCode='"+stok+"', Description='"+ad+"', UnitPrice='"+UnitPrice+"', TaxRate='"+TaxRate+"', Amount='"+Amount+"' WHERE Id='"+Id+"'";
            durum.execute(guncelle);
            System.out.println("Update işlemi başarılı");
        } catch (Exception e) {
            Logger.getLogger(Guncelle.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
