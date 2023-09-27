package io.jenkins.plugins.emmenthal;

import com.google.common.io.FileBackedOutputStream;

import java.io.IOException;

public class StreamProvider {

    public void someMethod() throws IOException {
        try (FileBackedOutputStream stream = new FileBackedOutputStream(1024)) {
            stream.flush();
        }
        // ... rest of the code

    }
}
