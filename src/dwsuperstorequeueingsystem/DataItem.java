/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwsuperstorequeueingsystem;

/**
 *
 * @author User
 */
public class DataItem {
    
    private String regNum1;
    private String regNum2;
    private String prioNum3;
    private int num;
    private String tokenNumber;
    
    public DataItem(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }
    
    public String getTokenNumber() {
        return tokenNumber;
    }

    public int getData() {
        return num;
    }

    DataItem() {
        regNum1 = regNum2 = prioNum3 = null;
        num = 0;
    }

    DataItem(String regNum1, String regNum2, String prioNum3) {
        this.regNum1= regNum1;
        this.regNum2 = regNum2;
        this.prioNum3 = prioNum3;
    }

    DataItem(DataItem item) {
        regNum1 = item.regNum1;
        regNum2 = item.regNum2;
        prioNum3 = item.prioNum3;
    }

    public DataItem getDataItem() {
        return this;
    }

    public void setRegNum1(String regNum1) {
        this.regNum1 = regNum1;
    }
    
    public void setRegNum2(String regNum2) {
        this.regNum2 = regNum2;
    }

    public void setPrioNum3(String prioNum3) {
        this.prioNum3 = prioNum3;
    }

    public String getRegNum1() {
        return regNum1;
    }
    
    public String getRegNum2() {
        return regNum2;
    }

    public String getPrioNum3() {
        return prioNum3;
    }

}
