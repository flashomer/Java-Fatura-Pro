/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlCommand;

import java.sql.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class BilgilieriGetir extends Baglan{

    private ArrayList<Bilgiler> bilgi =new ArrayList<Bilgiler>();
    public BilgilieriGetir(Connection con) {
        super(con);
        try {
            String goster="SELECT * FROM fatura_tables";
            Statement durum=con.createStatement();
            ResultSet result = durum.executeQuery(goster);
            Bilgiler bilgiarray;
            while(result.next()){
                bilgiarray=new Bilgiler(result.getInt("Id"), result.getInt("StockCode"), result.getString("Description"), result.getFloat("UnitPrice"),result.getInt("TaxRate"),result.getInt("Amount"));
                bilgi.add(bilgiarray);
            }
        } catch (Exception e) {
            Logger.getLogger(BilgilieriGetir.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
    
    public ArrayList<Bilgiler> getBilgi() {
        return bilgi;
    }
    
    
    
}
