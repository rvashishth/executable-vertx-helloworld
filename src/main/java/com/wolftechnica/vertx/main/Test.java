package com.wolftechnica.vertx.main;

import com.wolftechnica.vertx.samples.demo.MainVerticle;

import io.vertx.core.Vertx;

public class Test {

	public static void main(String[] args) {
		Vertx vertx = Vertx.factory.vertx();
		vertx.deployVerticle(new MainVerticle());
		
	}
}
