package clases;
import java.util.Scanner;
import java.io.*;

public class Bucles extends Clase_Padre_Abstracta{

	@Override
	public void Ejercicios() throws IOException{
		int opcion;
		char car='s';
		
		
		do {
			System.out.println("\t******************* Bucles******************");
			System.out.println("ingrese ejercicio: ");
			System.out.println("1: Cantidad de cifras de un numero ingresado por teclado ");
			System.out.println("2: Dice si un numero ingresado por teclado es capicua o no ");
			System.out.println("3: Nota mas alta, mas baja y promedio de notas de alumnos ingresado por teclado");
			System.out.println("4: Media de numeros positivos y negativos en un array, ingresado por teclado");
			System.out.println("5: Menu anterior");
			opcion=sc.nextInt();
			
			do {
				switch (opcion) {
				case 1:
					Bucles mensaje=new Bucles();
					mensaje.ejercicio1();
					break;
				
				case 2:
					Bucles mensaje2=new Bucles();
					mensaje2.ejercicio2();
					break;
				
				case 3:
					Bucles mensaje3=new Bucles();
					mensaje3.ejercicio3();
					break;
					
				case 4:
					Bucles mensaje4= new Bucles();
					mensaje4.ejercicio4();
					break;
					
				case 5:
					System.out.println("volviendo al menu anterior");
					Clase_Padre_Abstracta volver=new Bucles();
					volver.operaciones();
					break;

				default:
					System.out.println("opcion invalida intente nuevamente");
					break;
				}
			}while(opcion>5 && opcion<1);
				System.in.read();
				System.out.println(" desea intentar con otro ejercicio? s para seguir");
				car=(char)System.in.read();
				System.in.read();		
		}while(car =='s');
		System.out.println("Graciasss, vuelva pronto!!!");
	}



public void ejercicio1() throws IOException{
	Scanner sc=new Scanner(System.in);
	int cont, num=0;
	char opcion;
	do {
		System.out.println("ingrese num");
		num=sc.nextInt();
		cont=0;
		while(num!=0) {
			num=num/10;
			cont++;
		}
	System.out.println("la cantidad de cifras es de: "+cont);
	System.out.println("desea ingresar otro numero? s para continuar");
	opcion=(char)System.in.read();	
	System.in.read();
	}while(opcion=='s');

}



	public void ejercicio2() throws IOException{
		Scanner sc= new Scanner(System.in);
		int num=0, aux=0, inverso=0, cifra;
		char opcion;
		do {
			do {
				System.out.println("ingrese num ");
				num=sc.nextInt();
			}while(num<10);
			
			aux=num;
			while(aux!=0) {
				cifra=aux%10;
				inverso= inverso*10+cifra;
				aux=aux/10;
				
			}
			if(num==inverso) {
				System.out.println("el numero es capicua");
			}else {
				System.out.println("el numero NO es capicua");
			}
			System.out.println("desea continuar? s para seguir");
			opcion=(char)System.in.read();
			System.in.read();
		}while(opcion=='s');

	}

	
	public void ejercicio3() throws IOException {
		Scanner sc = new Scanner(System.in);
		int nota=-1,mayor=0, menor=0, promedio=0, suma=0 ,cont =1;
		char opcion;
		
		while((nota<=0 )|| (nota>=11)) {
			System.out.println("ingrese nota: ");
			nota=sc.nextInt();
			if(nota<=0 || nota>=11) {
				System.out.println("ingrese una nota valida 1-10");
			}
		}
		
		suma=nota;
		mayor=nota;
		menor=nota;
		System.out.println("continuar? s para seguir");
		opcion=(char)System.in.read();
		System.in.read();
		
		while(opcion=='s') {
			do{
				System.out.println("ingrese nota: ");
				nota=sc.nextInt();
				
				if(nota<0 || nota>=11) {
					System.out.println("ingrese una nota valida 1-10");
				}
			
			}while(nota<=0 || nota>=11);
			
				suma=suma+nota;
			
			if(nota>mayor) {
				mayor=nota;
			}else if(nota<menor){
				menor=nota;
			}
			System.out.println("continuar? s para seguir");
			opcion=(char)System.in.read();
			System.in.read();
			cont++;
		}
		promedio=suma/cont;
		System.out.println("la nota mas alta es: "+mayor);
		System.out.println("la nota mas baja es: "+menor);
		System.out.println("el promedio de notas es: "+promedio);
		System.out.println("la cant de alumnos es: "+cont);

		
	}
	
	public void ejercicio4() throws IOException {
		Scanner sc=new Scanner(System.in);
		int  num_Positivos=0, num_Negativos=0;
		double suma_pos=0, suma_neg=0;
		int [] array=new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("ingrese un numero: ");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(array[i]>=0) {
				num_Positivos++;
				suma_pos+=array[i];
			}else {
				num_Negativos++;
				suma_neg+=array[i];
			}
			
		}
		
		if(num_Positivos!=0) {
			System.out.println("la media de los numeros positivos en el array es: "+ suma_pos/num_Positivos);
		}else {
			System.out.println("no ingreso num positivos");
		}
		
		if(num_Negativos!=0) {
			System.out.println("la media de los numeros negativos en el array es: " + suma_neg/num_Negativos);
		}else {
			System.out.println("no ingreso num negativos");
		}
	
	}
	
	public void ejercicio5() {
		Scanner sc=new Scanner(System.in);
		int  num_Positivos=0, num_Negativos=0;
		double suma_pos=0, suma_neg=0;
		int [] array=new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("ingrese un numero: ");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(array[i]>=0) {
				num_Positivos++;
				suma_pos+=array[i];
			}else {
				num_Negativos++;
				suma_neg+=array[i];
			}
			
		}
		
		if(num_Positivos!=0) {
			System.out.println("la media de los numeros positivos en el array es: "+ suma_pos/num_Positivos);
		}else {
			System.out.println("no ingreso num positivos");
		}
		
		if(num_Negativos!=0) {
			System.out.println("la media de los numeros negativos en el array es: " + suma_neg/num_Negativos);
		}else {
			System.out.println("no ingreso num negativos");
		}
	


	}
	
	public void ejercicio6() throws IOException{
		Scanner sc=new Scanner(System.in);
		int cant_personas=0, mayorMedia=0, menorMedia=0; 
		double media; 
		double suma=0;
		do {
			
			System.out.println("ingrese cantidad de personas");
			cant_personas=sc.nextInt();
			if(cant_personas<=0) {
				System.out.println("ingrese una cantidad valida");
			}
		}while(cant_personas<=0);
		double [] personas =new double[cant_personas];
		for(int i=0;i<cant_personas;i++) {
			System.out.println("ingrese altura de la persona"+ (i+1));
			personas[i]=sc.nextDouble();
			suma=suma+personas[i];
		}
		
		media=suma/cant_personas;
		for(int i=0;i<personas.length;i++) {
			if(personas[i]>media) {
				mayorMedia++;
			}else {
				menorMedia++;
			}
		}
		System.out.println("la altura media es de: "+media);
		System.out.println("la cantidad de personas que tienen una altura mayor a la media es: "+mayorMedia);
		System.out.println("la cantidad de personas que tienen una altura menor a la media es: "+menorMedia);
	
	}
	
	
	
	
}