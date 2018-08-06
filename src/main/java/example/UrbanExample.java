package example;

import urbanAPI.UrbanAPI;

public class UrbanExample {

	public static void main(String[] args) {
		UrbanAPI api = new UrbanAPI("your_key");
		System.out.println(api.getUrbanInfo("urban").getInfo().get(0).definition);
	}
}
