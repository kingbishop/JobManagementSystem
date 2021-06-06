package jms.util;


/**
 * Command interface used to execute an action.
 * @author Caleb Bishop
 *
 */
public interface Command {
	
	
	/**
	 * Method used to execute an action.
	 */
	public int execute() throws Exception;
	
	
	

}
