package com.escanan.ealden.race;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

@CucumberContextConfiguration
@SpringBootTest
class ApplicationTest {
    @Test
    void contextLoads() {
        assertThat(true, not(equalTo(false)));
    }
}
