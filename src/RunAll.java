import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;

public class RunAll {
	public static void main(String[] args) throws URISyntaxException {
		URL packagePath = ClassLoader.getSystemResource("");

		File directory = new File(packagePath.toURI());

		String[] files = directory.list();
		if (files == null) {
			System.err.println("no files were found");
			return;
		}

		Arrays.stream(files)
				.map(f -> f.contains(File.pathSeparator) ? f.substring(f.lastIndexOf(File.pathSeparator)) : f) // remove file path
				.map(f -> f.contains(".") ? f.substring(0, f.lastIndexOf('.')) : f) // remove extension
				.filter(f -> !f.equals(RunAll.class.getName())) // remove this class
				.filter(f -> f.matches("^C\\d\\d?$")) // remove subclasses
				.sorted(Comparator.comparingInt(s -> Integer.parseInt(s.substring(1)))) // sort files on number instead of file system order
				.map(s -> {
					try {
						return Class.forName(s);
					} catch (ClassNotFoundException e) {
						throw new RuntimeException("file " + s + " was not found as a .class file", e);
					}
				}) // change file name to class
				.forEachOrdered(c -> {
					System.out.println("\u001B[31m\n\ncalling class: " + c.getCanonicalName() + "\n\u001B[0m");
					try {
						c.getMethod("main", String[].class).invoke(null, (Object) args);
					} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
						throw new RuntimeException(e);
					}
				});
	}
}
