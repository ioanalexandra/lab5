package lab5_maven;

import java.util.Scanner;

public class Shell {
	private Scanner scanner = new Scanner(System.in);
	private String comanda;
	private Commands c;
	private Catalog catalog;

	public void listen() throws IncorrectCommandExceptions {
		System.out.println("\nCommand:");
		comanda = scanner.nextLine();
		// verfic care este comanda pe care o adaug de la tastatura
		if (comanda.startsWith("add ")) {
			c = new AddCommand(catalog);
			c.execute(comanda.substring(4));
		} else if (comanda.startsWith("list")) {
			c = new ListCommand(catalog);
			c.execute("");
		} else if (comanda.startsWith("play")) {
			c = new PlayCommand(catalog);
			c.execute("");
		} else if (comanda.startsWith("save")) {
			c = new SaveCommand(catalog);
			c.execute("");
		} else if (comanda.startsWith("load ")) {
			c = new LoadCommand(catalog);
			c.execute(comanda.substring(5));
		} else if (comanda.startsWith("report ")) {
			c = new Report();
			c.execute(comanda.substring(7));
		} else
		// daca nu este valida printez
		{
			throw new IncorrectCommandExceptions("Wrong command");
		}

		// System.out.println(comanda);
	}

	public Shell(Catalog catalog) {
		super();
		this.catalog = catalog;
	}
}
