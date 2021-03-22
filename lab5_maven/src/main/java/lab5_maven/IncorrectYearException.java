package lab5_maven;

//exceptia pe care am creat-o pentru anul aparitiei
public class IncorrectYearException extends RuntimeException {
	public IncorrectYearException(String msg) {
		super(msg);
	}
}
