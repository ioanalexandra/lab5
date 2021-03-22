package lab5_maven;

public class ListCommand implements Commands {
	private Catalog catalog;

	@Override
	public void execute(String argument) {
		catalog.list();
	}

	public ListCommand(Catalog catalog) {

		this.catalog = catalog;
	}

}
