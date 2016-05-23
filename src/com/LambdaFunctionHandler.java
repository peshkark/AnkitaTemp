package com;

import java.io.File;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.amazonaws.services.lambda.runtime.events.S3Event;

public class LambdaFunctionHandler implements RequestHandler<S3Event, String> {

    @Override
    public String handleRequest(S3Event input, Context context) {
      
    	File f  = new File("Tmp.txt");
    	System.out.println(f.getAbsolutePath());

        // TODO: implement your handler
        return "OK";
    }

}
