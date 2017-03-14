class Interface{
	public static void main(String[] args) {
		while(true) {
			System.out.print("What do you wish to do?");
			System.out.print("");
			String input = System.console().readLine();
			System.out.print(input);
		}
	}
}
