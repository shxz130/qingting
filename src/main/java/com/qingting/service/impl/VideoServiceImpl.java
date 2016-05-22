package com.qingting.service.impl;

import com.qingting.dao.VideoDao;
import com.qingting.model.Video;
import com.qingting.service.BaseService;
import com.qingting.service.VideoService;
import com.qingting.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/5/22.
 */
@Component
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDao videoDao;
    public Integer add(Video video) {
        return null;
    }

    public Integer update(Video video) {
        return null;
    }

    public Integer delete(Video video) {
        return null;
    }

    public List<Video> getByPage(Video video, Page page) {
        return null;
    }

    public Video get(Video video) {
        return null;
    }

    public Integer getCount(Video video) {
        return videoDao.getCount(video);
    }

    public Integer batchAdd(List<Video> list) {
        return null;
    }

    public List<Video> getList(Video video) {
        return null;
    }

    public Video getById(Long id) {
        return null;
    }
}
