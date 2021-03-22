package lab5_maven;

public class IncorrectCommandExceptions extends RuntimeException {
//clasa exceptie pentru comenzile invalide
	/**
	 * 
	 */
	private static final long serialVersionUID = 7081827025994249053L;

	public IncorrectCommandExceptions(String msg) {
		super(msg);
	}
}
