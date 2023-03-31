package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.reader.ReaderAngajat;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ReaderAngajat readerAngajat=new ReaderAngajat();
		try {
			listaAngajati = readerAngajat.readApplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareaFinantarii();
				angajat.afisareStatus();
			}
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
