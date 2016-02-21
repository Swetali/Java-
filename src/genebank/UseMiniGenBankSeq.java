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

public class UseMiniGenBankSeq {

	public static void main(String[] args) {
		//Instantiating the MiniGenBankSeq class 
		
		MiniGenBankSeq Mini_GenBankSeq = new MiniGenBankSeq();
		
		System.out.println(Mini_GenBankSeq);
		Mini_GenBankSeq.setlocus("NC_001781              15225 bp    RNA     linear   VRL 30-NOV-2009");
		Mini_GenBankSeq.setaccession("NC_001781.1  GI:9629198");
		Mini_GenBankSeq.setdefinition(" Human respiratory syncytial virus, complete genome.");
		Mini_GenBankSeq.setsource("Human respiratory syncytial virus (HRSV)");
		
		System.out.println("\nThis is after initializing: " + Mini_GenBankSeq);
		
		
		/*Instantiating the MiniGenBankSeq class second time, using the two argument constructor.
		 * 
		 */
		MiniGenBankSeq Mini_GenBankSeq2 = new MiniGenBankSeq("Test1", "TestAcces");
		
		System.out.println(Mini_GenBankSeq2);
		Mini_GenBankSeq2.setdefinition("Human respiratory syncytial virus, complete genome.");
		Mini_GenBankSeq2.setsource("Human respiratory syncytial virus (HRSV)");
		
		System.out.println("\nThis is after initalizing: " + Mini_GenBankSeq2);
		
		
		
		MiniGenBankSeq Mini_GenBankSeq3 = new MiniGenBankSeq("Test2", "Test3", "Test4", "Test5");
		/*Instantiating the MiniGenBankSeq class for the third time, using the 4 argument constructor.
		 * 
		 */
		System.out.println(Mini_GenBankSeq3);

	}

}
