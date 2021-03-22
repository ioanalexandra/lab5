package lab5_maven;

public class AddCommand implements Commands {
	private Catalog catalog;

	public AddCommand(Catalog catalog) {
		this.catalog = catalog;
	}

	@Override
	public void execute(String argument) {

		String[] aux = argument.split(" ");
		// setez argumentele de la tastatura
		if (aux[0].equals("img")) {
			Image i = new Image();
			i.setName(aux[1]);
			i.setResolution(aux[2]);
			i.setSize(aux[3]);
			catalog.addItem(i);
		} else if (aux[0].equals("book")) {
			Book b = new Book();
			b.setName(aux[1]);
			b.setAuthor(aux[2]);
			catalog.addItem(b);
		}
	}

}
