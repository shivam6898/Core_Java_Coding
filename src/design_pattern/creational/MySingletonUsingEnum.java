package design_pattern.creational;

public enum MySingletonUsingEnum {
	INSTANCE;
	private MySingletonUsingEnum() {
		System.out.println("Here");
	}

	public String retrieveSomething() {
		return "DUMMY";
	}

	public static void main(String[] args) {
		MySingletonUsingEnum.INSTANCE.retrieveSomething();
	}

}