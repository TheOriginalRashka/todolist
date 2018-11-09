import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoListItem {
	
	String description;
	int priority;
	boolean isDone;
	
	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
	}

	public String getDescription() {
		return this.description;
	}

	public int getPriority() {		
		return this.priority;
	}

	public boolean isDone() {
		return null;
	}

	public boolean markDone() {
		// TODO Auto-generated method stub
		if(priority < 1) {
			return true;
		} else {
			return false;
		}
	}

}
