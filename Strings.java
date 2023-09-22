package cursojava_repeticao;

public class Strings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase(); // deixa tudo em minúsculo
		String s02 = original.toUpperCase(); //deixa tudo em maiúsculo
		String s03 = original.trim(); //elimina espaços no começo ou fim
		String s04 = original.substring(2); //cria uma nova string a partir do ponto definido no argumento — nesse caso, o (2)
		String s05 = original.substring(2,5); //cria uma nova string começando do caracter definido no argumento e terminando no outro.
		String s06 = original.replace ('a', 'x'); //ele troca o primeiro argumento pelo segundo. **CASE SENSITIVE**
		String s07 = original.replace("abc", "xy"); //mesmo que o de cima, só que com substrings inteiras. **CASE SENSITIVE**
		int i = original.indexOf ("bc"); //ele considera o valor pra variável int ser o da posição da string. Então, nesse caso, 1. **CASE SENSITIVE**
		int j = original.lastIndexOf("bc"); //ele considera a posição da última ocorrência da string e atribui o número ao int. **CASE SENSITIVE**
		
				
		System.out.println("Original -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring: -" + s04 + "-");
		System.out.println("substring (2 argumentos): -" + s05 + "-");
		System.out.println("replace: -" + s06 + "-");
		System.out.println("replace (substring): -" + s07 + "-");
		System.out.println("Index of 'bc' : " + i);
		System.out.println("Last index of 'bc': " + j);
		
	}

}
