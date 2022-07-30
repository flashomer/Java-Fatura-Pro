/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;


import java.util.logging.Level;
import java.util.logging.Logger;
import mssqlCommand.Baglan;
import mssqlCommand.Baglan;
import Customers.CustomerInfos;

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
                customerarray=new CustomerInfos(result.getString("Tax_no"), result.getString("Tax_office"), result.getString("Customer_name"), result.getString("Customer_adress"),result.getString("Customer_tel"));
                customer.add(customerarray);
            }
        } catch (Exception e) {
            Logger.getLogger(CustomerGetir.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<CustomerInfos> getCustomer() {
        return customer;
    }
    
    
    
}
