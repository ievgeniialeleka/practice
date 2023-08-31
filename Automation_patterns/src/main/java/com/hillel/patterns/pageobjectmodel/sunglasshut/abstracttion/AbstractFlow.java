package com.hillel.patterns.pageobjectmodel.sunglasshut.abstracttion;

import com.hillel.patterns.pageobjectmodel.sunglasshut.flows.commonflows.HeaderFlow;
import org.openqa.selenium.WebDriver;

public class AbstractFlow {

    private HeaderFlow headerFlow;

    public AbstractFlow(WebDriver webDriver) {
        this.headerFlow = new HeaderFlow(webDriver);
    }

    public HeaderFlow getHeaderFlow() {
        return headerFlow;
    }
}
