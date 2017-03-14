class Interface{

	static String[] parseInput(String input){
		String parsedInput = input.toLowerCase();
		String[] parsedInputArray = parsedInput.split(" ");
		return parsedInputArray; 
	}

	public static void main(String[] args) {
		while(true) {
			String[] allowedCommands = {"help"};

			System.out.print("What do you wish to do?" + System.lineSeparator() + ":");
			String input = System.console().readLine();
			//System.out.print(input);
			String[] commandArray = parseInput(input);
			System.out.print(commandArray[0]);
			System.out.print(commandArray[1]);
		}
	}
}
