package mystore.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import mystore.storemanager.InventoryManager;
import mystore.storemanager.InventoryManagerImpl;
import mystore.storemanager.SaleManager;
import mystore.storemanager.SaleManagerImpl;

public class MyCommandLineStore {
	private InventoryManager inventoryManager;
	private SaleManager saleManager;
	
	public MyCommandLineStore()
	{
		inventoryManager = new InventoryManagerImpl();
		saleManager = new SaleManagerImpl();
	}
	 /**
	  * Parse the given command.  Line will parsed by spaces, into a list.
	  * The command list will be routed to an object specific handler based on 
	  * the first command.  The first command string will specify which object to
	  * act on.
	  * @param command
	  * @return string to output to console.
	  */
	public String parseAndRunCommand(String command)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("command: ").append(command).append("\n");
		StringTokenizer st = new StringTokenizer(command);
		List<String> commandList = new ArrayList<String>();
		while(st.hasMoreTokens())
		{
			commandList.add(st.nextToken());
		}
		String objectType = commandList.get(0);
		if(objectType.equals("item"))
		{
				sb.append(runItemCommand(commandList));
		}
			
		return sb.toString();
	}
	
	private String runItemCommand(List<String> commandList) {
		return "running item command";
	}

	public static void main(String args[])
	{
		System.out.println("Starting Store.");
		MyCommandLineStore myStore = new MyCommandLineStore();
		
		boolean running = true;
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		while(running)
		{
			try {
				String command = userInput.readLine();
				if(command.equals("exit"))
				{
					running=false;
				}
				System.out.println(myStore.parseAndRunCommand(command));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting.");
		System.exit(0);
	}
}
