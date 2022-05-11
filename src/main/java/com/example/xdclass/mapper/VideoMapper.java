package com.example.xdclass.mapper;

import com.example.xdclass.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1,"java基础课程1"));
        videoMap.put(2,new Video(2,"java基础课程2"));
        videoMap.put(3,new Video(3,"java基础课程3"));
        videoMap.put(4,new Video(4,"java基础课程4"));
        videoMap.put(5,new Video(5,"java基础课程5"));

    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();

        list.addAll(videoMap.values());
        return list;
    }

}
