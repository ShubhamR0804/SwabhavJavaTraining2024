package com.techlabs.creational.singleton.test;

import com.techlabs.creational.singleton.model.Login;

public class LoginTest {

	public static void main(String[] args) {

		Login login1 = Login.getLogin();
		System.out.println(login1.hashCode());

		Login login2 = Login.getLogin();
		System.out.println(login2.hashCode());
	}

}
