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

public class PersianLetter {
	
	
	public static void main(String args[]){
		PersianLetter pl = new PersianLetter();
		//pl.fillInput();
		
		try {
			pl.processInput();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//pl.superUsefulMethod();
		
	}
	
	public void fillInput(){
		
		InputFiller inputfiller = new InputFiller();
		try {
			inputfiller.getMehrnewsPage().findMehrnewsLinks().fillInputFileWithLinksInHashTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void processInput() throws Exception{
		String file = "input.txt";
		Hashtable<Character, Integer> hashtable	= new Hashtable<Character, Integer>();
		FileInputStream fis = new FileInputStream(new File(file));
		InputStreamReader isr = new InputStreamReader(fis, "UTF8");
		
		int c;
		while((c = isr.read()) != -1){
			Character currectChar = new Character((char) c);
			
			Integer number = hashtable.get(currectChar);
			if(number == null){
				hashtable.put(currectChar, new Integer(1));
			}
			else{
				hashtable.put(currectChar, new Integer(number.intValue() + 1));
			}
		}
		
		
		Character alef = new Character('آ');
		int _alef;
		Character alef_2 = new Character('ا');
		int _alef_2;
		
		Character be = new Character('ب');
		int _be;
		Character pe = new Character('پ');
		int _pe;
		Character te = new Character('ت');
		int _te;
		Character se = new Character('ث');
		int _se;
		Character jim  = new Character('ج');
		int _jim;
		Character che = new Character('چ');
		int _che;
		Character he = new Character('ح');
		int _he;
		Character khe = new Character('خ');
		int _khe;
		
		Character dal = new Character('د');
		int _dal;
		Character zal = new Character('ذ');
		int _zal;
		Character re = new Character('ر');
		int _re;
		Character ze = new Character('ز');
		int _ze;
		Character zhe  = new Character('ژ');
		int _zhe;
		Character sin = new Character('س');
		int _sin;
		Character shin = new Character('ش');
		int _shin;
		Character sad = new Character('ص');
		int _sad;
		
		Character zad = new Character('ض');
		int _zad;
		Character ta = new Character('ط');
		int _ta;
		Character za = new Character('ظ');
		int _za;
		Character ain = new Character('ع');
		int _ain;
		Character ghain  = new Character('غ');
		int _ghain;
		Character fe = new Character('ف');
		int _fe;
		Character ghaf = new Character('ق');
		int _ghaf;
		Character kaf = new Character('ک');
		int _kaf;
		//Character kaf_2 = new Character('ك');
		//int _kaf_2;
		
		Character ge = new Character('گ');
		int _ge;
		Character lam = new Character('ل');
		int _lam;
		Character mim = new Character('م');
		int _mim;
		Character non = new Character('ن');
		int _non;
		Character vav  = new Character('و');
		int _vav;
		Character he_2cheshm = new Character('ه');
		int _he_2cheshm;
		Character ye = new Character('ی');
		int _ye;
		//Character ye_2 = new Character('ي');
		//int _ye_2;
		
		
		int totalNumber = 0;
		
		_alef = hashtable.get(alef).intValue();
		totalNumber += _alef;

		_alef_2 = hashtable.get(alef_2).intValue();
		totalNumber += _alef_2;

		_be = hashtable.get(be).intValue();
		totalNumber += _be;

		_pe = hashtable.get(pe).intValue();
		totalNumber += _pe;

		_te = hashtable.get(te).intValue();
		totalNumber += _te;

		_se = hashtable.get(se).intValue();
		totalNumber += _se;

		_jim = hashtable.get(jim).intValue();
		totalNumber += _jim;

		_che = hashtable.get(che).intValue();
		totalNumber += _che;

		_he = hashtable.get(he).intValue();
		totalNumber += _he;

		_khe = hashtable.get(khe).intValue();
		totalNumber += _khe;

		_dal = hashtable.get(dal).intValue();
		totalNumber += _dal;

		_zal = hashtable.get(zal).intValue();
		totalNumber += _zal;

		_re = hashtable.get(re).intValue();
		totalNumber += _re;

		_ze = hashtable.get(ze).intValue();
		totalNumber += _ze;

		_zhe = hashtable.get(zhe).intValue();
		totalNumber += _zhe;

		_sin = hashtable.get(sin).intValue();
		totalNumber += _sin;

		_shin = hashtable.get(shin).intValue();
		totalNumber += _shin;

		_sad = hashtable.get(sad).intValue();
		totalNumber += _sad;

		_zad = hashtable.get(zad).intValue();
		totalNumber += _zad;

		_ta = hashtable.get(ta).intValue();
		totalNumber += _ta;

		_za = hashtable.get(za).intValue();
		totalNumber += _za;

		_ain = hashtable.get(ain).intValue();
		totalNumber += _ain;

		_ghain = hashtable.get(ghain).intValue();
		totalNumber += _ghain;

		_fe = hashtable.get(fe).intValue();
		totalNumber += _fe;

		_ghaf = hashtable.get(ghaf).intValue();
		totalNumber += _ghaf;

		_kaf = hashtable.get(kaf).intValue();
		totalNumber += _kaf;

		//_kaf_2 = hashtable.get(kaf_2).intValue();
		//totalNumber += _kaf_2;

		_ge = hashtable.get(ge).intValue();
		totalNumber += _ge;

		_lam = hashtable.get(lam).intValue();
		totalNumber += _lam;

		_mim = hashtable.get(mim).intValue();
		totalNumber += _mim;

		_non = hashtable.get(non).intValue();
		totalNumber += _non;

		_vav = hashtable.get(vav).intValue();
		totalNumber += _vav;

		_he_2cheshm = hashtable.get(he_2cheshm).intValue();
		totalNumber += _he_2cheshm;

		_ye = hashtable.get(ye).intValue();
		totalNumber += _ye;

		//_ye_2 = hashtable.get(ye_2).intValue();
		//totalNumber += _ye_2;
		
		FileWriter fw = new FileWriter(new File("output.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		
		_alef += _alef_2;
		double _alef_ = (double) _alef * 100  / (double) totalNumber;
		bw.write(String.format("alef\t:\t%d\t:\t%.2f \n", _alef, _alef_));

		double _be_ = (double) _be * 100 / (double) totalNumber;
		bw.write(String.format("be\t:\t%d\t:\t%.2f \n", _be, _be_));

		double _pe_ = (double) _pe * 100 / (double) totalNumber;
		bw.write(String.format("pe\t:\t%d\t:\t%.2f \n", _pe, _pe_));

		double _te_ = (double) _te * 100 / (double) totalNumber;
		bw.write(String.format("te\t:\t%d\t:\t%.2f \n", _te, _te_));

		double _se_ = (double) _se * 100 / (double) totalNumber;
		bw.write(String.format("se\t:\t%d\t:\t%.2f \n", _se, _se_));

		double _jim_ = (double) _jim * 100 / (double) totalNumber;
		bw.write(String.format("jim\t:\t%d\t:\t%.2f \n", _jim, _jim_));

		double _che_ = (double) _che * 100 / (double) totalNumber;
		bw.write(String.format("che\t:\t%d\t:\t%.2f \n", _che, _che_));

		double _he_ = (double) _he * 100 / (double) totalNumber;
		bw.write(String.format("he\t:\t%d\t:\t%.2f \n", _he, _he_));

		double _khe_ = (double) _khe * 100 / (double) totalNumber;
		bw.write(String.format("khe\t:\t%d\t:\t%.2f \n", _khe, _khe_));

		double _dal_ = (double) _dal * 100 / (double) totalNumber;
		bw.write(String.format("dal\t:\t%d\t:\t%.2f \n", _dal, _dal_));

		double _zal_ = (double) _zal * 100 / (double) totalNumber;
		bw.write(String.format("zal\t:\t%d\t:\t%.2f \n", _zal, _zal_));

		double _re_ = (double) _re * 100 / (double) totalNumber;
		bw.write(String.format("re\t:\t%d\t:\t%.2f \n", _re, _re_));

		double _ze_ = (double) _ze * 100 / (double) totalNumber;
		bw.write(String.format("ze\t:\t%d\t:\t%.2f \n", _ze, _ze_));

		double _zhe_ = (double) _zhe * 100 / (double) totalNumber;
		bw.write(String.format("zhe\t:\t%d\t:\t%.2f \n", _zhe, _zhe_));

		double _sin_ = (double) _sin * 100 / (double) totalNumber;
		bw.write(String.format("sin\t:\t%d\t:\t%.2f \n", _sin, _sin_));

		double _shin_ = (double) _shin * 100 / (double) totalNumber;
		bw.write(String.format("shin\t:\t%d\t:\t%.2f \n", _shin, _shin_));

		double _sad_ = (double) _sad * 100 / (double) totalNumber;
		bw.write(String.format("sad\t:\t%d\t:\t%.2f \n", _sad, _sad_));

		double _zad_ = (double) _zad * 100 / (double) totalNumber;
		bw.write(String.format("zad\t:\t%d\t:\t%.2f \n", _zad, _zad_));

		double _ta_ = (double) _ta * 100 / (double) totalNumber;
		bw.write(String.format("ta\t:\t%d\t:\t%.2f \n", _ta, _ta_));

		double _za_ = (double) _za * 100 / (double) totalNumber;
		bw.write(String.format("za\t:\t%d\t:\t%.2f \n", _za, _za_));

		double _ain_ = (double) _ain * 100 / (double) totalNumber;
		bw.write(String.format("ain\t:\t%d\t:\t%.2f \n", _ain, _ain_));

		double _ghain_ = (double) _ghain * 100 / (double) totalNumber;
		bw.write(String.format("ghain\t:\t%d\t:\t%.2f \n", _ghain, _ghain_));

		double _fe_ = (double) _fe * 100 / (double) totalNumber;
		bw.write(String.format("fe\t:\t%d\t:\t%.2f \n", _fe, _fe_));

		double _ghaf_ = (double) _ghaf * 100 / (double) totalNumber;
		bw.write(String.format("ghaf\t:\t%d\t:\t%.2f \n", _ghaf, _ghaf_));

		double _kaf_ = (double) _kaf * 100 / (double) totalNumber;
		bw.write(String.format("kaf\t:\t%d\t:\t%.2f \n", _kaf, _kaf_));

		//double _kaf_2_ = (double) _kaf_2 * 100 / (double) totalNumber;
		//bw.write(String.format("kaf_2\t:\t%d\t:\t%.2f \n", _kaf_2, _kaf_2_));

		double _ge_ = (double) _ge * 100 / (double) totalNumber;
		bw.write(String.format("ge\t:\t%d\t:\t%.2f \n", _ge, _ge_));

		double _lam_ = (double) _lam * 100 / (double) totalNumber;
		bw.write(String.format("lam\t:\t%d\t:\t%.2f \n", _lam, _lam_));

		double _mim_ = (double) _mim * 100 / (double) totalNumber;
		bw.write(String.format("mim\t:\t%d\t:\t%.2f \n", _mim, _mim_));

		double _non_ = (double) _non * 100 / (double) totalNumber;
		bw.write(String.format("non\t:\t%d\t:\t%.2f \n", _non, _non_));

		double _vav_ = (double) _vav * 100 / (double) totalNumber;
		bw.write(String.format("vav\t:\t%d\t:\t%.2f \n", _vav, _vav_));

		double _he_2cheshm_ = (double) _he_2cheshm * 100 / (double) totalNumber;
		bw.write(String.format("he_2cheshm\t:\t%d\t:\t%.2f \n", _he_2cheshm, _he_2cheshm_));

		double _ye_ = (double) _ye * 100 / (double) totalNumber;
		bw.write(String.format("ye\t:\t%d\t:\t%.2f \n", _ye, _ye_));

		//double _ye_2_ = (double) _ye_2 * 100 / (double) totalNumber;
		//bw.write(String.format("ye_2\t:\t%d\t:\t%.2f \n", _ye_2, _ye_2_));

		bw.flush();
		bw.close();
		fw.close();
		
		System.out.println("Total Number of Persian Letters in input: " + totalNumber);
	}
	
	private void superUsefulMethod(){
		String[] strings = new String[35];
		
		try {
			FileReader fr = new FileReader(new File("output.txt"));
			BufferedReader br = new BufferedReader(fr);
			String line;
			int i = 0;
			while((line = br.readLine()) != null){
				strings[i++] = line;
			}
			
			br.close();
			fr.close();
			
			FileWriter fw = new FileWriter(new File("output.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int j = 0; j < strings.length; j++){
				bw.append("double " + strings[j] + "_ = (double) " + strings[j] + " / (double) totalNumber;");
				bw.newLine();
				bw.append("bw.write(String.format(\"" + strings[j].substring(1) + "\\t:\\t%d\\t:\\t%.2f\", " + strings[j] + ", " + strings[j] + "_));");
				bw.newLine();
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			fw.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
