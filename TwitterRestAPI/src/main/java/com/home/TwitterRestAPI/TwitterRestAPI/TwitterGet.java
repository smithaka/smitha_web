package com.home.TwitterRestAPI.TwitterRestAPI;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class TwitterGet
{
	@Test
    public void test() throws Exception{
    	HttpClient http = HttpClientBuilder.create().build();
    	HttpGet req = new HttpGet("https://api.twitter.com/");
    	req.addHeader("content type","application/json");
    	req.setHeader("Authorization", "OAuth oauth_consumer_key=\"5nhhQJsRUy6lkF6xX2btaew9F\",oauth_nonce=\"69a6e5d3e42acab97d6c6467d057a229\","
				+ "oauth_signature=\"UU9V7v4%2FKmLQJZPtjLIdWK%2BhCgI%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1468616423\", "
				+ "oauth_token=\"753628410945998850-QKy4D9J8wW3RMhcEbOqXix0H4Y9Pd5S\", oauth_version=\"1.0\"");
    	HttpResponse response = http.execute(req);
    	int statuscode = response.getStatusLine().getStatusCode();
    	System.out.println("statuscode is:"+statuscode);
	}
}	
    		