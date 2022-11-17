package com.softeck;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.soft.App;

public class Apptest {
	@Test
	public void testlogin1() {
		App myapp=new App();
		Assert.assertEquals(0,myapp.userlogin("Lakshmana","abc123"));
	}
	@Test
	public void testlogin2() {
		App myapp=new App();
		Assert.assertEquals(1,myapp.userlogin("LakshmanaRao","@abc123"));
	}

}
