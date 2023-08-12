package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {
    @BeforeEach
    void setUp() {
        System.out.println("각 테스트가 실행 되기 전 수행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("각 테스트가 실행된 후 수행");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트가 실행되기 전 최초로 수행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트가 수행된 후 마지막으로 수행");
    }

    @Test
    void test1() {
        System.out.println("테스트 코드 작성 1");
    }

    @Test
    void test2() {
        System.out.println("테스트 코드 작성 2");
    }

}
