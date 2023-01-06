package features;

public interface Manager {

	default String Project() {
		return"YBL MANAGER";
	}
	static String role() {
		return"MANAGER";
	}
}
