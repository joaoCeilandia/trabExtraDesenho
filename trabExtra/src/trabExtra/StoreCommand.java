package trabExtra;

import java.util.ArrayList;
import java.util.List;

public class StoreCommand {
	   private List<Command> history = new ArrayList<Command>();

	   public void storeAndExecute(Command cmd) {
	      this.history.add(cmd); 
	      cmd.execute();
	   }
	}