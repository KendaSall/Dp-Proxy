package com.kenda.designpatterns.proxy;

public class CommandExecutorProxy implements CommandExecutor{
	
	private boolean isAdmin = false;
	private CommandExecutor commandExecutor;

	public CommandExecutorProxy(String login, String password) {
		isAdmin = "ali".equals(login) && "passW".equals(password);
		commandExecutor = new CommandExecutorImpl();
	}
	
	@Override
	public void executeCommand(String cmd) throws Exception {
		if(isAdmin) {
			commandExecutor.executeCommand(cmd);
		}else{
			if(cmd.contains("rm")) {
				throw new Exception("Vous n'avez pas un acces admin");
			}else{
				commandExecutor.executeCommand(cmd);
			}		
		}
		
	}

}
