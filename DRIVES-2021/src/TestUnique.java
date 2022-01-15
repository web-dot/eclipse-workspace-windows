import java.util.HashSet;
import java.util.Set;

public class TestUnique {

	public static void main(String[] args) {
		String sentence = "this has too many items and this is it";
		String[] sa = sentence.split(" ");
		
		Set<String> nonDupli = new HashSet();
		Set<String> removeSet = new HashSet();
		for(String o : sa) {
			if(nonDupli.add(o) == false) {
				removeSet.add(o);
			}
		}
		nonDupli.removeAll(removeSet);

		System.out.println(nonDupli);
		
	}

}
