package test;

import processing.core.*;

public class Test extends PApplet {
	
	Stripe[] stripes = new Stripe[50];

	public void setup() {
		size(200,200);
		for(int i = 0; i < stripes.length; i++) {
			stripes[i] = new Stripe(this);
		}
	}

	public void draw() {
		background(100);
		for (int i = 0; i < stripes.length; i++) {
			stripes[i].move();
			stripes[i].display();
		}
	}
}
