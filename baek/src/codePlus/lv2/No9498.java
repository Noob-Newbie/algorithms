package codePlus.lv2;

import java.util.Scanner;

public class No9498 {
    public static void main(String[] args) {
    	//9498
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	
    	String result = "";
    
    	if(a >= 90) {
    		result = "A";
    	}else if(a >= 80 && a<90) {
    		result = "B";
    	}else if(a >= 70 && a<80) {
    		result = "C";
    	}else if(a >= 60 && a<70) {
    		result = "D";
    	}else {
    		result = "F";   
    	}
    	
    
    	
    	System.out.print(result);
    			
    }
}
