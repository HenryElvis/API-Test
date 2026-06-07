package tests;

import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import base.baseTest;

public class apiTest extends baseTest {
    
    // App : https://conduit.bondaracademy.com
    // API : https://conduit-api.bandaracademy.com

    @Test
    void hasTitle()
    {
        assertThat(page.locator("h1")).hasText("conduit");
    }
}
