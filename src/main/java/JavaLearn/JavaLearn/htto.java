package JavaLearn.JavaLearn;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;



public class htto {
	
	final static String USER_AGENT = "Mozilla/5.0";
	public static void main(String arg[]) throws ClientProtocolException, IOException  {
	
		 HttpClient client = HttpClientBuilder.create().build();
	        HttpGet request = new HttpGet("http://www.google.com/search?q=Inception");
	        request.addHeader("content-Type", "application/json");
	        HttpResponse response = client.execute(request);
	        String json = IOUtils.toString(response.getEntity().getContent());
	        
	        
	        
	        
	        JSONArray array = new JSONArray(json);
	        for (int i = 0; i < array.length(); i++) {
	            JSONObject object = array.getJSONObject(i);
	            System.out.println(object);
	        }
		
		
	/*	
		
		String url = "http://www.google.com/search?q=Inception";

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		

		// add request header
		//request.addHeader("User-Agent", USER_AGENT);
		HttpResponse response = client.execute(request);
		*/
		
/*
		System.out.println("Response Code : " 
	                + response.getStatusLine().getStatusCode());
		*/
		
		
/*		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("http://www.google.com/search?q=Inception");
		HttpResponse response = client.execute(request);
		
		
		BufferedReader rd = new BufferedReader(
			new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		System.out.println(result);*/
	}

}
