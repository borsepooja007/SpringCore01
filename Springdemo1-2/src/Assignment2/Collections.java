package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	
	List<String>t=new ArrayList();

	public List<String> gett() {
		return t;
	}

	public void sett(List<String> t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Collections [list=" + t + "]";
	}

	
	
	
	
}
