package com.company.vizor101_Towers;

/**
 * Created by Administrator on 28.12.16.
 */
public class NextDay {
    private static int dayCounter;
    public static void NextDay(){
        ++dayCounter;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Наступил новый " + dayCounter + " день!");
        System.out.println("Ваши деньги: " + Resource.money);
        Message.Message();
    }
}
