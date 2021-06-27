package com.example.intuit.craft;

import CraftApp.controller.BuyersController;
import CraftApp.controller.MarketPlaceController;
import CraftApp.controller.SellersController;
import CraftApp.models.Bid;
import CraftApp.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class CraftApplication {

	public static void main(String[] args) {

		SpringApplication.run(CraftApplication.class, args);
		SellersController sellersController=new SellersController();
		BuyersController buyersController=new BuyersController();

		Post p=new Post();
		p.setPostId("Project1");
		p.setLastDay(LocalDate.now());
		p.setHoursOfCompletion(8.0);
		p.setName("Pranika");
		p.setCreateDate(LocalDate.now());
		sellersController.addPosts(p);


		Post p1=new Post();
		p1.setPostId("Project2");
		p1.setLastDay(LocalDate.now());
		p1.setHoursOfCompletion(12.0);
		p1.setName("Pranika1.0");
		p1.setCreateDate(LocalDate.now());
		sellersController.addPosts(p1);


		Post p2=new Post();
		p2.setPostId("Project3");
		p2.setLastDay(LocalDate.now());
		p2.setHoursOfCompletion(10.0);
		p2.setName("Pranika1.1");
		p2.setCreateDate(LocalDate.now());
		sellersController.addPosts(p2);


		Post p3=new Post();
		p3.setPostId("Project4");
		p3.setLastDay(LocalDate.now());
		p3.setHoursOfCompletion(9.0);
		p3.setName("Pranika1.2");
		p3.setCreateDate(LocalDate.now());
		sellersController.addPosts(p3);


		Post p4=new Post();
		p4.setPostId("Project5");
		p4.setLastDay(LocalDate.now());
		p4.setHoursOfCompletion(15.0);
		p4.setName("Pranika1.3");
		p4.setCreateDate(LocalDate.now());
		sellersController.addPosts(p4);


		Bid bid=new Bid();

		bid.setBuyerName("Anuj");
		bid.setBidCost(2.3);
		bid.setBidDate(LocalDate.now());
		bid.setProjectId("Project1");
		buyersController.storeBids(bid);
		buyersController.bidAPost(bid,p);


		Bid bid2=new Bid();

		bid2.setBuyerName("Anuj1.1");
		bid2.setBidCost(2.6);
		bid2.setBidDate(LocalDate.now());
		bid2.setProjectId("Project1");
		buyersController.storeBids(bid2);
		buyersController.bidAPost(bid2,p);


		Bid bid3=new Bid();

		bid3.setBuyerName("Anuj1.2");
		bid3.setPerHourCost(1.1);
		bid3.setBidDate(LocalDate.now());
		bid3.setProjectId("Project2");
		buyersController.storeBids(bid3);
		buyersController.bidAPost(bid3,p1);

		MarketPlaceController marketPlaceController=new MarketPlaceController();
		for(Post post:marketPlaceController.getRecentPostsWithBids(2)){
			System.out.println(post.getName());
			System.out.println(post.getBidWinnerId());
		}

	}

}
