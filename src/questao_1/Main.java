/* 1) Observe o trecho de c�digo abaixo:
int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE fa�a
{
K = K + 1;
SOMA = SOMA + K;
}
imprimir(SOMA);
Ao final do processamento, qual ser� o valor da vari�vel SOMA?*/

package questao_1;

public class Main {

	public static void main(String[] args) {
		int soma = 0;
		int k = 0;
		int indice = 13;
		
		while(k < indice) {
			
			k = k + 1;
			soma = soma + k;
		}
		
		System.out.println(soma);

		//soma = 91
	}

}
