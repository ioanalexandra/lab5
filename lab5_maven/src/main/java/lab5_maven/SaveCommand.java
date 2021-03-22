package lab5_maven;

public class SaveCommand implements Commands {
	private Catalog catalog;

	@Override
	public void execute(String argument) {
		try {
			catalog.save(catalog.getPath());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public SaveCommand(Catalog catalog) {
		super();
		this.catalog = catalog;
	}

}
