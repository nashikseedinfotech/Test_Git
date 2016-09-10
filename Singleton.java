public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton() {
		// initialization stuff goes here
	}
	public synchronized static Singleton instance() {
		return instance;
	}
}