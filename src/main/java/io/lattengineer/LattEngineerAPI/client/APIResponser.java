package io.lattengineer.LattEngineerAPI.client;

import java.net.MalformedURLException;
import java.net.URL;

public class APIResponser
{
	private final URL url;
	public URL getURL() { return this.url; }
	
	public APIResponser(URL apiURL)
	{
		if(apiURL == null) throw new NullPointerException("The api url cannot be null");
		this.url = apiURL;
	}
	
	public APIResponser(String apiURL) throws MalformedURLException
	{
		if(apiURL == null || new URL(apiURL) == null) throw new NullPointerException("The api url cannot be null");
		this.url = new URL(apiURL);
	}
}
