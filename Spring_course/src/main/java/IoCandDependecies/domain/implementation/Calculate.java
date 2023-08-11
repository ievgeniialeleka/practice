package IoCandDependecies.domain.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class Calculate {

    Logger LOG;

    public Calculate() throws InterruptedException {
        for (int i = 1; i < 10; i++) {
            Thread.currentThread().sleep(800);
            System.out.println("Calculate: iteration #: " + i);
        }
    }

    public void getInfo() {
        LOG.info("info log");
    }

    @Autowired
    public void setLOG(Logger myLogger) {
        this.LOG = myLogger;
    }
}
