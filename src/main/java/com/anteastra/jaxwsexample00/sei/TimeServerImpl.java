package com.anteastra.jaxwsexample00.sei;

import java.util.Date;
import javax.jws.WebService;

/**
 * The @WebService property endpointInterface links the
 * SIB (this class) to the SEI (TimeServer).
 * Note that the method implementations are not annotated
 * as @WebMethods.
 */
@WebService(endpointInterface = "com.anteastra.jaxwsexample00.sei.TimeServer")
public class TimeServerImpl implements TimeServer {
    public String getTimeAsString() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Date().toString();
    }
    public long getTimeAsElapsed() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Date().getTime();
    }
}