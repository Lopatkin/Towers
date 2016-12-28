package com.company.vizor101_Towers;

/**
 * Created by Administrator on 28.12.16.
 */
public class Building {
    public String Name;
    public int buildPrice;
    public int income;

    //getters
    public String getName() {
        return Name;
    }
    public int getBuildPrice() {
        return buildPrice;
    }
    public int getIncome() {
        return income;
    }

    //setters
    public void setName(String name) {
        Name = name;
    }
    public void setBuildPrice(int buildPrice) {
        this.buildPrice = buildPrice;
    }
    public void setIncome(int income) {
        this.income = income;
    }

    public void BuildHQ(){
        Building HQ = new Building();
        HQ.setName("Штаб");
        HQ.setBuildPrice(0);
        HQ.setIncome(1000);
    }

}
