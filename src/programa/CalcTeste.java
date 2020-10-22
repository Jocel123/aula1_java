package programa;

import entidade.Calculadora;

public class CalcTeste {

	public static void main(String[] args) {
	
		System.out.println("ESTE É UM TESTE VOLTADO PRO NIVELAMENTO DE GIT/GITHUB.\n");
		
		Calculadora calc = new Calculadora();
		 calc.somar(2, 4);
		 calc.divisao(5, 2);
		 calc.subtracao(7, 3);
		 calc.multiplicacao(4, 3);

	}

}
