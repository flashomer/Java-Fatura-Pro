/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mssqlCommand.Baglan;
import mssqlCommand.Baglan;
/**
 *
 * @author suleyman
 */
public class CustEkle extends Baglan {

    public CustEkle(Connection con,String TaxNo,String TaxOffice,String CustName,String CustAddress,String CustTel) {
        super(con);
        try {
            PreparedStatement prepare=con.prepareStatement("INSERT INTO  Customer_table (Tax_no,Tax_office,Customer_name,Customer_adress,Customer_tel) VALUES (?,?,?,?,?)");
            prepare.setString(1, TaxNo);
            prepare.setString(2, TaxOffice);
            prepare.setString(3, CustName);
            prepare.setString(4, CustAddress);
            prepare.setString(5, CustTel);
            prepare.executeUpdate();
            System.out.println("Ekleme işlemi başarılı.");
        } catch (Exception e) {
            Logger.getLogger(CustEkle.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    }
    

