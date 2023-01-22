public class Var14 {
	public static void main(String[] args) {
		Car car = new Car("AUDI AG");
		car.setDataMade(2019);
		car.setPrice(3200000);
		car.setConfiguration("Q5 AG");
		car.setMadeIn("China");
		car.setSold("23.01.2023");
		car.setBuyer("Tyler Durden");
		
		System.out.println(car.toString());
	}

}