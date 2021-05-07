
public class Primeiro {
	public static void main(String[] args) {

		if (args.length == 5) {

			String nome = args[0];					    //valor padr�o eh null
			String sobrenome = args[1];				    // null
			int idade = Integer.valueOf(args[2]);	    // 0
			float salario = Float.valueOf(args[3]);	    //0.0
			int anoNascimento = 2021 - idade;
			int qtdMeses = Integer.valueOf(args[5]);
			float salarioTotal = salario * qtdMeses;
			String status = "iniciante/veterano";
			

			// boolean: se n�o preencher nada o valor padr�o � False

			
			// operador ternario: tipo result = condicao? true : false

			boolean ehJava = "S".equalsIgnoreCase(args[4]) ? true : false;


			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Nascimento: " + anoNascimento);
			System.out.println("Salario: " + salario);
			System.out.println("Java?: " + ehJava);
			System.out.println("Salario Total: " + salarioTotal);
			System.out.println("Status: " + status);

		} else {

			System.out.println("Problemas na quantidade de parametros.");
		}
			
		

	}
	

}
