package com.us.vertx;

import com.us.vertx.simplestart.SampleVerticleNoArgStart;

import io.vertx.core.Vertx;

public class Test {

	public static void main(String[] args) {
		Vertx vertx = Vertx.factory.vertx();
		vertx.deployVerticle(new SampleVerticleNoArgStart());
		
	}
}
