package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b= new BMW();
b.start();
b.stop();
b.refuel();
b.autoParking();

car c= new car();
c.start();
c.stop();
c.refuel();


car c1=new BMW(); // Child class object can be referref by parent class ref variable -- is call Top casting
		
c1.start();
c1.stop();
c1.refuel();
// autoParking cannot be called here

BMW b1 = (BMW) new car(); // down casting
// exception will be thrown while running


		
	}

}
