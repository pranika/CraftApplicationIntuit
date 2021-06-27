package CraftApp.service;

import CraftApp.data.BidData;
import CraftApp.data.PostsData;
import CraftApp.models.Bid;
import CraftApp.models.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@Component
public class SellersService {

    PostsData postsData=new PostsData();

    BidData bidData=new BidData();

    public void storePosts(Post post){
        postsData.storePosts(post);
    }

    public List<Post> getTopKPosts(int k){
        List<Post> posts=new ArrayList<>();
        PriorityQueue<Post> recentPosts=postsData.getAllPosts();
        int count=k;
        while(count>0){
            posts.add(recentPosts.poll());
            count--;
        }
        return posts;
    }

   public List<Post> getRecentPostsWithBids(int k){
        List<Post> posts = getTopKPosts(k);
        for(Post currentPost:posts){
            if(currentPost.getLastDay().equals(LocalDate.now())){
                PriorityQueue<Bid> bids=bidData.getBids(currentPost.getPostId());
                if(null!=bids && !bids.isEmpty()) {
                    currentPost.setBidWinnerId(bids.poll().getBidId());
                }
            }else{
                currentPost.setBidWinnerId("Not Yet Reached The Deadline");
            }
        }
        return posts;
    }

}
