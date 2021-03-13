package com.app.exception;

import com.jk.util.JK;
import com.jk.util.exceptions.handler.JKExceptionHandlerFactory;

public class JKExceptionExample2 {
	public static void main(String[] args) {
		JKExceptionHandlerFactory.getInstance().registerHandlers("com.app");
		//Throw null pointer exception and handle with custom handler, which show the message in JOptionPane
		try {
			int arr[]=new int[0];
			int x=arr[1];
		} catch (Exception e) {
			JK.handle(e);
		}
	}
}
