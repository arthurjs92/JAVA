package AvaInter1_ArthurJS;

public class Validacao {
	public static boolean validaNome(String nome) {
		
		String[] separa = nome.split(" ");
		
		String[] primeiro = separa[0].split("");
		
		if(separa.length>=3)
			if(primeiro.length>=3)
				return true;
		return false;
	}
}
