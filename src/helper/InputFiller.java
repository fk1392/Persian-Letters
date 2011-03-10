package helper;

import java.io.*;
import java.util.*;
import java.net.*;
import org.htmlcleaner.*;

public class InputFiller {
	
	String mehrnewsURL = "http://www.mehrnews.ir/txtNewsView_fa.aspx?t=News&Page=1";
	String mehrnewsSavePath = "mehrnews.html";
	
	Hashtable<Integer, URL> mehrnewslinks;
	
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
	
	public InputFiller findMehrnewsLinks() throws IOException{
		
		String className = "news_title";
		
		mehrnewslinks = new Hashtable<Integer, URL>();
		
		HtmlCleaner cleaner = new HtmlCleaner();
		TagNode rootNode = cleaner.clean(new File(mehrnewsSavePath));
		
		TagNode aElements[] = rootNode.getElementsByName("a", true);
		
		String classType;
		String href;
		for(int i = 0; aElements != null && i < aElements.length; i++){
			classType = aElements[i].getAttributeByName("class");
			if(classType != null && classType.equals(className)){
				href = aElements[i].getAttributeByName("href");
				href = "http://www.mehrnews.ir/" + href;
				mehrnewslinks.put(new Integer(i), new URL(href));
			}
		}
		
		
		return this;
	}
	
	

	
	

}
