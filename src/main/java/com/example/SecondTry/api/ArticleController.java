package com.example.SecondTry.api;

import com.example.SecondTry.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.SecondTry.service.AnnouncementService;

import java.util.List;

@RequestMapping("api/v1/announcement")
@RestController
public class ArticleController {
    private final AnnouncementService announcementService;
    @Autowired
    public ArticleController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }
    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public void addAnnouncement(@RequestBody Announcement announcement){
        announcementService.insertAnnouncement(announcement);
    }
    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<Announcement> getAllAdmin(){
        return announcementService.getAllAnnouncement();
    }
    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
    public int deleteAnnouncement(@RequestBody Announcement announcement){return announcementService.deleteAnnouncement(announcement);}
}
