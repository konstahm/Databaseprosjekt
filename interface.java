import java.util.ArrayList;
import java.util.Arrays;

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
			boolean contains = Arrays.asList(allowedCommands).contains(commandArray[0]);
			System.out.println(commandArray[0]);
			System.out.println(allowedCommands[0]);
			System.out.println(allowedCommands[0] == commandArray[0]);
			if(contains) {
				if(commandArray[0] == allowedCommands[0]){
					System.out.println(Arrays.toString(allowedCommands));
				}
			}
		}
	}
}
