/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlCommand;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suleyman
 */
public class CustomerGetir extends Baglan {

    
    private ArrayList<CustomerInfos> customer =new ArrayList<CustomerInfos>();
    public CustomerGetir(Connection con) {
        super(con);
        try {
            String goster="SELECT * FROM Customer_table";
            Statement durum=con.createStatement();
            ResultSet result = durum.executeQuery(goster);
            CustomerInfos customerarray;
            while(result.next()){
                customerarray=new CustomerInfos(result.getString("TaxNo"), result.getString("TaxOffice"), result.getString("CustName"), result.getString("CustAddress"),result.getString("CustTel"));
                customer.add(customerarray);
            }
        } catch (Exception e) {
            Logger.getLogger(CustomerGetir.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
