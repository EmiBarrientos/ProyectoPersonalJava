package clases;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public abstract class Clase_Padre_Abstracta{
	
	Scanner sc=new Scanner(System.in);

	public void operaciones() throws IOException {
		try{
			int flag=0;
			int opcion=0;
			
			do {
				do {
					
					System.out.println("-----------------------Proyecto personal 1---------------------------- ");
					System.out.println("elija opcion: ");
					System.out.println("estructura condicional: 1");
					System.out.println("bucles: 2");
					System.out.println("Arraylist: 3");
					System.out.println("Strings: 4");
					System.out.println("Recursividad: 5");
					System.out.println("salir: 6");
					System.out.println("-----------------------------------------------------------------------");
					opcion=sc.nextInt();
					switch (opcion) {
						case 1:
							Clase_Padre_Abstracta mensaje=new Estructura_condicional();
							mensaje.Ejercicios();
							break;
							
						case 2:
							Clase_Padre_Abstracta mensaje2= new Bucles();
							mensaje2.Ejercicios();		
							break;
							
						case 3:
							Clase_Padre_Abstracta mensaje3=new Arraylist();
							mensaje3.Ejercicios();
							break;
					
						case 4:
							Clase_Padre_Abstracta mensaje4=new Strings();
							mensaje4.Ejercicios();
							break;
							
						case 5:
							Clase_Padre_Abstracta mensaje5= new Recursividad();
							mensaje5.Ejercicios();
							break;
							
						case 6:
							System.out.println("has been a pleasure, thanks for coming");
							flag=1;
							break;
							
						default:
							System.out.println("opcion incorrecta ingrese opcion valida");
							break;
					}
				}while((opcion>5) && (opcion<1));
				
			}while(flag==0);	
		
		}catch(Exception e){
			System.out.println("me rompiste :(");
		}finally {
			System.out.println("graciass, vuelva prontoss!");
		}
		
	}
	
	public abstract void Ejercicios() throws IOException;
		
}

