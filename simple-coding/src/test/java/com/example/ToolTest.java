package com.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class ToolTest {

    @Test
    void test() {
        assertThat(1).isEqualTo(BigDecimal.ONE.intValue());
    }

}
