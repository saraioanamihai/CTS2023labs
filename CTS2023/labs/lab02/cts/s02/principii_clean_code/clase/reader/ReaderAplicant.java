package cts.s02.principii_clean_code.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	
	public abstract List<Aplicant> readApplicants(String file) throws FileNotFoundException;
	
    public void readFromFile(Scanner input, Aplicant aplicant) {
    	
    	aplicant.setNume(input.next());
    	aplicant.setPrenume(input.next());
		aplicant.setVarsta(Integer.valueOf(input.nextInt()));
		aplicant.setPunctaj(Integer.valueOf(input.nextInt()));
//		aplicant.setNr_proiecte(Integer.valueOf(input.nextInt()));
		
		int nr=input.nextInt();
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNr_proiecte(nr);
		aplicant.setDenumireProiect(vect);
    }

}
