package example;

import urbanAPI.UrbanAPI;
import urbanAPI.UrbanException;

public class UrbanExample {

	public static void main(String[] args) {
		UrbanAPI api = new UrbanAPI("your_key");

		try {
			System.out.println(api.getUrbanInfo("urban").getInfo().get(0).definition);
		} catch (UrbanException ex) {
			ex.printStackTrace();
		}
	}
}
