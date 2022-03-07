package virtualkey;

public class VirtualLockMain {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("Virtual Lock Key", "Sahithi");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}