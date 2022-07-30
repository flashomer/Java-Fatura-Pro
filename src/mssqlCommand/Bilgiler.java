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
public class Bilgiler {
    int id;
    int stockCode;
    String Description;
    float UnitPrice;
    int TaxRate;
    int Amount;

    public Bilgiler(int id, int stockCode, String description, float unitprice,int tax,int amount) {
        this.id = id;
        this.stockCode = stockCode;
        this.Description = description;
        this.UnitPrice = unitprice;
        this.TaxRate=tax;
        this.Amount=amount;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return Description;
    }

    public int getStockCode() {
        return stockCode;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public int getAmount() {
        return Amount;
    }

    public int getTaxRate() {
        return TaxRate;
    }

    @Override
    public String toString() {
        return "\n"+
              String.format("%30s", this.Description)+String.format("%30s", this.Amount)+String.format("%30s", this.UnitPrice)+String.format("%30s", this.TaxRate);
    }
    

    
    
    
    
    
}
