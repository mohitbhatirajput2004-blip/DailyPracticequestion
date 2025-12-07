package collection.mohit;
interface Car{
	void  brake();
	void start();
	void type();
	
}

 class Suzuki implements Car {
	
	@Override
	public void type() {
		System.out.println("Automatic");
		
	}

	@Override
	public void brake() {
		System.out.println("Brakes used");
		
	}

	@Override
	public void start() {
		System.out.println("engine started");
		
	}	 
 } 

public class InterfaceImplementation extends Suzuki {
	
        public static void main(String[] args) {
        	Car c1 = new InterfaceImplementation();
        	c1.start();
        	c1.type();
        	c1.brake();
        	
        	
		}
		
}
