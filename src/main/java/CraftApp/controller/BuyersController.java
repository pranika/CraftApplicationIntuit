package CraftApp.controller;

import CraftApp.models.Bid;
import CraftApp.models.Post;
import CraftApp.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class BuyersController {

    private BuyerService buyerService=new BuyerService();

    public void storeBids(Bid bid){
        buyerService.storeBid(bid);
    }

    public void bidAPost(Bid b, Post p){
        buyerService.bidAPost(b,p);
    }

}
