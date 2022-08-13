package questao_5;

public class Main {

	public static void main(String[] args) {
		String string = "inverterString";
		System.out.println(string);
		
		StringBuilder invertida = new StringBuilder();
		
		for (int i = (string.length() - 1); i >= 0; i--) {
			
			invertida.append(string.charAt(i));
		}
		System.out.println(invertida);

	}

}
