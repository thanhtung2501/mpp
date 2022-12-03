package lesson3.labsolns.prob3;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		if (properties == null || properties.length == 0) return 0;

		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.computeRent();
		}
		return totalRent;
	}
}
