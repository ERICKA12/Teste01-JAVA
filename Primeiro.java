// nome, sobrenome, idade, salario e um indicadtivo se é desenvolvedor java ou não
// string, string, int, float ou double, boolean
// a função println sempre converte para string
// função Wrapper: 
// char - String (letra maiuscula identificam classes)
// int - Integer
// float - Float


public class Primeiro {

	// visibilidade tipo-retorno nome parametros

	// visibilidade private: 
	// visibilidade public: todas as classes podem ver a informação
	// tipo retorno void: guardar informaçoes
	//tipo retorno String, int, float, boolean

	private static String[] parametros;
	private static int idade;
	private static float salario;
	private static String nome;					  						  //valor padrão eh null
	private static String sobrenome;
	private static boolean ehJava;
	private static int qtdMeses;

	private static void tratarParametros() {
		nome = parametros[0];					  						  //valor padrão eh null
		sobrenome = parametros[1];				   						 // null
		idade = Integer.valueOf(parametros[2]);	   							 // 0
		salario = Float.valueOf(parametros[3]);	    					 //0.0
		ehJava = "S".equalsIgnoreCase(parametros[4]) ? true : false;
		// boolean: se não preencher nada o valor padrão é False
		// operador ternario: tipo result = condicao? true : false
		qtdMeses = Integer.valueOf(parametros[5]);

	}

	private static boolean validar (int qtde){

		return qtde == 6;
	}

		
	public static void main(String[] args) {

		

		if (validar(args.length)) {
			parametros = args;

			tratarParametros();			

			int anoNascimento = 2021 - idade;
			float salarioTotal = salario * qtdMeses;
			
			//String status;

			//if(idade <= 50) {
				//status = "Iniciante";
			//} else {
				//status = "Veterano";
			//}

			// outra maneira de implementar a condição usando o operador ternário:

			String nivel = idade <= 50 ? "Iniciante" : "Veterano";
			String situacao = salarioTotal > 1000 ? "Estavel" : "Instavel";


			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Nascimento: " + anoNascimento);
			System.out.println("Salario: " + salario);
			System.out.println("Java?: " + ehJava);
			System.out.println("Salario Total: " + salarioTotal);
			System.out.println("Nivel: " + nivel);
			System.out.println("Situacao: " + situacao);
			

		} else {

			System.out.println("Problemas na quantidade de parametros.");
		}

	}

}


