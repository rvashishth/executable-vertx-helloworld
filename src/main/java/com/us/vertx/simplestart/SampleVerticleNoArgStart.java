package com.us.vertx.simplestart;

import io.vertx.core.AbstractVerticle;

public class SampleVerticleNoArgStart extends AbstractVerticle {

	/**
	 * This operation is async 
	 **/
    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> {
              req.response()
                .putHeader("content-type", "text/plain")
                .end("Hello from Vert.x!");
            }).listen(8080);
        System.out.println("HTTP server started on port 8080");
    }
    
}
