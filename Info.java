package net.ukr.geka3;

public class Info {
	
	public static String getOS(){
		return System.getProperty("os.name");
	}
	
	public static String getUser(){
		return System.getProperty("user.name");
	}
	
	public static String getHomeDir(){
		return System.getProperty("user.home");
	}
	
	public static String getJavaVer(){
		return System.getProperty("java.vm.version");
	}
	
	public static String getSysInfo() {
		
		return "OS: " + getOS() + System.lineSeparator() +
				"User: " + getUser() + System.lineSeparator() +
				"home dir: " + getHomeDir() + System.lineSeparator() + 
				"java version: " + getJavaVer() + System.lineSeparator();
		
	}
}
