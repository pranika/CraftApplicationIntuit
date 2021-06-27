package CraftApp.data;



import CraftApp.models.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PostsData {

    static TreeMap<LocalDate, List<Post>> postsStorage=new TreeMap<>(Collections.reverseOrder());
    static HashMap<String,Post> postsToKey=new HashMap<>();
    static PriorityQueue<Post> posts=new PriorityQueue<>(new Comparator<Post>() {
        @Override
        public int compare(Post o1, Post o2) {
            return o2.getCreateDate().compareTo(o1.getCreateDate());
        }
    });

    //Storing Posts Based on Days they are added.
    public  void storePosts(Post post){
        postsToKey.put(post.getPostId(),post);
        posts.add(post);
    }

    public PriorityQueue<Post> getAllPosts(){
        return posts;
    }

    public  Post getPostById(String post){
        return postsToKey.get(post);
    }

    public void storePostsWithDate(Post p){
        LocalDate now=LocalDate.now();
        if(postsStorage.containsKey(now)){
            postsStorage.get(now).add(p);
        }else{
            List<Post> posts=new ArrayList<>();
            posts.add(p);
            postsStorage.put(now,posts);
        }
    }

    public List<Post> getPostsForTheDay(){

        return postsStorage.get(LocalDate.now());
    }



}
