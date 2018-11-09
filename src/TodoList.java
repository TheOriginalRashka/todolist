import java.util.ArrayList;
import java.util.List;

public class TodoList {
    /*
     * Add a new item to the list, given a description and priority.
     */
	List<String> todoList = new ArrayList<>();
	
    public void addItem(String description, int priority) {
        // TODO
    	todoList.add(priority, description);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        // TODO
    	getItem = todoList.get();
        return null;
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        // TODO
        return 0;
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
