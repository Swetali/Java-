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

public class testSB {

	public static void main(String[] args) {
		StringBuilderMiniGenBankSeq test100000 = new StringBuilderMiniGenBankSeq();
		long nanoseconds = test100000.testConcatenate(100000);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("concatenating using StringBuilder 100,000 took " + seconds + " seconds");

		StringBuilderMiniGenBankSeq test10000 = new StringBuilderMiniGenBankSeq();
		long nanoseconds10k = test10000.testConcatenate(100000);
		double seconds10k = nanoseconds10k / (double)1000000000; 
		System.out.println("concatenating using StringBuilder 10,000 took " + seconds10k + " seconds");
		
		StringBuilderMiniGenBankSeq test1000 = new StringBuilderMiniGenBankSeq();
		long nanoseconds1k = test1000.testConcatenate(1000);
		double seconds1k = nanoseconds1k / (double)1000000000; 
		System.out.println("concatenating using StringBuilder 1000 took " + seconds1k + " seconds");
		
		StringBuilderMiniGenBankSeq test100 = new StringBuilderMiniGenBankSeq();
		long nanoseconds100 = test100.testConcatenate(100);
		double seconds100 = nanoseconds100 / (double)1000000000; 
		System.out.println("concatenating using StringBuilder 100 took " + seconds100 + " seconds");
	
		StringBuilderMiniGenBankSeq test10 = new StringBuilderMiniGenBankSeq();
		long nanoseconds10 = test10.testConcatenate(10);
		double seconds10 = nanoseconds10 / (double)1000000000; 
		System.out.println("concatenating using StringBuilder 10 took " + seconds10 + " seconds");	
	}
	

}
