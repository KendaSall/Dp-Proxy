package com.kenda.designpatterns.proxy;

public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void executeCommand(String cmd) throws Exception {
	System.out.println("La commande " + cmd + "a ete execute avec success");
	
	}
}
