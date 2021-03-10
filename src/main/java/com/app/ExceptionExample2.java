package com.app;

import com.jk.util.JK;
import com.jk.util.exceptions.handler.JKExceptionHandlerFactory;

public class ExceptionExample2 {
	public static void main(String[] args) {
		JKExceptionHandlerFactory.getInstance().registerHandlers("com.app");
		//Throw nullpointer exception and handle with custom handler, which show the message in JOptionPane
		try {
			int arr[]=new int[0];
			int x=arr[1];
		} catch (Exception e) {
			JK.handle(e);
		}
	}
}
