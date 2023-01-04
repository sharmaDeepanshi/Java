package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=1;
        //checking for palindrome
        for (int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                flag=0;
            }
        }

        if(flag==0){
            System.out.println(str+" -->Not Palindrome");
        }
        else{
            System.out.println(str+" --> Palindrome");
        }
    }
}
