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
		InputStream mehrnewsIS = mehrnewsConnection.getInputStream();
		
		OutputStream mehrnewsOS = new FileOutputStream(new File(mehrnewsSavePath));
		int onebyte;
		while(mehrnewsIS.available() != 0){
			onebyte = mehrnewsIS.read();
			mehrnewsOS.write(onebyte);
		}
		
		mehrnewsIS.close();
		mehrnewsOS.flush();
		mehrnewsOS.close();
		
		return this;
	}

	
	

}
