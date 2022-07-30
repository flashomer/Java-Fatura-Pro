/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class CustomerGonder {
    private static ArrayList<String> taxno=new ArrayList<String>();
    private static ArrayList<String> taxoffice=new ArrayList<String>();
    private static ArrayList<String> custname=new ArrayList<String>();
    private static ArrayList<String> custadress=new ArrayList<String>();
    private static ArrayList<String> custtel=new ArrayList<String>();

    public CustomerGonder(String TaxNo, String TaxOffice, String CustName, String CustAddress, String CustTel) {
        taxno.add(TaxNo);
        taxoffice.add(TaxOffice);
        custname.add(CustName);
        custadress.add(CustAddress);
        custtel.add(CustTel);
    }

    public static ArrayList<String> getCustadress() {
        return custadress;
    }

    public static ArrayList<String> getCustname() {
        return custname;
    }

    public static ArrayList<String> getCusttel() {
        return custtel;
    }

    public static ArrayList<String> getTaxno() {
        return taxno;
    }

    public static ArrayList<String> getTaxoffice() {
        return taxoffice;
    }

    @Override
    public String toString() {
        return "\n"+
                "Tax No:"+getTaxno().get(0).toString()+"\n"+
                "Tax Office:"+getTaxoffice().get(0).toString()+"\n"+
                "Customer Name:"+getCustname().get(0).toString()+"\n"+
                "Customer Adress:"+getCustadress().get(0).toString()+"\n"+
                "Customer Telephone:"+getCusttel().get(0).toString()+"\n"; //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    

    
    
    
    
}
