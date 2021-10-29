package ec.edu.espol.workshops;

import java.util.Scanner;
import java.util.logging.Logger;

public class CarInsurance {
    static Logger log = Logger.getLogger(CarInsurance.class.getName());
	
	public static void verificarJovenSoltero(Customer cliente){
        if(cliente.getSex().toUpperCase().equals("M") && !cliente.isMarried() && (cliente.getAge()<25)){
            cliente.setBase(cliente.getBase()+1500);
        }
    }
    
    public static void verificarMujeroCasado(Customer cliente){
        if(cliente.getSex().toUpperCase().equals("F")|| cliente.isMarried()){
            cliente.setBase(cliente.getBase()-200);
        }
    }
    
    public static void verificarEdad(Customer cliente){
        if(cliente.getAge()>=45 && cliente.getAge()<65){
            cliente.setBase(cliente.getBase()-100);
        }
    }
    
    public static void validarPremium(Customer cliente){
        if(cliente.getAge()>80 || !cliente.hasDrivingLicense()){
        	log.fine("Cannot sell insurance to current customer."); // NOPMD by juandi on 10/29/21, 2:08 PM
        	System.exit(-1);
        }
    }
    
    

public static void main(String[] args) {
    try (// TODO code application logic here
	Scanner sc = new Scanner(System.in)) {
		log.fine("Car Insurance Premium"); // NOPMD by juandi on 10/29/21, 2:09 PM
		
		log.fine("Enter your age: "); // NOPMD by juandi on 10/29/21, 2:09 PM
		String edad = sc.nextLine();
		log.fine("Enter your sex(M/F): "); // NOPMD by juandi on 10/29/21, 2:09 PM
		String sexo = sc.nextLine();
		log.fine("Are you married or not?(Y/N): "); // NOPMD by juandi on 10/29/21, 2:09 PM
		String estadoMarital = sc.nextLine();
		boolean casado = true;
		
		if((estadoMarital.toUpperCase()).equals("Y")){
		    casado = true;
		}
		else if((estadoMarital.toUpperCase()).equals("N")){
			casado = false;
		}
		
		
		log.fine("Do you have a driver's license?(Y/N): "); // NOPMD by juandi on 10/29/21, 2:09 PM
		String licencia = sc.nextLine();
		boolean tieneLicencia = true;
		
		if(licencia.toUpperCase().equals("Y")){
			tieneLicencia = true;
		}
		else if(licencia.toUpperCase().equals("N")){
			tieneLicencia = false;
		}
		
		Customer cliente = new Customer(Integer.parseInt(edad),sexo,casado,tieneLicencia);
		
		
		verificarJovenSoltero(cliente);
		verificarMujeroCasado(cliente);
		verificarEdad(cliente);
		
		validarPremium(cliente);
		
		log.fine("The premium's value to pay is $ " + cliente.getBase() + "."); // NOPMD by juandi on 10/29/21, 2:10 PM
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  

}

}
