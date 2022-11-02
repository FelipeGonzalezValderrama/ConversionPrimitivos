package holaMundo;

import java.util.Scanner;

public class ConversionPrimitivos {

	public static void main(String[] args) {
		// convertir String a int
		var edad = Integer.parseInt("20");
		System.out.println("la edad es " + (edad + 1));
		// convertir String a Double
		var valorPi = Double.parseDouble("3.1416");
		System.out.println("el valor de PI es " + valorPi);
		// pedir datos por pantalla y convertir

		try (var sc = new Scanner(System.in)) {
			System.out.println("Ingresa tu Edad");
			edad = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("edad= "+(edad+1));
		
		var edadtexto = String.valueOf(20);
		System.out.println("edadTexto = " +edadtexto);
		
		var caracter = "Hola".charAt(0);
		System.out.println("caracter = "+caracter);
		
		

	
			
		}
		
		
		
		

	}


