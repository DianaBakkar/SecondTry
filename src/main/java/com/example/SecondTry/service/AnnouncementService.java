package com.example.SecondTry.service;

import com.example.SecondTry.dao.AnnouncementDao;
import com.example.SecondTry.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {
    private final AnnouncementDao announcementDao;
    @Autowired

    public AnnouncementService(@Qualifier("fakeAnnouncementDao")AnnouncementDao announcementDao) {
        this.announcementDao = announcementDao;
    }
    public int insertAnnouncement(Announcement announcement){
        return announcementDao.insertAnnouncement(announcement.getType(), announcement.getLocation(),announcement.getPrice(),announcement.getCreator(), announcement);
    }
    public List<Announcement> getAllAnnouncement(){
        return announcementDao.selectAllAnnouncement();
    }
    public int deleteAnnouncement(Announcement announcement){
        return announcementDao.deleteAnnouncement(announcement);
    }

}

