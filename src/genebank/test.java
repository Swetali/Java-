package genebank;

public class test extends MiniGenBankSeq {

	public static void main(String[] args) {
		MiniGenBankSeq mySample = new MiniGenBankSeq();
		long nanoseconds = mySample.testConcatenate(100000);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("concatenating took " + seconds + " seconds");


	}

}
