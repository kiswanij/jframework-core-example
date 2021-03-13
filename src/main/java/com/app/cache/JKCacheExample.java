package com.app.cache;

import com.jk.util.JK;
import com.jk.util.cache.JKCacheFactory;
import com.jk.util.cache.JKCacheManager;

public class JKCacheExample {
	public static void main(String[] args) {
		//Cache value
		JKCacheManager cm = JKCacheFactory.getCacheManager();
		cm.cache("username", "Jalal");
		
		//Retrieve value
		String value = cm.get("username", String.class);
		JK.print(value);
		
		//Remove value
		cm.remove("username", String.class);
		
		String value2 = cm.get("username", String.class);
		JK.print(value2);//null
		
	}
}
