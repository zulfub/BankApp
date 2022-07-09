package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	public static List<String[]> read(String file){
		String dataRow;
		List<String[]> data = new LinkedList<String[]>();
		
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(file));
			while ((dataRow = buffRead.readLine())!= null){
				String[]dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File Could Not Read");
			e.printStackTrace();
		}
		return data;
	}
}
