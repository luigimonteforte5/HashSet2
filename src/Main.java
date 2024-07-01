import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main( String[] args ) {
		Set < String > insieme = mkHashSet();

		System.out.println("Gli elementi nella lista sono: " + insieme);
		System.out.println("La lista è lunga " + insieme.size() + " elementi");

		String controllo = "Terzo elemento";

		Iterator < String > it = insieme.iterator();
		while ( it.hasNext() ) {
			String elemento = it.next();
			if ( elemento.equals(controllo) ) {
				System.out.println("è stato rimosso " + controllo);
				it.remove();
			}
		}

		insieme.clear();
		System.out.println("Il set dopo il clear: " + insieme);


	}

	public static HashSet < String > mkHashSet ( ) {
		String first = "Primo elemento";
		String second = "Secondo elemento";
		String third = "Terzo elemento";
		HashSet < String > set = new HashSet <>();
		set.add(first);
		set.add(second);
		set.add(third);
		return set;
		}

}