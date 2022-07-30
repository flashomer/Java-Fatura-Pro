/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ListGetir {
    private static ArrayList<String> BasketList=new ArrayList<String>();
    private static ArrayList<Double> BasketPrice=new ArrayList<Double>();

    public void ListEkle(String description,double price){
        BasketList.add(description);
        BasketPrice.add(price);
    }
    
    public void ListCikar(String description,double price){
        BasketList.removeIf(name -> name.equals(description));
        BasketPrice.removeIf(name -> name.equals(price));
        /*for (int i = 0; i < BasketList.size(); i++)
        {
            if(BasketList.get(i).equalsIgnoreCase(description))
            {
                BasketList.remove(description);
                BasketPrice.remove(price);
                return true;
            }           
        }
        return false;*/
    }

    public static ArrayList<String> getBasketList() {
        return BasketList;
    }

    public static ArrayList<Double> getBasketPrice() {
        return BasketPrice;
    }

    

    

    
    
    
    
}
