package com.home.TwitterRestAPI.TwitterRestAPI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

public class TwitterPost {

	@Test
    public void test() throws Exception{
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost("https://api.twitter.com/1/statuses/home_timeline.json?include_entities=true");
		post.setHeader("Accept", "HTTP/1.1");
		post.setHeader("User-Agent", "OAuth gem v0.4.4");
		post.setHeader("Host", "api.twitter.com");
		post.setHeader("Content-Type", "application/x-www-form-urlencoded");
		post.setHeader("Authorization", "OAuth oauth_consumer_key=\"5nhhQJsRUy6lkF6xX2btaew9F\",oauth_nonce=\"69a6e5d3e42acab97d6c6467d057a229\","
				+ "oauth_signature=\"UU9V7v4%2FKmLQJZPtjLIdWK%2BhCgI%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1468616423\", "
				+ "oauth_token=\"753628410945998850-QKy4D9J8wW3RMhcEbOqXix0H4Y9Pd5S\", oauth_version=\"1.0\"");
		HttpResponse response = client.execute(post);
    	int statuscode = response.getStatusLine().getStatusCode();
    	System.out.println("statuscode is:"+statuscode);
	}
}
