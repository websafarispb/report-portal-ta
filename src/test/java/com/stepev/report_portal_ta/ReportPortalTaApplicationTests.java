package com.stepev.report_portal_ta;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ReportPortalTaApplicationTests {

	ChromeDriver driver;

	@BeforeAll
	static void setupClass() {
		WebDriverManager.chromiumdriver().setup();

	}

	@BeforeEach
	void setupTest() {
		driver = new ChromeDriver();
	}

	@AfterEach
	void teardown() {
		driver.quit();
	}

	@Test
	void test() {
		driver.get("http://localhost:8080/");
		String title = driver.getTitle();
		title = driver.getTitle();
        log.info("title - {}", title);
	}

	@Test
	void contextLoads() {
		System.out.println("This is a test");
	}

}
