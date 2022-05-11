package com.example.xdclass.controller;

import com.example.xdclass.domain.Video;
import com.example.xdclass.service.UserService;
import com.example.xdclass.service.VideoService;
import com.example.xdclass.service.impl.UserServiceImpl;
import com.example.xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("list")
    public JsonData list(){
        List<Video> list = videoService.listVideo();
        System.out.println(list);

        return JsonData.buildSuccess(list);
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){

        System.out.println(video.toString());

        return JsonData.buildSuccess(video);
    }
}
