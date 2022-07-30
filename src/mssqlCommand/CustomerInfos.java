/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlCommand;

/**
 *
 * @author suleyman
 */
public class CustomerInfos {
    String TaxNo    ;
    String TaxOffice;
    String CustName;
    String CustAddress;
    String CustTel;

    public CustomerInfos(String TaxNo, String TaxOffice, String CustName, String CustAddress, String CustTel) {
        this.TaxNo = TaxNo;
        this.TaxOffice = TaxOffice;
        this.CustName = CustName;
        this.CustAddress = CustAddress;
        this.CustTel = CustTel;
    }

    public String getTaxNo() {
        return TaxNo;
    }

    public String getTaxOffice() {
        return TaxOffice;
    }

    public String getCustName() {
        return CustName;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public String getCustTel() {
        return CustTel;
    }

   
    
}
