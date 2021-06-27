package CraftApp.data;



import CraftApp.models.Bid;
import CraftApp.models.Post;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Component
public class BidData {

    static HashMap<String, Bid> bids=new HashMap<>();
    static HashMap<LocalDate, List<Bid>> everyDayBids=new HashMap<>();
    static HashMap<String,PriorityQueue<Bid>> bidToProject=new HashMap<>();

    public void storeBids(Bid bid){
        bids.put(bid.getBidId(),bid);

        if(everyDayBids.containsKey(bid.getBidDate())){
            everyDayBids.get(bid.getBidDate()).add(bid);
        }else{
            List<Bid> bids=new ArrayList<>();
            bids.add(bid);
            everyDayBids.put(bid.getBidDate(),bids);
        }
    }

    public void bidToProjectMap(Bid bid, Post post){
        String projectID=post.getPostId();
        if(bidToProject.containsKey(projectID)){
            bidToProject.get(projectID).add(bid);
        }else{
            PriorityQueue<Bid> bids=new PriorityQueue<Bid>(new Comparator<Bid>() {
                @Override
                public int compare(Bid o1, Bid o2) {
                    Double bidCostBuyer1= o1.getBidCost()!=null && o1.getBidCost()>0?o1.getBidCost():o1.getPerHourCost()*post.getHoursOfCompletion();
                    Double bidCostBuyer2= o1.getBidCost()!=null && o2.getBidCost()>0?o2.getBidCost():o2.getPerHourCost()*post.getHoursOfCompletion();
                    return bidCostBuyer1.compareTo(bidCostBuyer2);
                }
            });
            bids.add(bid);
            bidToProject.put(projectID,bids);
        }
    }

    public PriorityQueue<Bid> getBids(String post){
        return bidToProject.get(post);
    }

}
