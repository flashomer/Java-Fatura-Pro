/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

/**
 *
 * @author asus
 */
public class ListInfo {
    private String Description;
    
    private double Price;

    public ListInfo(String Description, double Price) {
        this.Description = Description;
        this.Price = Price;
    }

    public double getPrice() {
        return Price;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public String toString() {
        return "\n"+
                String.format("%30s", this.Description)+String.format("%30s", this.Price); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
