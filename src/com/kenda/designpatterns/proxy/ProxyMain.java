package com.kenda.designpatterns.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		CommandExecutor cmdLine = new CommandExecutorProxy(login:"ali", password:"wrong_password");
	}

}
