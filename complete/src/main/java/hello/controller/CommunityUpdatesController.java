package hello.controller;

import hello.Community_updatesRepository;
import hello.model.Community_updates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/communityupdates") // This means URL's start with /demo (after Application path)
public class CommunityUpdatesController {
    @Autowired

    private Community_updatesRepository community_updatesRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Community_updates> getAllCommunityUpdates() {
        return community_updatesRepository.findAll();
    }
}
