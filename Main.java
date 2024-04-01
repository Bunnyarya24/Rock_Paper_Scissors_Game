package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock , 1 for paper & 2 for scissor ");
        int user= sc.nextInt();
        Random r= new Random();
        int comp= r.nextInt(3);
        if(user ==0 && comp==2 || user==1&& comp==0 || user==2 && comp==0){
            System.out.println("You won ");
        }
        else if (user==0 && comp==0 || user == 1 && comp==1 || user==2 && comp==2){ //or we can use (user==comp) in the condition part of the      else if       statement
            System.out.println("Game Draw");
        }
        else{
            System.out.println("You lose ");
        }
        if (comp==0)
            System.out.println("computer choose : Rock");
        else if (comp==1)
            System.out.println("computer choose : Paper");
        else
            System.out.println("computer choose : Scissor");
    }
}
