package com.example.SecondTry.dao;

import java.util.List;

public interface ArticleDao {
    int insertAnnouncement(String type, String location, double price, String creator, Announcement announcement);
    List<Announcement> selectAllAnnouncement();
    int deleteAnnouncement(Announcement announcement);


}
