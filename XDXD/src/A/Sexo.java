package A;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sexo {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		int usuario = 0;
		int maquina = 0;
		
		while(true) {
			List<String> Opciones = Arrays.asList("Piedra", "Papel", "Tijera");
			String random = Opciones.get(new Random().nextInt(Opciones.size()));
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("[ Wins ]\nUsuario: "+usuario+"\nMaquina: "+maquina);
			System.out.print("\nPiedra, Papel o Tijera? ");
			String usuario_opciones = scan.nextLine();
			System.out.println("");
			switch (usuario_opciones) {
				case "Piedra":
					if (random == "Piedra") {
						System.out.println("Empate !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					else if (random == "Papel") {
						usuario++;
						System.out.println("Gano El Usuario !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					else if (random == "Tijera") {
						maquina++;
						System.out.println("Gano La Maquina !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					break;
				case "Papel":
					if (random == "Piedra") {
						System.out.println("Gano El Usuario !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						usuario++;
						Thread.sleep(4000);
					}
					else if (random == "Papel") {
						System.out.println("Empate !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					else if (random == "Tijera") {
						maquina++;
						System.out.println("Gano La Maquina !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					break;
					
				case "Tijera":
					if (random == "Piedra") {
						maquina++;
						System.out.println("Gano La Maquina !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					else if (random == "Papel") {
						usuario++;
						System.out.println("Gano El Usuario !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					else if (random == "Tijera") {
						System.out.println("Empate !\nUsuario: "+usuario_opciones+"\nMaquina: "+random+"\n");
						Thread.sleep(4000);
					}
					break;
				default:
					System.out.println("Esa Opcion No Existe");
					Thread.sleep(4000);
					break;
			}
		}

		
	}


}
