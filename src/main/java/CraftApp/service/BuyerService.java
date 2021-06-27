package CraftApp.service;


import CraftApp.data.BidData;
import CraftApp.models.Bid;
import CraftApp.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {

    BidData bidData=new BidData();

    public void storeBid(Bid bid){
        bidData.storeBids(bid);
    }

    public void bidAPost(Bid bid, Post post){
        bidData.bidToProjectMap(bid,post);
    }

}
