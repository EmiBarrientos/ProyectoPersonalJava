package clases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Arraylist extends Clase_Padre_Abstracta {
	public void Ejercicios() throws IOException {
		int opcion;
		char c='s';
		do {
			System.out.println("***********************Arraylist******************************");
			System.out.println("Ejercicio 1: ingresa altura de alumnos y dice altura media, cuantos la superan y cuantos no");
			System.out.println("Ejercicio 2: ingresa num y dice num ingresados, media, suma, y num que superan la media");
			System.out.println("Ejercicio 3: desplaza los elemenentos del arraylist a la derecha y al ultimo lo pone primero");
			System.out.println("Ejercicio 4: carga un arraylist de string y muestra el elemento de mayor tamaño");
			System.out.println("Ejercicio 5:  carga un arraylist de objetos autos y devuelve por km, marca, nombre y el arraylist completo");
			System.out.println("6: manu anterior");
			System.out.println("Ingrese opcion: ");
			opcion=sc.nextInt();
			do {
				switch(opcion) {
				case 1:
					Arraylist mensaje1= new Arraylist();
					mensaje1.ejercicio1();
					break;
				
				case 2:
					Arraylist mensaje2= new Arraylist();
					mensaje2.ejercicio2();
					break;
					
				case 3:
					Arraylist mensaje3= new Arraylist();
					mensaje3.ejercicio3();
					break;
					
				case 4:
					Arraylist mensaje4= new Arraylist();
					mensaje4.ejercicio4();
					break;
					
				case 5:
					Arraylist mensaje5= new Arraylist();
					mensaje5.ejercicio5();
					break;
					
				case 6:
					System.out.println("volviendo al menu anterior");
					Clase_Padre_Abstracta volver=new Arraylist();
					volver.operaciones();
					break;
				default:
					System.out.println("opcion incorrecta, intente nuevamete");
					break;
				}	
			}while(opcion>6 && opcion<1);
			
			System.out.println(" desea intentar con otro ejercicio? s para seguir");
			c=(char)System.in.read();
			System.in.read();	
		}while(c=='s');
			System.out.println("graciasssssssssssssssss");	
	}

	
	/***************************************************
	 * lee altura de alumnos ingresado por teclado y te dice  la media y cuantos superan la media y cuantos no
	 *  ***********************************************/
	//ejercicio 1
	public void ejercicio1() {
		ArrayList<Double> altura=new ArrayList<>();
		int n=0;
		double media=0;
		n=numAlumnos();
		leerAltura(altura, n);
		media=media(altura);
		muestraAltura(altura, media);
		System.out.println(altura);
	}
	//metodos ejercicio 1
	public static int numAlumnos() {
		Scanner sc=new Scanner(System.in);
		int numAlumnos;
		do {
			System.out.println("ingrese cant de alumnos");
			numAlumnos=sc.nextInt();
			
		}while(numAlumnos<=0);
		return numAlumnos;
	}
	
	public static void leerAltura(ArrayList<Double> a, int n) {
		Scanner sc=new Scanner(System.in);
		double altura=0;
		for(int i=0;i<n;i++) {
			do {
				System.out.println("ingrese altura del alumno "+ (i+1));
				altura=sc.nextDouble();
				if(altura<=0) {
					System.out.println("ingrese altura valida");
				}
			
			}while(altura<=0);	
			a.add(altura);
		}
	}
	
	public static double media(ArrayList<Double> a) {
		double media=0;
		for(Double d: a) {
			media=media+d;
		}
	return media/a.size();		
	}
	
	public static void muestraAltura (ArrayList<Double> a, double media) {
		int mayor=0, menor=0; 
		for(Double d:a) {
			if(d>media) {
				mayor++;
			}else if(d<media){
				menor++;		
			}
		}
		
		System.out.printf("la altura media es de : %.2f %n", media);
		System.out.println("la cantidad de alumnos que superan la altura media es de :"+mayor);
		System.out.println("la cantidad de alumnos que NO superan la altura media es de :"+menor);
	}
	
	
	/************************************************************************************************
	 * lee por teclado numeros, los mete en un ArrayList y te dice la suma, los numeros ingresados, 
	 * la media y la cantidad de numeros que superan la media
	 * ***********************************************************************************************/
	 //ejercicio2
	public void ejercicio2() {
		ArrayList<Integer> lista=cargaArrayInt();
		double suma=sumaArrayList(lista);
		double media=suma/lista.size();
		muestraResultados(lista,suma,media);
	}
	//metodos ejercicio2
	public static ArrayList<Integer> cargaArrayInt(){
		ArrayList<Integer> carga=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int valor=0;
		do {
			System.out.println("ingrese valor : (-99 para terminar)");
			valor=sc.nextInt();
			if(valor != -99) {
				carga.add(valor);
			}
		}while(valor!= -99);
		
		return carga;
	}
	
	public static double sumaArrayList(ArrayList<Integer> a){
		double suma=0;
		for(int d:a) {
			suma+=d;
		}
		return suma;
	}
	
	
	public static void muestraResultados(ArrayList<Integer> a, double suma, double media) {
		int cont=0;
		System.out.println("la suma del arraylist es: "+ suma);
		System.out.println("la media del arraylist es: %.2f %n "+ media);
		System.out.println("ArrayList :");
		System.out.println(a);
		for(Integer d: a) {
			if(d>media) {
				cont++;
			}
		}
		System.out.println("la cantidad de numeros que superan la media es de: " +cont);
	}
	
	/********************************************************************************************
	 * ejercicio3
	 * desplaza el array un lugar a la derecha y al ultimo elemento lo pone primero
	 * 
	 * ****************************************************************************************+**/
		
	public void ejercicio3() {
		ArrayList<Integer> list=new ArrayList<>();
		cargaArrayList(list);
		System.out.println(list);
		desplazarDerecha(list);
		System.out.println("el array desplazado queda:");
		System.out.println(list);
	}
	//metodos ejercicio3
	public static void desplazarDerecha(ArrayList<Integer> a){
		int aux;
		aux=a.get(a.size()-1);
		for(int i=a.size()-1;i >0; i--) {
			a.set(i, a.get(i-1));
		}
		a.set(0, aux);	
	}
	
	public static void cargaArrayList(ArrayList<Integer> a) {
		Scanner sc=new Scanner(System.in);
		int i=0, flag=0, aux=0, opcion=0;
		do {
			System.out.println("ingrese un num entero para la posicion " +i+ "del arrayList");
			aux=sc.nextInt();
			a.add(aux);
			i++;
			System.out.println("desea ingresar otro num? 1 para continuar");
			opcion=sc.nextInt();
			if(opcion!=1) {
				flag=2;
			}
		}while(flag==0);
	
	}
	/********************************************************************************************
	 * ejercicio 4
	 * carga un arraylist de Strings, luego compara sus elementos y devuelve el elemento de 
	 * mayor tamaño 
	 * 
	 * ****************************************************************************************+**/

	public void ejercicio4() {
		ArrayList<String> cadena=new ArrayList<>();
		String aux;
		cargaArraylistString(cadena);
		System.out.println(cadena);
		
		aux=mayorString(cadena);
		System.out.println(aux);
		
	}
	public static void cargaArraylistString(ArrayList<String> c) {
		Scanner sc= new Scanner(System.in);
		String s;
		boolean seguir;
		int i=0;
		do {
			seguir=true;
			System.out.println("ingrese string para la posicion " +i+" del arraylist (fin para terminar)");
			s=sc.nextLine();
			if(s.equalsIgnoreCase("fin")|| s.equalsIgnoreCase("FIN")) {
				seguir=false;
			}else {
				c.add(s);
			}
			i++;
		}while (seguir);
		
	}
	
	public static String mayorString(ArrayList <String> c) {
		String cadena;
		cadena=c.get(0);
		for(int i=0;i<c.size();i++) {
			if(cadena.length() < c.get(i).length()) {
				cadena=c.get(i);
			}
		}
			
		return cadena;
	}
		
	/********************************************************************************************
	 *ejercicio 5
	 *manejo de un Arraylist de objetos
	 * @throws IOException 
	 * 
	 * 
	 * *****************************************************************************************/	
		
	public void ejercicio5() throws IOException {
		ArrayList<Auto> auto=new ArrayList<>();
		cargarAuto(auto);
		muestraArrayListAuto(auto);
	
		
		System.out.println("el auto con mas km es:"+ muestraMayorKm(auto));
	
		
		muestraAutoPorMarca(auto);
		
		muestraAutoPorKm(auto);
		
		muestraAutoOrdenado(auto);
		
	}
	
	public static void cargarAuto(ArrayList<Auto> auto) throws IOException {
		Scanner sc=new Scanner(System.in);
		String matricula;
		String marca;
		String modelo;
		int km;
		Auto aux;
		char opcion;
		
		do {
			System.out.println("ingresando datos del auto");
			sc.nextLine();
			System.out.println("matricula: ");
			matricula=sc.nextLine();
			System.out.println("marca:");
			marca=sc.nextLine();
			System.out.println("modelo:");
			modelo=sc.nextLine();
			System.out.println("km:");
			km=sc.nextInt();
			sc.nextLine();
			aux=new Auto();
			aux.setMatricula(matricula);
			aux.setMarca(marca);
			aux.setModelo(modelo);
			aux.setKm(km);
			auto.add(aux);
			sc.nextLine();
			System.out.println("desea ingresar otro auto? s para continuar");
			opcion=(char)System.in.read();
		}while(opcion=='s');
		
	}
	

	public static void muestraArrayListAuto(ArrayList<Auto> a) {
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
			System.out.println("--------------------------------");
		}
	}
	
	public static void muestraAutoPorMarca(ArrayList<Auto> a) {
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		String aux;
		System.out.println("ingrese marca a buscar:");
		aux=sc.nextLine();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getMarca().equalsIgnoreCase(aux)) {
				System.out.println(a.get(i));
				System.out.println("--------------------------");
			}
		}
	}
	
	public static void muestraAutoPorKm(ArrayList<Auto> a) {
		Scanner sc=new Scanner(System.in);
		int auxKm;
		System.out.println("ingrese num de km ");
		auxKm=sc.nextInt();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getKm() < auxKm) {
				System.out.println(a.get(i));
				System.out.println("--------------------------");
			}
		}
	}
	
	public static Auto muestraMayorKm(ArrayList<Auto> a) {
		Auto aux=a.get(0);
		for(int i=1;i<a.size();i++) {
			if(a.get(i).getKm()>aux.getKm()) {
				aux=a.get(i);
				System.out.println("--------------------------");
			}
		}
		return aux;	
	}
	
	public static void muestraAutoOrdenado(ArrayList<Auto>a) {
		Auto aux=new Auto(); 
		for(int i =0;i<a.size()-1;i++) {
			for(int j=0;j<a.size()-i-1;i++) {
				if(a.get(j+1).getKm() < a.get(j).getKm()) {
					aux=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1, aux);
					
					
				}
			}
		}
		System.out.println("_____________________________ array ordenado");
		muestraArrayListAuto(a);
	}
	
	
	
}





