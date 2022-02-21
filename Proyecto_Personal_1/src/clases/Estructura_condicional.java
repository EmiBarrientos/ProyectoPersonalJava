package clases;
import java.util.Scanner;
import java.io.*;

public class Estructura_condicional extends Clase_Padre_Abstracta {
	@Override
	public void Ejercicios() throws IOException{	
		int opcion=0;
		char car='s';
		
		do {
			
			System.out.println("\t******************* Estructura condicional******************");
			System.out.println("ingrese ejercicio: ");
			System.out.println("1: Hola  + tu nombre");
			System.out.println("2: Doble y triple de un numero ingresado por teclado");
			System.out.println("3: Conversion de grados a fahrenheit ");
			System.out.println("4: Paro o impar de un numero ingresado por teclado ");
			System.out.println("5: Multiplo de 10 de un numero ingresado por teclado ");
			System.out.println("6: Compara 2 caracteres ingresados por teclado y te dice si son iguales o no");
			System.out.println("7: ingresa 2 caracteres por teclado y te dice cual es minuscula ");
			System.out.println("8:menu principal ");
			opcion=sc.nextInt();
			do {
				switch (opcion) {
					case 1:
						Estructura_condicional mensaje=new Estructura_condicional();
						mensaje.ejercicio1();
						break;
					
					case 2:
						Estructura_condicional mensaje2=new Estructura_condicional();
						mensaje2.ejercicio2();	
						break;
				
					case 3:
						Estructura_condicional mensaje3=new Estructura_condicional();
						mensaje3.ejercicio3();
						break;
					
					case 4:
						Estructura_condicional mensaje4=new Estructura_condicional();
						mensaje4.ejercicio4();
						break;
					
					case 5:
						Estructura_condicional mensaje5=new Estructura_condicional();
						mensaje5.ejercicio5();
						break;
						
					case 6:
						Estructura_condicional mensaje6=new Estructura_condicional();
						mensaje6.ejercicio6();
						break;
					
					case 7:
						Estructura_condicional mensaje7=new Estructura_condicional();
						mensaje7.ejercicio7();
						break;
					
					case 8:
						System.out.println("volviendo al menu anterior");
						Clase_Padre_Abstracta volver=new Estructura_condicional();
						volver.operaciones();
						break;
					
					default:
						System.out.println("opcion invalida, intente nuevamente");
							break;
				}
			}while (opcion>8 && opcion<1);
				System.in.read();
				System.in.read();
				System.out.println("desea continuar con otro ejercicio? s para volver al menu");
				car=(char)System.in.read();
				System.in.read();
		}while(car=='s');		
		
		System.out.println("Graciasss vuelva prontoo!!");
}
		
	public void ejercicio1() { 

		Scanner sc=new Scanner(System.in);
		String nombre;
		System.out.println("holaa ingresa tu nombre");
		nombre=sc.nextLine();
		System.out.println("holaaa "+nombre);
	}
		
	public void ejercicio2() {
		
		Scanner sc=new Scanner(System.in);
		int valorInicial=0, doble=0,triple=0;
		System.out.println("ingrese num");
		
		
		valorInicial=sc.nextInt();
		doble=valorInicial * 2; 
		triple=valorInicial * 3;
		
		System.out.println("doble="+doble);
		System.out.println("triple="+triple);
	}
	
	public void ejercicio3() {
		Scanner sc=new Scanner(System.in);
		float gradosC=0, fahrenheit=0 ; 
		System.out.println("ingrese grados centigrados ");
		gradosC=sc.nextFloat();
		fahrenheit= 32 + (9*gradosC/5);
		System.out.println("grados:"+gradosC);
		System.out.println("fahreneit:"+fahrenheit);
			
	}

	public void ejercicio4() {
	 	Scanner sc=new Scanner(System.in);
		int numero=0;
		System.out.println("ingrese num:");
		numero= sc.nextInt();
		
		if((numero%2) > 0) {
			System.out.println("su numero es impar");
		}else {
			System.out.println("su numero es par");
		}
	}

	public void ejercicio5() {
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("ingrese num");
		num=sc.nextInt();
		
		if(num%10 == 0) {
			System.out.println("el num es multiplo de 10");
		}else {
			System.out.println("el numero  no  es multiplo de 10");
		}
		
	}
	
	public void ejercicio6() throws IOException {
		char car1;
		char car2;
		System.out.print("ingrese un caracter: ");
		car1= (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("ingrese el segundo caracter: ");
		car2= (char)System.in.read();
		
		if(car1 == car2) {
			System.out.println("son iguales");
		}else {
			System.out.println("NO son iguales");
		}
		
		
		
		
	}
	
	public void ejercicio7() throws IOException{
		char car1, car2;
		System.out.println("ingrese caracter:");
		car1= (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("ingrese segundo caracter:");
		car2=(char)System.in.read();
		
		if(Character.isLowerCase(car1)) {
			if(Character.isLowerCase(car2)) {
				System.out.println("los dos caracteres estan en minuscula");	
			}else {
				System.out.println("solo el primer caracter esta en minuscula");
			}		
		}else if(Character.isLowerCase(car2)) {
			System.out.println("solo el segundo caracter esta en minuscula");
			
			}else {
			System.out.println("ninguno es minuscula");
			}	
	}
}
