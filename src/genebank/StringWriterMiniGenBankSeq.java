package genebank;
import java.io.StringWriter;

public class StringWriterMiniGenBankSeq extends MiniGenBankSeq{

	@Override 
	public void concatenate(String Stringwriter, int time) {
		StringWriter sw = new StringWriter();
		for(int i=0; i<=time; i++){
			System.out.println("Concatenating using Stringwriter; time "+ i + "of"+time);
			sw.append(Stringwriter);
		}
		sequence = sw.toString();
		

	}

}
