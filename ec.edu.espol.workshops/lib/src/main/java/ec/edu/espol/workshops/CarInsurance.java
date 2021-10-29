package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {
	
	/*
	 * Verifica si cliente es hombre casado menor de 25.
	 * */
	public static void verificarJovenSoltero(Customer cliente) {
        if (cliente.getSex().toUpperCase().equals("M") && !cliente.isMarried() && (cliente.getAge() < 25)) {
            cliente.setBase(cliente.getBase() + 1500);
        }
    }
    
	/*
	 * Verifica si el cliente es mujer o si está casado
	 * */
    public static void verificarMujeroCasado(Customer cliente) {
        if (cliente.getSex().toUpperCase().equals("F") || cliente.isMarried()) {
            cliente.setBase(cliente.getBase() - 200);
        }
    }
    
    
    /*
     * Verifica si cliente tiene entre 45 y 64 años.
     * */
    public static void verificarEdad(Customer cliente) {
        if (cliente.getAge() >= 45 && cliente.getAge() < 65) {
            cliente.setBase(cliente.getBase() - 100);
        }
    }
    
    /*
     * Valida que el cliente sea menor de 80 años y tenga licencia de conducir.
     * */
    public static void validarPremium(Customer cliente) {
        if (cliente.getAge() > 80 || !cliente.hasDrivingLicense()) {
        	System.out.println("Cannot sell insurance to current customer.");
        	System.exit(-1);
        }
    }
    
    

public static void main(String[] args) {
    try (
	Scanner sc = new Scanner(System.in)) {
		System.out.println("Car Insurance Premium");
		
		System.out.println("Enter your age: ");
		String edad = sc.nextLine();
		System.out.println("Enter your sex(M/F): ");
		String sexo = sc.nextLine();
		System.out.println("Are you married or not?(Y/N): ");
		String estadoMarital = sc.nextLine();
		boolean casado = true;
		
		if ((estadoMarital.toUpperCase()).equals("Y")) {
		    casado = true;
		}
		else if ((estadoMarital.toUpperCase()).equals("N")) {
			casado = false;
		}
		
		
		System.out.println("Do you have a driver's license?(Y/N): ");
		String licencia = sc.nextLine();
		boolean tieneLicencia = true;
		
		if (licencia.toUpperCase().equals("Y")) {
			tieneLicencia = true;
		}
		else if (licencia.toUpperCase().equals("N")) {
			tieneLicencia = false;
		}
		
		Customer cliente = new Customer(Integer.parseInt(edad), sexo, casado, tieneLicencia);
		
		
		verificarJovenSoltero(cliente);
		verificarMujeroCasado(cliente);
		verificarEdad(cliente);
		
		validarPremium(cliente);
		
		System.out.println("The premium's value to pay is $ " + cliente.getBase() + ".");
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  

}

}
