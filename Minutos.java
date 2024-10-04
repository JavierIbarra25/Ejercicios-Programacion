import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    
	    Scanner segundos = new Scanner (System.in);
	    System.out.println("Escribe los segundos");
	    
	    int segundos_iniciales = segundos.nextInt();
	    int minutos = segundos_iniciales / 60;
	    int segundos_restantes = segundos_iniciales % 60;
	    
	    System.out.println(minutos + "," + segundos_restantes + " minutos");
	}
}
