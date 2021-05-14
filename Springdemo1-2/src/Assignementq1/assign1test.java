package Assignementq1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class assign1test {
	
	ArrayList a=new ArrayList();
	ArrayList b=new ArrayList();

	@Test
	void test() {
	
		Addresses d=new Addresses("NH6","Jalgaon","maharshtra", "987650", "India");
		Customer c=new Customer(1,"Siya","8569741232",d);
		
		a.add("Navin");
		a.add("9579118286");
		a.add("yallama mandir");
		a.add("solapur");
		a.add("maharshtra");
		a.add("413005");
		a.add("india");
	
		
		
	Object navin=c;
	
	b=(ArrayList)navin;
	
	    assertEquals(b, a);
	}

}
