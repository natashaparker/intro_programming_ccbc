package test;

import processing.core.PApplet;

public class Stripe {
	float x;
	float speed;
	float w;
	boolean mouse;
	PApplet parent;
	
	Stripe(PApplet p) {
		parent = p;
		x = 0;
		speed = parent.random(1);
		w = parent.random(10, 30);
		mouse = false;
	}
	
	void display() {
		float red = parent.random(128, 255);
		float green = parent.random(128, 255);
		float blue = parent.random(128, 255);
		parent.fill(red, blue, green);
		parent.noStroke();
		parent.rect(x, 0, w, parent.height);
	}
	
	void move() {
		x += speed;
		if (x > parent.width + 20) x = -20;
	}
}
