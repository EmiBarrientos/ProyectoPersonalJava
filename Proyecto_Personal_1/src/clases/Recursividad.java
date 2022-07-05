package clases;
import java.io.IOException;
import java.util.Scanner;

public class Recursividad extends Clase_Padre_Abstracta {
	
	@Override
	public void Ejercicios() throws IOException {
		int opcion;
		char caracter='s';	
		do {
			System.out.println("-----------------RECURSIVIDAD------------------");
			System.out.println("ingrese ejercicio");
			System.out.println("Ejercicio 1: Resultado de una division");
			System.out.println("Ejercicio 2: Conversion a binario");
			System.out.println("Ejercicio 3: Cuenta cifras de un num");
			System.out.println("Ejercicio 4: Eleva la potencia");
			System.out.println("Ejercicio 5: suma num");
			System.out.println("opcion 6:    menu anterior");
			opcion=sc.nextInt();
			do {
				switch(opcion) {
				case 1:
					Recursividad mensaje=new Recursividad();
					mensaje.ejercicio1();
					break;
				case 2:
					Recursividad mensaje2=new Recursividad();
					mensaje2.ejercicio2();
					break;
				case 3:
					Recursividad mensaje3=new Recursividad();
					mensaje3.ejercicio3();
					break;
				case 4:
					Recursividad mensaje4=new Recursividad();
					mensaje4.ejercicio4();
					break;
				case 5:
					Recursividad mensaje5=new Recursividad();
					mensaje5.ejercicio5();
					break;
				case 6:
					System.out.println("volviendo al menu anterior");
					Clase_Padre_Abstracta volver=new Recursividad();
					volver.operaciones();
					break;
				case 7:
					System.out.println("opcion incorrecta intente nuevamente");
					break;
				}
				
			}while(opcion>6 && opcion<0);
			System.out.println("desea intentar otro ejercicio? s para continuar");
			caracter=(char) System.in.read(); 
		}while(caracter=='s');
		
		
		
	}
	
	/**********************************************************************************************/
	
	public static void ejercicio1(){
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		do{
			System.out.println("ingrese dividendo(>0):");
			num1=sc.nextInt();
		}while(num1<=0);
		do {
		System.out.println("ingrese divisor(>0):");
		num2=sc.nextInt();
		}while(num2<=0);
		System.out.println("el resultado de la division es: "+division(num1,num2));
		
	}	
	
	public static int division(int num1, int num2) {
		if(num1<num2) {
			return 0;
		}else {
			return 1+division(num1-num2,num2);
		}	
	}
	
	/******************************************************************************************/
	public static void ejercicio2(){
		  Scanner sc=new Scanner(System.in);
				int numero;
				do{
					System.out.println("ingrese el numero a convertir a binario");
					numero=sc.nextInt();
				}while(numero<0);
				System.out.println("el numero en binario es: ");
				decimalABinario(numero);
				
			
			}	
			
			public static void decimalABinario(int n) {
				if(n<2) {
					System.out.print(n);
					return;
				}else {
					decimalABinario(n/2);
					System.out.print(n % 2);
					return;
			}
	  	}
	
	/***********************************************************************************************/

	public static void ejercicio3(){
		  Scanner sc=new Scanner(System.in);
				int num;
				do{
					System.out.println("ingrese numero >0 para saber cuantas cifras tiene");
					num=sc.nextInt();
				}while(num<=0);
				System.out.println("el numero tiene "+cuentaCifras(num)+" cifras");
				}
					
	public static int cuentaCifras(int n) {
				if(n<10) {
					return 1;
				}else {
					return 1+cuentaCifras(n/10);
				}
			}
			
	/*****************************************************************************************    */
	public static void ejercicio4(){
		Scanner sc=new Scanner(System.in);
			int numero;
			do{
				System.out.println("ingrese un numero >0");
				numero=sc.nextInt();
			}while(numero<=0);
			System.out.println("2 elevado a "+numero+" es:"+potencia(numero));
		}
			
	public static int potencia(int n) {
			if(n==0) {
				return 1;
			}else {
				return 2*potencia(n-1);
		}
					}
						
	/************************************************************************************************/
			
	public static void ejercicio5(){
			Scanner sc =new Scanner(System.in);
			int num;
			do{
				System.out.println("ingrese un numero >0");
				num=sc.nextInt();
			}while(num<=0);
			System.out.println("la suma de los numeros es: "+suma(num));

		}
					
	 public static int suma(int n) {
			if(n==1) {
				return 1;
			}else {
				return n+suma(n-1);
			}
		}
					
							
}
