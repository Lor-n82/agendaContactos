import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aplicacionAgenda {

	static Scanner tc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String respuesta, n, a, d, t;
		boolean resp = false;
		
		ArrayList<contacto>lista=new ArrayList<>();
		
		int menu=0;
		
		//MENU
		System.out.print("Bienvenido al programa");
		
		do {
			
			System.out.println("\n1. Agregar contacto\n"+
					"2. Mostrar\n"+
					"3. Salir");
			
			System.out.print("\nElija la opcion deseada: ");
			try {
			menu=tc.nextInt();
			}catch(InputMismatchException e) {
				tc.nextLine();
				System.out.println("Error, opcion incorrecta");
			}
			
		while(menu>3) {
			
			System.out.println("Error, opcion incorrecta");
			System.out.println("\n1. Agregar contacto\n"+
					"2. Mostrar\n"+
					"3. Salir");
		try {	
			System.out.print("\nElija la opcion deseada: ");
			menu=tc.nextInt();
		}catch(InputMismatchException e) {
			tc.nextLine();
			System.out.println("Error, opcion incorrecta");
			}
		}
		
		//AGREGAR
		if(menu==1) {
			tc.nextLine();
		
		do {
			
			System.out.print("Introduzca el nombre: ");
			n=tc.nextLine();
			
			System.out.print("Introduzca el Apellido: ");
			a=tc.nextLine();
			
			do {
				
				System.out.print("Introduzca el DNI: ");
				d=tc.nextLine();
				
				Pattern pat = Pattern.compile("\\d{8}-[A-Z]$");
				Matcher mat = pat.matcher(d);
				
				if(mat.matches()) {
					resp=true;
				}else {
					System.out.println("DNI no valido !!!");
				}
				
			}while(!resp);
			
			resp=false;
			
			do {
				
				System.out.print("Introduzca el Telefono: ");
				t=tc.nextLine();
				
				Pattern pat1 = Pattern.compile("\\d{9}$");
				Matcher mat = pat1.matcher(t);
				
				if(mat.matches()) {
					resp=true;
				}else {
					System.out.println("Telefono no valido !!!");
				}
				
			}while(!resp);
			
			do {
				
				System.out.print("Desea introducir otro contacto (Si/No) ");
				respuesta=tc.nextLine();
			
			if(respuesta.equalsIgnoreCase("si"))
				resp=true;
			else
				resp=false;
			
			}while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
			
			if(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
				System.out.println("Error, introduce una opcion valida");
			}
			
			lista.add(new contacto(n, a, d, t));
			
		}while(resp);
		
		}
		
		//MOSTRAR
		else if(menu==2) {
			for(int i=0;i<lista.size();i++) {
				System.out.println("\n"+lista.get(i));
			}
		
		//SALIR
			}else if(menu==3) {
				System.out.println("\nFin del programa");
			}
		
		}while(menu!=3 || menu>3);
		
	}

}
