package pacote2;

import pacote1.Classe1;
import pacote1.Classe2; // errado a Classe2 deveria ser public e nao defult

public class Classe4 {
	
	public static void main(String[]args) {
		Classe1 classe2 = new Classe1();
		
		classe2.metodo();
		classe2.metodo1();//errado o metodo é defult por isso nao tem visibilidade o correto é public por estarem em pacotes diferentes
		classe2.metodo2();//errado o metodo é protected por isso nao tem visibilidade o correto é public por estarem em pacotes diferentes
		classe2.metodo3();//errado o metodo é private por isso nao tem visibilidade o correto é public por estarem em pacotes diferentes
	}
}
