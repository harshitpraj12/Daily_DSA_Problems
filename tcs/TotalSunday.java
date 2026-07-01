package tcs;

import java.util.Scanner;

public class TotalSunday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = sc.nextInt();
        int count = 0;
        --a;
        int day = 0;
        switch (str) {
            case "mon":
                day+=6;
                while(day<=a){
                    count++;
                    day+=7;
                }
                break;
            case "tue":
                day+=5;
                if(a>=day){
                    count=1+(a-day)/7;
                }
                break;
            case "wed": 
                day+=4;
                if(a>=day){
                    count=1+(a-day)/7;
                }   
                break;
            case "thu":
                day+=3;
                if(a>=day){
                    count=1+(a-day)/7;
                }
                break;
            case "fri":  
                day+=2;
                if(a>=day){
                    count=1+(a-day)/7;
                } 
                break;
            case "sat":
                day+=1;
                if(a>=day){
                    count=1+(a-day)/7;
                }
                break;
            case "sun":
                day+=7;
                count++;
                if(a>=day){
                    count=1+(a-day)/7;
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("Number of sunday : "+ count);
    }
}
