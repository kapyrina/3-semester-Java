public class V14 {
	public static void main(String[] args) {
		Variations variations = new Variations();
		variations.Add(new SportCar("AUDI AG", 2019 , 3200000 , "Performance","China", "23.01.2023", "Tyler Durden", "06 с.", "3.0 л.", "405 л.с."));
		variations.Add(new SpecialVehicle("Mercedes-Benz Actros", 2011, 2200000, "1844 LS", "China", "11.01.2023", "Edward Norton", "легковой", "7000 кг","10000 x 2300 x 3288 мм"));
		variations.Add(new UsedCar("Kia Rio", 2020, 13997000, "Luxe RED Line", "China", "19.01.2023", "Marla Singer", "Хорошо", "Brad Pitt", 66872));

		System.out.println(variations);
	}

}