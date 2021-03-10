package com.app;

import com.jk.util.JK;

public class ExceptionExample1 {
	public static void main(String[] args) {
		//Throw nullpointer exception and handle with default handler, which log the error then through runtime exception
		try {
			String name = null;
			name.length();
		} catch (Exception e) {
			JK.handle(e);
		}
	}
}
