package com.example.jenkinsexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class JenkinsExampleApplicationTests {

    @Test
    public void testMain() {
        assertEquals(1, 1); // 간단한 테스트
    }

}
