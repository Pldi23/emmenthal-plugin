package io.jenkins.plugins.emmenthal;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

public class OtherClass {

    public void method() throws IOException {
        HttpClient httpClient = new HttpClient();
        httpClient.executeMethod(new GetMethod());
        // ... rest of the code

    }
}
