package test;


public class Helloword {
	
	public String getMessage(String name) {
		if (name!= null && !name.isEmpty()) {
			return "Hello "+name+"!";
		} else {
			return "Hello World!";
		}
	}

	public int sum(int a, int b){
		return a+b;
	}

}
