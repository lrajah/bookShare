/**
 * 
 */
package hello.livre.exceptions;

/**
 * @author Dell
 *
 */
public class PersonalException extends Exception {

	/**
	 * 
	 */
	public PersonalException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public PersonalException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public PersonalException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public PersonalException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public PersonalException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		
		return "la date de naissance ne peut pas être supérieure à la date du jour";
	}

}
