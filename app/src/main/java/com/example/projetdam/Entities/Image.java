package com.example.projetdam.Entities;

import java.io.Serializable;
import java.util.Date;

public class Image implements Serializable {
    private String ImgId;
    private Date timestamp;
    private String Url;
    public Image() {
    }

    public Image(String imgId, Date timestamp, String url) {
        ImgId = imgId;
        this.timestamp = timestamp;
        Url = url;
    }

    public String getImgId() {
        return ImgId;
    }

    public void setImgId(String imgId) {
        ImgId = imgId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "ImgId='" + ImgId + '\'' +
                ", timestamp=" + timestamp +
                ", Url='" + Url + '\'' +
                '}';
    }
}
