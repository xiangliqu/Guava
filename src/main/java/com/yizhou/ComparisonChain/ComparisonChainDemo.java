package com.yizhou.ComparisonChain;

import org.junit.Test;

import com.google.common.collect.ComparisonChain;

class Girl implements Comparable<Girl> {

    private String name;//名称
    private double height;//身高
    private String face;//长相

    Girl(String name, double height, String face) {
        this.name = name;
        this.height = height;
        this.face = face;
    }

	public int compareTo(Girl girl) {
		return ComparisonChain.start()
	            			  .compare(name, girl.name)
	            			  .compare(height, girl.height)
	            			  .compare(face, girl.face)
	            			  .result();
	}
}
public class ComparisonChainDemo {
	
	@Test
	public void testCompareTo() {
	    Girl g1 = new Girl("lisa", 176.00, "nice");
	    Girl g2 = new Girl("lisa", 176.00, "beauty");
	    //两个girl的face不相同
	    System.out.println(g1.compareTo(g2) == 0);//false
	}
}
