package com.example.xdclass.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Video implements Serializable {
    private int id;
    private String title;
    private String summary;
    private String price;
    @JsonProperty("cover_img")//别名
    private String coverImg;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createTime;

    @JsonProperty("chapters_list")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Chapter> chaptersList;

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", price='" + price + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", createTime=" + createTime +
                ", chaptersList=" + chaptersList +
                '}';
    }

    public List<Chapter> getChaptersList() {
        return chaptersList;
    }

    public void setChaptersList(List<Chapter> chaptersList) {
        this.chaptersList = chaptersList;
    }

    public Video(){}

    public Video(int id , String title){
        this.id = id;

        this.title = title;

        this.createTime = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
