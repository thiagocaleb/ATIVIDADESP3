package pacote2;

import pacote1.Classe1;
import pacote1.Classe2;// errado a Classe2 deveria ser public e nao defult

public class Classe3 {
	
	public static void main(String[]args) {
		Classe1 classe = new Classe1();
		
		classe.metodo();
		classe.metodo1();//errado o metodo � defult por isso nao tem visibilidade o correto � public por estarem em pacotes diferentes
		classe.metodo2();//errado o metodo � protected por isso nao tem visibilidade o correto � public por estarem em pacotes diferentes
		classe.metodo3();//errado o metodo � private por isso nao tem visibilidade o correto � public por estarem em pacotes diferentes
	}
	
}
