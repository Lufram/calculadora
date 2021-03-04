package Calculadora;

public class IncorrectValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IncorrectValueException() {
		super("Valor incorrecto");
	}

	@Override
	public String toString() {
		return "IncorrectValueException";
	}

}
