package engine.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MarketOutput {
	private String path;
	
	public MarketOutput(String path) {
		this.path = path;
	}
	
	public void printTrades(String filename, String tradeList) {
		try {
			
			File output = new File(path + "trades/" + filename + ".txt");
			output.mkdirs();
			if (!output.createNewFile()) {
				output.delete();
				output.createNewFile();
			}
			
			FileWriter writer = new FileWriter(output);
			writer.write(tradeList);
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
