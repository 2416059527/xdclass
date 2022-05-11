package com.example.xdclass;

import com.example.xdclass.controller.VideoController;
import com.example.xdclass.domain.Video;
import com.example.xdclass.service.VideoService;
import com.example.xdclass.utils.JsonData;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {XdclassApplication.class})//启动整个springboot工程
public class VideoTest {

    @Autowired
    private VideoService videoService;

    @Before
    public void test1(){
        System.out.println("测试@before");
    }

    @Test
    public void testVideoList(){

        List<Video> videoList = videoService.listVideo();

        TestCase.assertTrue(videoList.size()>0);

    }

   /* @Test
    public void test2(){
        System.out.println("测试@Test");
    }*/
    @After
    public void test3(){
        System.out.println("测试@After");
    }

}
