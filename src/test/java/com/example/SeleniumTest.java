package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void testGoogleTitle() {
        driver.get("https://www.google.com");

        String title = driver.getTitle();

        assertEquals("Google", title);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
