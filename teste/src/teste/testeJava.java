package teste;

import java.util.*;

class javaTeste {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, soma;
		//ler  variável
		System.out.println("Insira um número: ");
		num1 = sc.nextInt();
		System.out.println("Insira outro número: ");
		num2 = sc.nextInt();
		
		//somar
		soma = num1 + num2;
		System.out.println(soma);
		

	}

}