/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlCommand;

import javax.swing.DefaultListModel;

/**
 *
 * @author flashomer
 */
public class totalPrice {
     public static DefaultListModel basketList = new DefaultListModel();
     public static DefaultListModel basketListPrice = new DefaultListModel(); 

    
     
     public DefaultListModel getBasketList(){
         return this.basketList; 
     }
     
     public DefaultListModel getBasketListPrice(){
         return this.basketListPrice; 
     }
             
    
}
