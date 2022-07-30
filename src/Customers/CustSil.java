/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import mssqlCommand.Baglan;

/**
 *
 * @author asus
 */
public class CustSil extends Baglan{
    Statement silmeDurumu=null;

    public CustSil(Connection con,String taxno) {
        super(con);
        try {
            String sil="DELETE FROM Customer_table WHERE Tax_no='"+taxno+"'";
            silmeDurumu=con.createStatement();
            silmeDurumu.executeUpdate(sil);
            System.out.println("Silme işlemi başarılı bir şekilde gerçekleşmiştir.");    
        } catch (Exception e) {
            Logger.getLogger(CustSil.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
