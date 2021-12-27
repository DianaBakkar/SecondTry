package com.example.SecondTry.dao;


import com.example.SecondTry.model.Announcement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("fakeAnnouncementDao")

public class ArticleDaoImpl implements AnnouncementDao{
    private static List<Announcement> DB2=new ArrayList<>();
    @Override
    public int insertAnnouncement(String type, String location, double price, String creator, Announcement announcement) {
        DB2.add(new Announcement(announcement.getType(),announcement.getLocation(),announcement.getPrice(),announcement.getCreator()));
        return 1;
    }

    @Override
    public List<Announcement> selectAllAnnouncement() {
        return DB2;
    }
    @Override
    public int deleteAnnouncement( Announcement announcement) {
        DB2.remove(announcement);
        return 1;
    }
}
