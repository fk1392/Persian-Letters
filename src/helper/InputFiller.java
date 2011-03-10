package helper;

import java.io.*;
import java.util.*;
import java.net.*;


import org.htmlcleaner.*;

public class InputFiller {
	
	String mehrnewsURL = "http://www.mehrnews.ir/txtNewsView_fa.aspx?t=News&Page=1";
	String mehrnewsSavePath = "mehrnews.html";
	
	public InputFiller getMehrnewsPage() throws IOException{
		
		URL mehrnews = new URL(mehrnewsURL);
		URLConnection mehrnewsConnection = mehrnews.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(mehrnewsConnection.getInputStream()));
		
		FileWriter writer = new FileWriter(new File(mehrnewsSavePath));

		String htmlLine;
		while((htmlLine = reader.readLine()) != null){
			writer.append(htmlLine);
		}
		
		writer.flush();
		writer.close();
		reader.close();
		
		return this;
	}
	

}
