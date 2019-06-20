package com;

import com.bean.person;
import com.sun.javaws.ui.ApplicationIconGenerator;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    person p;
//    @Resource
//    ApplicationContext ioc;
    @Test
    public void d(){

       System.out.println(p.getName()+p.getSex()+p.getAge());
       // System.out.println(ioc.getAttribute("pi"));
    }
    @Test
    public void s(){
        System.out.println("进入方法");
        new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(i);
                    if (i==50){
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName());
                    }
                    System.out.println(i);
                }
            }
        };
        int p=8;
    }
}
