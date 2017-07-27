//Tangy F. Rock paper scissors game. Practice with Dialogue box
package com.cre8tivedevs;
import javax.swing.JOptionPane;
import java.util.Random;
public class RPS1 {
	int rock=1, paper=2, scissors=3;

	public static void main(String[] args) {
		
		//System.out.println("Welcome to Rock Paper Scissors");
		RPS2 obj1=new RPS2();

		RPS1.userInput();
		obj1.processData();

	}

	//user Input
	//personal reminder:static means the method belongs to the class and not an object
	public static void userInput(){
		
		
		JOptionPane.showInputDialog("Welcome to Rock Paper Scissors n/ Choose from the following: \n 1)Rock \n 2)Paper \n 3)Scissors");
	
	}
	
	// add a Random Method
	
	
	//process data a
	public void processData(){
		//if player chooses 1 they win 
		int choose=1;

		if (choose==1){
			JOptionPane.showMessageDialog(null, "It's a tie");	
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Try again");	
		}
}
	
}