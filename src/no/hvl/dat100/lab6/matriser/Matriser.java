package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main (String[] args) {
		
		
	}
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] i : matrise) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String k = "";
		for (int[] i : matrise) {
			for (int j : i) {
				k += j + " ";
			}
			k += "\n";
		}
		return k;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] skalert = new int [matrise.length][matrise[0].length];
		for (int m = 0; m < matrise.length; m++) {
			for (int n = 0; n < matrise[m].length; n++) {
				skalert[m][n] = matrise[m][n] * tall;
			}
		}
		return skalert;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean k = true;
		for (int m = 0; m < a.length; m++) {
			for (int n = 0; n < a[m].length; n++) {
				if(a[m][n] == b[m][n]) {
				}else {k = false;}
			}
		}
		return k;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		int [][] speilet = new int [matrise.length][matrise[0].length];
		
		for (int m = 0; m < matrise.length; m++) {
			for (int n = 0; n < matrise[m].length; n++) {
				if (m>=n) {
				speilet[m][n] = matrise[n][m];
				speilet[n][m] = matrise[m][n];
				}
			}
		}
		return speilet;
		
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int xNew = b[0].length;
		int yNew = a.length;
		
		int[][] multiplisert = new int [xNew][yNew];
		
		
		for (int y_multiplisert = 0; y_multiplisert < yNew; y_multiplisert++) {
			
			for (int x_multiplisert = 0; x_multiplisert < xNew; x_multiplisert++) {
				
				int sum = 0;
				
				for (int i = 0; i < a.length; i++) {
					sum += a[y_multiplisert][i] * b[i][x_multiplisert];
							
				}
				multiplisert[y_multiplisert][x_multiplisert] = sum;
				
	
			}
			
		}
		return multiplisert;
	
	}
}