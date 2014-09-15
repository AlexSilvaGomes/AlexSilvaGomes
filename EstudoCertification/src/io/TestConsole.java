package io;

import java.io.Console;

public class TestConsole {

	public static void main(String[] args) {

		Console c = System.console();

		System.out.println(c);

		System.out.println("Read User..:");
		String user = c.readLine("%s", "input?: ");

		System.out.println("Read Password..:");
		char[] arrayPassword = c.readPassword("%s", "arrayPassword: ");

		System.out.println("User input:" + user);

		System.out.print("Password input: ");
		for (char d : arrayPassword) {
			System.out.print(d);
		}

	}

}
