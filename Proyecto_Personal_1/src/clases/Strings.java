package clases;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Strings extends Clase_Padre_Abstracta{

	@Override
	public void Ejercicios() throws IOException {
		Scanner sc= new Scanner(System.in);
		char car;
		int opcion;
		do{
			do {
				System.out.println("*******************************Manejo de strings**********************");
				System.out.println("ingrese ejercicio");
				System.out.println("1:cuenta palabras en un texto ingresado por teclado");
				System.out.println("2: elimina ultima palabra de un string");
				System.out.println("3: cuenta la cant de veces que aparece un caracter en un texto");
				System.out.println("4: menu principal");
				opcion=sc.nextInt();
				switch(opcion) {
				 	case 1: 
				 		Strings mensaje1=new Strings();
				 		mensaje1.ejercicio1();
				 		break;
					case 2:
						Strings mensaje2=new Strings();
				 		mensaje2.ejercicio1();
				 		break;
					case 3: 
						Strings mensaje3=new Strings();
				 		mensaje3.ejercicio1();
				 		break;
					case 4: 
						Clase_Padre_Abstracta mensaje4=new Strings();
						mensaje4.operaciones();
				 		break;
					default:
						System.out.println("opcion incorrecta intente nuevamente");
				 		break;
				}
				
			}while(opcion<1 && opcion>4);
			System.in.read();
			System.out.println("desea intentar otro ejercicio? s para seguir");
			car=(char)System.in.read();
		}while(car!='s');
	}
	/*****************************************************************************************************/
	public static void ejercicio1() {
		Scanner sc=new Scanner(System.in);
		String frase;
		System.out.println("ingrese frase:");
		frase=sc.nextLine();
		//cuentaPalabrasTok(frase);
		System.out.println("las cant de palabras que tiene el string es de:"+cuentaPalabras(frase));		
		
	}
	
	public static void cuentaPalabrasTok(String s) {
		
		StringTokenizer str=new StringTokenizer(s);
		System.out.println("las cant de palabras que tiene el string es de:"+str.countTokens());

	}
	
	public static int cuentaPalabras(String s) {
		int cont=1, pos=0;
		s.trim();
		if(s.isEmpty()) {
			cont=0;
		}else {
			while(pos!=-1) {
				cont++;
				pos=s.indexOf(" ", pos+1);
			}
		}
		return cont;
	}


	/*****************************************************************************************************/
	public static void ejercicio2(){
		Scanner sc=new Scanner(System.in);
		String frase;
		System.out.println("elimina la ultima palabra de un string ingresado por teclado.");
		do{
			System.out.println("ingrese frase");
			frase=sc.nextLine();
		}while(frase.isEmpty());
		System.out.println(frase);
		frase=eliminaUltPalabra(frase);
	
		System.out.println(frase);
	}
	

	public static String eliminaUltPalabra(String a) {	
		int pos;
		a.trim();
		pos=a.lastIndexOf(" ");
		if(pos != -1) {
			a=a.substring(0,pos);
		}else {
			a = "";
		}
		return a;
	}
	/*****************************************************************************************************/
	public static void ejercicio3() throws IOException {
		Scanner sc=new Scanner(System.in);
		String texto;
		int cantChar=0;
		do {
			System.out.println("ingrese texto");
			texto=sc.nextLine();
		}while(texto.isEmpty());
		
		cantChar=cuentaCaracter(texto);
		System.out.println("la cant de veces que aparece el caracter es de:"+cantChar);
	}
	
	public static int cuentaCaracter(String s) throws IOException {
		int cont=0, pos=0;
		char caracter;
		System.out.println("ingrese caracter a buscar: ");
		caracter=(char)System.in.read();
		pos=s.indexOf(caracter);
		s.trim();
		if(s.isEmpty()) {
			System.out.println("no ingreso frase");
		}else {
			while(pos!=-1) {
				pos=s.indexOf(caracter, pos+1);
				cont++;
			}
		}
		return cont;
	}
	
	
	
	
}	
	

