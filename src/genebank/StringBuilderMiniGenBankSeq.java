/*
 * Author: Swetali Patel
 * Course: BIF812
 * Instructor: Marek Laskowski
 * Declaration: I declare that the attached assignment is wholly my own work
 * in accordance with Seneca Academic Policy.  No part of this
 * assignment has been copied manually or electronically from any
 * other source (including web sites) or distributed to other students. 
 * Swetali Patel 072650146 
 */



package genebank;

public class StringBuilderMiniGenBankSeq extends MiniGenBankSeq {

	@Override 
	public void concatenate(String Stringbuilder, int time){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<=time; i++){
			System.out.println("Concatenating using Stringbuilder; time "+ i + "of"+time);
			sb.append(Stringbuilder);
		}
		sequence = sb.toString();
		

	}

}
