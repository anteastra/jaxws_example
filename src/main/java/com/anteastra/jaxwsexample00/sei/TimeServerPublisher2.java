package com.anteastra.jaxwsexample00.sei;

import javax.xml.ws.Endpoint;

/**
 * Runtime exception on missed method
 */

public class TimeServerPublisher2 {
    public static void main(String[ ] args) {
        Endpoint.publish("http://127.0.0.1:9877/ts", new TimeServerImpl2());
    }
}