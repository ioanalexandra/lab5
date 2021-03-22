package lab5_maven;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.testCreateSave();
		app.testLoadView();

	}

	private void testCreateSave() {
		Catalog catalog = new Catalog("My Books", "d:/media/catalog.ser");

		// Pentru FreeMarker

		Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
		try {
			cfg.setDirectoryForTemplateLoading(new File("C:\\Users\\alexa\\Desktop\\lab5"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setLogTemplateExceptions(false);
		cfg.setWrapUncheckedExceptions(true);
		cfg.setFallbackOnNullLoopVariable(false);
		// introducerea itemilor in catalog
		var img = new Image();
		var book = new Book();
		book.setAuthor("Ion Creanga");
		book.setName("Amintiri din copilarie");
		book.setReleaseYear(1892);
		img.setName("Stelute");
		img.setResolution("360px");
		img.setSize("1mb");
		catalog.addItem(img);
		catalog.addItem(book);

		try {
			catalog.save("C:\\Users\\alexa\\Desktop\\lab5\\book.txt");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		Map root = new HashMap();
		root.put("catalog", catalog);
		root.put("items", catalog.getItems());

		System.out.print(catalog.getName());
		try {
			Template temp = cfg.getTemplate("test.ftlh");
			Writer out = new FileWriter("C:\\Users\\alexa\\Desktop\\lab5\\report.html");
			temp.process(root, out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void testLoadView() {

		Catalog catalog = new Catalog("Books", "C:\\Users\\alexa\\Desktop\\lab5\\book.txt");
		// catalog.load("C:\\Users\\alexa\\Desktop\\lab5\\book.txt");
		// catalog.list();
		Shell s = new Shell(catalog);
		s.listen();
		s.listen();
		s.listen();
		s.listen();
		s.listen();
		// catalog.play();
	}
}
