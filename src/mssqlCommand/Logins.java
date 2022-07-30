/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlCommand;



/**
 *
 * @author asus
 */
public class Logins{
    
    private String username;
    private String password;
    private int Id;

    public Logins(int Id,String username, String password) {
        this.username = username;
        this.password = password;
        this.Id=Id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return Id;
    }
    

    @Override
    public String toString() {
        return "Username: "+this.username+"\nPassword: "+this.password+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
