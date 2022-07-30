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
public class LoginGetir extends Baglan{
    private ArrayList<Logins> list =new ArrayList<Logins>();

    public LoginGetir(Connection con) {
        super(con);
        try {
            String goster="SELECT * FROM login_table";
            Statement durum=con.createStatement();
            ResultSet result = durum.executeQuery(goster);
            Logins loginInfo;
            while(result.next()){
                loginInfo=new Logins(result.getInt("Id"), result.getString("Username"), result.getString("Password"));
                list.add(loginInfo);
            }
        } catch (Exception e) {
            Logger.getLogger(BilgilieriGetir.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Logins> getList() {
        return list;
    }
    
}
