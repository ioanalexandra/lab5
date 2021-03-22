package lab5_maven;

public class LoadCommand implements Commands {
	private Catalog catalog;

	@Override
	public void execute(String argument) {
		catalog.load(argument);
	}

	public LoadCommand(Catalog catalog) {
		super();
		this.catalog = catalog;
	}

}
