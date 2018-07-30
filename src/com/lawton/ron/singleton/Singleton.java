package com.lawton.ron.singleton;
/*
 * There are many types of singletons, below are a few examples
 */
public class Singleton {
	
	public static void main(String[] args) {
		// You can create singleton instances here
	}

}
// A non thread singleton
class NaiveSingleton {
	
	private static NaiveSingleton instance;
	private NaiveSingleton() {
		
	}
	
	public static NaiveSingleton getInstance() {
		if (instance == null) {
			instance = new NaiveSingleton();
		}
		return instance;
	}
}

// Thread safe non-lazy singleton
class EagerSingleton {
	
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}

// Thread safe, lazy singleton (only created when needed)
class LazySingleton {
	
	private static LazySingleton instance;
	private LazySingleton() {
		
	}
	
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}

