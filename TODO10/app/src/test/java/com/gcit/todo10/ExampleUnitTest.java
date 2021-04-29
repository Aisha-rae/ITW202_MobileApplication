package com.gcit.todo10;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private calculator Calculator;

    @Before
    public void setUp(){
        Calculator = new calculator();
    }
    @Test
    public void addition_isCorrect() {
        double res = Calculator.add(1d,2d);
        assertThat(res, is(equalTo(3d)));
    }
    @Test
    public void addnegative(){
        double result = Calculator.add(-1d,3d);
        assertThat(result, is(equalTo(2d)));
    }
    @Test
    public void add(){
        double result = Calculator.add(1.1f,3.1d);
        assertThat(result, is(closeTo(4.2,0.1)));
    }
    @Test
    public void sub(){
        double result = Calculator.sub(4d,3d);
        assertThat(result, is(equalTo(1d)));
    }
    @Test
    public void subnegative(){
        double result = Calculator.sub(-4d,3d);
        assertThat(result, is(equalTo(-7d)));
    }
    @Test
    public void multi(){
        double result = Calculator.multi(2d,3d);
        assertThat(result, is(equalTo(6d)));
    }
    @Test
    public void multinegative(){
        double result = Calculator.multi(2d,0d);
        assertThat(result, is(equalTo(0d)));
    }
    @Test
    public void divi(){
        double result = Calculator.divi(6d,2d);
        assertThat(result, is(equalTo(3d)));
    }

    @Test
    public void divinegative(){
        double result = Calculator.divi(6d,0d);
        assertThat(result, is(equalTo(Double.POSITIVE_INFINITY)));
    }


}