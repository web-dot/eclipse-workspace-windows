
public class StandardStream {

	public static void main(String[] args) {
		String concat = "";
		for(int i = 0; i < args.length; i++) {
			concat = concat + args[i];
		}
		System.out.println(concat);

	}

}
