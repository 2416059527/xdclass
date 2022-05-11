package com.example.xdclass.service.impl;

import com.example.xdclass.domain.Video;
import com.example.xdclass.mapper.VideoMapper;
import com.example.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;


    @Override
    public List<Video> listVideo() {

        return videoMapper.listVideo();
    }
}
