package CraftApp.controller;

import CraftApp.models.Post;
import CraftApp.service.SellersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SellersController {

    private SellersService sellersService=new SellersService();

    public void addPosts(Post post){
        sellersService.storePosts(post);
    }


}
