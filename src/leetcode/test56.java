package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class test56 {

	public List<Interval> merge(List<Interval> intervals){
		if(intervals.size()<=1) 
			return intervals;
		Collections.sort(intervals,new Comparator<Interval>() {

			@Override
			public int compare(Interval i1, Interval i2) {
				// TODO Auto-generated method stub
				if(i1.start!=i2.start) {
					return i1.start-i2.start;
				}
					
				return i1.end - i2.end;
			}
		});
		ListIterator<Interval> it = intervals.listIterator();
		Interval cur = it.next();
		while(it.hasNext()) {
			Interval next = it.next();
			if(cur.end<next.start) {
				cur = next;
				continue;
			}else {
				cur.end = Math.max(cur.end, next.end);
				it.remove();
			}
		}
		
		return intervals;
		   
		
		
		
	}
}
