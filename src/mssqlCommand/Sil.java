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
public class Sil extends Baglan{

    Statement silmeDurumu=null;
    public Sil(Connection con,int id) {
        super(con);
        try {
            String sil="DELETE FROM fatura_tables WHERE Id='"+id+"'";
            silmeDurumu=con.createStatement();
            silmeDurumu.executeUpdate(sil);
            System.out.println("Silme işlemi başarılı bir şekilde gerçekleşmiştir.");    
            
        } catch (Exception e) {
            Logger.getLogger(Sil.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
