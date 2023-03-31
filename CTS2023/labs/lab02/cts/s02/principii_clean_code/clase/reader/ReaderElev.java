package cts.s02.principii_clean_code.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

public class ReaderElev extends ReaderAplicant{
	
	public List<Aplicant> readApplicants(String file) throws FileNotFoundException{
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<>();

		while (input2.hasNext()) {
			Elev elev=new Elev();
			
			super.readFromFile(input2, elev);
			elev.setClasa(Integer.valueOf(input2.nextInt()));
			elev.setTutore(input2.next());
			
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}




}
