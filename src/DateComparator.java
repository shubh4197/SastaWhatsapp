import java.util.*;

public class DateComparator implements Comparator<Posts> {
	public int compare(Posts o1,Posts o2) {
		return o1.getMessageDate().compareTo(o2.getMessageDate());
	}
}
