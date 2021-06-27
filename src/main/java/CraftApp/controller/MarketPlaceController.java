package CraftApp.controller;



import CraftApp.models.Post;
import CraftApp.service.SellersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MarketPlaceController {

    SellersService sellersService=new SellersService();

    public List<Post> getRecentPostsWithBids(int k) {
        return sellersService.getRecentPostsWithBids(k);
    }





}
