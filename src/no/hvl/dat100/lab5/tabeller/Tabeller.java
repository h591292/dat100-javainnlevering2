package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			
			System.out.print(tabell[i]);
			if(i != tabell.length - 1) {
				System.out.print(", ");
			}
		}


	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		
			for (int i = 0; i < tabell.length; i++) {
			
				streng += tabell[i];
				if (i != tabell.length-1) {
					streng += ",";
				}
			
		}
		
			streng += "]";
		
			return streng;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for (int i : tabell) {
			sum += i;
		}
			
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i : tabell) {
			if (i == tall) {
				return true;
			}
		} return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		} return (-1);

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversert = new int [(tabell.length)];
		int j;
			
		for(int i = tabell.length - 1; i >= 0; i--) {
			j = tabell.length - 1 - i;
			reversert[j] = tabell[i];
		}
			
		return reversert;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			int m = tabell[i];
			int n = tabell[i + 1];
			
			if (m > n) {
				return false;
			}
			
			
		}
		
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length + tabell2.length];
		int i = 0;
		
		for (int m : tabell1) {
			sammensatt[i] = m;
			i++;
		}
		for (int m : tabell2) {
			sammensatt[i] = m;
			i++;
		}
		return sammensatt;
	}
}
