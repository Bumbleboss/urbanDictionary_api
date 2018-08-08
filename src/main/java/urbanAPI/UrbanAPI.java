package urbanAPI;

import java.io.IOException;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class UrbanAPI {

	private String apiKey;

	public UrbanAPI(String key) {
		this.apiKey = key;
	}

	private OkHttpClient client = new OkHttpClient();
	private Gson gson = new Gson();

	public UrbanResponse getUrbanInfo(String word) throws UrbanException{
		String json = null;
		try {
			json = getJSONGET("https://mashape-community-urban-dictionary.p.mashape.com/define?term="+word);
		}catch(Exception e) {
			e.printStackTrace();
		}

		UrbanResponse inf = gson.fromJson(json, UrbanResponse.class);
		if(inf.getInfo() == null) {
			throw new UrbanException("Missing Mashape application key or is invalid; Go to http://docs.mashape.com/api-keys to learn how to get your API application key.");
		}
		return inf;
	}
	
	private String getJSONGET(String url) throws IOException {
		Request request = new Request.Builder()
				.addHeader("X-Mashape-Key", apiKey).addHeader("Accept", "text/plain").url(url).build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}
}
