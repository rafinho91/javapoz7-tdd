package com.sda.service;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterServiceTest {

    WriterService writerService = new WriterService();
    @Before
    public void init(){
        this.writerService = new WriterService();
    }

    @Test
    public void testOneName(){
        //given
        String name = "Szymon";

        //when
        String result = writerService.write(name);
        //then
        Assert.assertEquals("Hello, Szymon.", result);
    }

    @Test
    public void testNullName(){
        //given
        String name = null;

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my Friend.", result);
    }

    @Test
    public void testCapitalizeName(){
        //given
        String name = "SZYMON";

        //when
        String result = writerService.write(name);
        //then
        Assert.assertEquals("HELLO, SZYMON!", result);

    }

    @Test
    public void testBlankName(){
        //given
        String name = "";
        //when
        String result = writerService.write(name);
        //then
        Assert.assertEquals("Hello, my Friend.", result);
    }

    @Test
    public void testManyNames(){
        //given
        String name = "Szymon,Anna,Jan";
        //when
        String result = writerService.write(name);
        //then
        Assert.assertEquals("Hello, Szymon, Anna and Jan.", result);
    }

    @Test
    public void testUpperCaseNames() {
        //given
        String name = "SZYMON,ANNA,JAN";
        //when
        String result = writerService.write(name);
        //then
        Assert.assertEquals("HELLO, SZYMON, ANNA AND JAN!", result);
    }
}
