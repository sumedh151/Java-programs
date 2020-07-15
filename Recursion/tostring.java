public class JavaToString {

	public static void main(String[] args) {
		Data d = new Data(10, "Java");
		System.out.println(d);
	}
}

class Data {
	private int id;
	private String name;

	Data(int a, String b) {
		this.id = a;
		this.name = b;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	/**
	 * Returns JSON string with id and name
	 * Implementation can change in future, not to rely to convert object to JSON
	 */
	@Override
	public String toString() {
		return "{\"id\":"+id+", \"name\":\""+name+"\"}";
	}
}