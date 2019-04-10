package com.jrookie.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.*;

import static org.junit.Assert.*;

/**
 * @Author: JRookie
 * @Description:
 * @Date: Create in 上午9:21 19-4-4
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class DemoServiceTest {

    @Test
    public void testEquals(){
        int a = 0;
        int b= 1;

        log.info("a == b :{}",a == b);

    }

    @Test
    public void testMath(){
        log.info("-1.8:,{}",Math.round(-1.8));
        log.info("-1.5:,{}",Math.round(-1.5));
        log.info("-1.2:,{}",Math.round(-1.2));
        log.info("1.2:,{}",Math.round(1.2));
        log.info("1.5:,{}",Math.round(1.5));
        log.info("1.8:,{}",Math.round(1.8));

    }

    @Test
    public void testString(){
        String flag = new String();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();


        String temp = new String("1ck43sz3f");
    }

    @Test
    public void testAbstrace(){

    }

    @Test
    public void testFiles(){

    }


    @Test
    public void testCollection(){
        Collection collection ;

        HashMap hashMap;
        Hashtable hashtable;
        TreeMap treeMap;

        int[] arrays = {1,2,3};
        // array  -->  list
        List<int[]> ints = Arrays.asList(arrays);

        // list  -->  array
        List list = null;
        Object[] array = list.toArray();

        Vector vector;

        Iterator iterator = ints.iterator();
        ints.listIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            iterator.remove();
        }


        Collection collection1 = Collections.unmodifiableCollection(list);
        List list1 = Collections.unmodifiableList(list);


        HashSet hashSet = new HashSet();
        hashSet.add("f");

        ArrayList arrayList;

    }


}