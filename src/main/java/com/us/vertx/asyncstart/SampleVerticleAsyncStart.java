package com.us.vertx.asyncstart;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServer;

public class SampleVerticleAsyncStart extends AbstractVerticle {

	/**
	 *  Here this verticle will not be considered start until response from httpServer.listen method
	 *  will succeeds. 
	 *  
	 * */
	@Override
	public void start(Future<Void> startFuture) throws Exception {
		//super.start(startFuture);
		HttpServer httpServer = vertx.createHttpServer().requestHandler(event -> event.response()
				.putHeader("content-type", "text/plain")
				.end("Response text from SampleVerticleAsyncStart verticle")
				);
		
		httpServer.listen(8081, event ->{
			if(event.succeeded())
				startFuture.complete();
			else 
				startFuture.fail(event.cause());
		} );
	}

	
}
