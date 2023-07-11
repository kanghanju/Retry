package codeTree.practice;

import java.util.Scanner;

class Info{
	String date;
	String day;
	String weather;
	
	public Info(String date,String day,String weather) {
		this.date = date;
		this.day = day;
		this.weather = weather;
	}
}


public class Rainy_Day {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        Info[] arr = new Info[n];
        Info ans = new Info("9999-99-99","","");
        
        for(int i = 0; i<n;i++) {
        	String date = sc.next();
        	String day = sc.next();
        	String weather = sc.next();
        	arr[i] = new Info(date,day,weather);
        	
        	if(weather.equals("Rain")) {
        		
        		if(ans.date.compareTo(arr[i].date)>0) {
        			ans = arr[i];
        		}
        	}
        }
        
        System.out.println(ans.date+" "+ans.day+" "+ans.weather);
        
        
    }

}
