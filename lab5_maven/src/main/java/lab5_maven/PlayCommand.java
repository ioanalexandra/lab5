package lab5_maven;

public class PlayCommand implements Commands {
	private Catalog catalog;

	@Override
	public void execute(String argument) {
		catalog.play();
	}

	public PlayCommand(Catalog catalog) {

		this.catalog = catalog;
	}

}
