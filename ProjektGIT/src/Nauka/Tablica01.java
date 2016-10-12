package Nauka;

public class Tablica01 {
	public static void main(String[] args) {
		
		int[] table = new int[10];
		
	for(int y = 1; y <11; y++){
		
		for(int i = 0; i < table.length; i++){
			table[i] = i + 1;
			System.out.print((table[i]*y) + ", ");
			
		}
		System.out.println();
		}

	}
		
}
