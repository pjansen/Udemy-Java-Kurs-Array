
public class WasIstEinArray {

	public static void main(String[] args) {
		
		// Variablen Deklaration
		// Datentyp Name = Wert;
		
		int zahl = 50;
		double zahl1;
		
		// Array Deklaration
		// Datentyp [] Name = new Datentyp[Anzahl Einträge]
		
		int [] zahlenArray = new int [7];
		zahlenArray[3] = 50;
		zahlenArray[5] = 500;
		zahlenArray[0] = 40;
		
		double [] zahlenArray1 = new double[7];
		zahlenArray1[1] = 34.23;
		zahlenArray1[4] = 50.45;

		String [] personA = { "Peter", "Müller", "35" };
		System.out.println("Name: " + personA[0]);
		
	}

}
