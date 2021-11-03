package org.example;

import static org.junit.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue()
    {
        JavaClass jc = new JavaClass();
        String s = MyGroovy.myParse();
        Assertions.assertThat(s).isEqualTo("Something");
    }
}
