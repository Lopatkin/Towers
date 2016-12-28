package com.company.vizor101_Towers;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 28.12.16.
 */
public class Resource {

    //MONEY
    public static int money = 1000000; //стартовый капитал
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }


    //BUILDINGS
    public Array[] arrBuildings;
    public void setArrBuildings(Array[] arrBuildings) {
        this.arrBuildings = arrBuildings;
    }

    public Array[] getArrBuildings() {
        return arrBuildings;
    }
}
