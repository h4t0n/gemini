package it.at7.gemini.api;

import it.at7.gemini.boot.IntegrationTestMain;
import org.springframework.context.ConfigurableApplicationContext;

public class RestApiControllerMultipleFieldLKTest extends RestApiControllerMultipleFieldLKAbstTest {
    @Override
    protected ConfigurableApplicationContext getApplicationContext() {
        return IntegrationTestMain.initializeFullIntegrationWebApp();
    }
}
