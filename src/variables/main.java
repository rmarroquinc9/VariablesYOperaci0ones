package variables;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String user =("Ester");
		
		int password =5358;
		
		
		System.out.println("==Inicio de Sesión==");
		System.out.println("Ingrese el nombre de usuario");
		String nommbreUsuario = sc.next();
		
		System.out.println("Ingrese su contraseña");
		int contraUsuario = sc.nextInt();
		
		
		
		 if (user.equals(nommbreUsuario) && password == contraUsuario);{
			System.out.println("Inicio de sesión");
			
			System.out.println("==Varianles==");
			int numeroEntero = sc.nextInt();
			
			
			System.out.println("Ingrese un número decimal");
			double numeroDecimal = sc.nextDouble();
			sc.nextLine();
			
			
			System.out.println("Ingrese un texto");
			String texto = sc.nextLine();
			
			System.out.print("Ingrese true o false: ");
			boolean valorBooleano = sc.nextBoolean();
			
			
			System.out.println("\nValores ingresados:");
			System.out.println("Entero: " + numeroEntero);
			System.out.println("Decimal: " + numeroDecimal);
			System.out.println("Texto:" + texto);
			System.out.println("Booleano:" + valorBooleano);
			
			System.out.println("==Operaciones Matematicas==");
			System.out.println("Ingrese primer número entero");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        System.out.print("Ingrese segundo número entero: ");
	        System.out.print("Ingrese segundo número entero: ");
	        
	        
	        System.out.println("Suma: " + (num1 + num2));
	        System.out.println("Resta: " + (num1 - num2));
	        System.out.println("Multiplicación: " + (num1 * num2));
	        
	        
	        
	        if (num2 != 0) {
	        	System.out.println("División: " + (num1 / num2));
	       
	        } else {
	        	System.out.println("No se puede dividir entre ceros");
	        	
	        }
	        
	        System.out.println("Nota: La división entre enteros elimina los decimales.");

	        
	        System.out.println("===Operaciones Matematicas (double)  ====");
	        
	        System.out.print("Ingrese primer número double: ");
	        double d1 = sc.nextDouble();
	        
	        System.out.print("Ingrese segundo número double: ");
	        double d2 = sc.nextDouble();
	        
	        System.out.println("División double: " + (d1 / d2));
	        System.out.print("Ingrese primer número float: ");
	        float f1 = sc.nextFloat();
	        
	        
	        System.out.print("Ingrese segundo número float: ");
	        float f2 = sc.nextFloat();
	        
	        System.out.println("División float: " + (f1 / f2));
	        
	        
	        System.out.println("===== Operaciones Matematicas (short) =====");
	        
	        System.out.print("Ingrese primer número short: ");
	        short s1 = sc.nextShort();
	        short s2 = sc.nextShort();
	        
	        System.out.println("Suma short: " + (s1 + s2));
	        
	        
	        System.out.println("===== Operaciones Matematcas  (byte) =====");

	        System.out.print("Ingrese primer número byte: ");
	        byte b1 = sc.nextByte();

	        System.out.print("Ingrese segundo número byte: ");
	        byte b2 = sc.nextByte();

	        System.out.println("Suma byte: " + (b1 + b2));
	        
	        System.out.println("==== Operaciones Lógicas ===");

	        System.out.print("Ingrese primer número: ");
	        int valorA = sc.nextInt();

	        System.out.print("Ingrese segundo número: ");
	        int valorB = sc.nextInt();
	        
	        System.out.println("Mator que:"+ (valorA > valorB));
	        System.out.println("Menor que: " + (valorA < valorB));
	        System.out.println("Igual: " + (valorA == valorB));

	        System.out.println("AND (valorA > 0 && valorB > 0): " + 
	                           (valorA > 0 && valorB > 0));

	        System.out.println("OR (valorA > 0 || valorB > 0): " + 
	                           (valorA > 0 || valorB > 0));
	        
	        System.out.println("=Clasificacion de edad=");
	        
	        System.out.println("Ingrese su edad: ");
	        int edad = sc.nextInt();
	        	if (edad < 12 )
	        		System.out.println("Niño");
	        	else if (edad < 17 )
	        		System.out.println("Adolecente");
	        	else if (edad < 59)
	        		System.out.println("Adulto");
	        	else if (edad < 60)
	        		System.out.println("Adulto Mayor");
	        	
	        	
	        	System.out.println("==Días de la semna==");
	        	int numeroDia = sc.nextInt();
	        	switch (numeroDia) {
	        	
	        	case 1:
	                System.out.println("Lunes");
	                break;
	            case 2:
	                System.out.println("Martes");
	                break;
	            case 3:
	                System.out.println("Miércoles");
	                break;
	            case 4:
	                System.out.println("Jueves");
	                break;
	            case 5:
	                System.out.println("Viernes");
	                break;
	            case 6:
	                System.out.println("Sábado");
	                break;
	            case 7:
	                System.out.println("Domingo");
	                break;
	            default:
	                System.out.println("Número inválido");

	        	
	        	}
	        	
	        
	        



	        
	        
	        
	        
	        
	        	
	        	
			
			
		 }
		 
		 
		 
		 
		 
		 
		
		sc.close();
		
		

	}

}
