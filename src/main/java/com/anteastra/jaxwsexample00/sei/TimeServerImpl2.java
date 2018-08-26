package com.anteastra.jaxwsexample00.sei;

import javax.jws.WebService;
import java.util.Date;

/**
 * Implementation of interface can be omitted. But it is not safe
 */
@WebService(endpointInterface = "com.anteastra.jaxwsexample00.sei.TimeServer")
public class TimeServerImpl2 {
    public String getTimeAsString() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Date().toString();
    }
}