
plant
using System;

public class Ejemplo43b {
	public static void Main() {
		string ejemplo = "uno,dos.tres,cuatro";
		char [] delimitadores = {' ', '.'};
		int i;

		Console.WriteLine("introduce una frase");
		ejemplo = Console.ReadLine();

		string [] ejemploPartido = ejemplo.Split(delimitadores);
		
		for (i = (ejemploPartido.Length-1); i>=0; i--)
			Console.WriteLine("Fragmento {0}= {1}", i, ejemploPartido[i]); 
	}
}
