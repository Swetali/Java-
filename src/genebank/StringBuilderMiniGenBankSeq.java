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
