package com.company.vizor101_Towers;

import java.util.Scanner;

/**
 * Created by Administrator on 28.12.16.
 */
public class Action {
    public static void Action() {
        int pressButton;

        Scanner scanner = new Scanner(System.in);
        pressButton = scanner.nextInt();

        if (pressButton == 1) {
            WatchBuildings.WatchBuildings();
        } else if (pressButton == 2){
            BuildBuilding.BuildBuilding();
        } else if (pressButton == 3){
            BuildMine.BuildMine();
        } else if (pressButton == 0){
            NextDay.NextDay();
        } else {
            System.out.println("Не понимаю");
        }
    }
}