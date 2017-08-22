package model.interpreter;
/**
 * Context-上下文类
 */
import java.util.*;

public class Context  {
	private HashMap context = new HashMap();
    public void Opinion(String name, boolean value) {
        context.put(name, new Boolean(value));
    }
    public boolean Search(String name) {
        return ((Boolean)context.get(name)).booleanValue();
    }
    public Context() {
    }
}