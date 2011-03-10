/**
 * 
 * @author Yasser
 * 
 * This Class reads the input.txt file and fills the output.txt file
 *
 */

import helper.InputFiller;

import java.io.*;
import java.util.*;
import java.net.*;
import org.htmlcleaner.*;

public class PersianLetter {
	
	
	public static void main(String args[]){
		InputFiller inputfiller = new InputFiller();
		

		try {
			inputfiller.getMehrnewsPage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
