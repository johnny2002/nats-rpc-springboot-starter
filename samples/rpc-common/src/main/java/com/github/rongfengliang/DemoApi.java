package com.github.rongfengliang;

import io.nats.client.impl.Headers;

import java.util.List;


public interface DemoApi {

    // Call specific action method
    List<String> getRoles(DemoMessage message, Headers headers);

}