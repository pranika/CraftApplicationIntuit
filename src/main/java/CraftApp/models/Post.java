package CraftApp.models;

import java.time.LocalDate;

public class Post {
    String postId;
    LocalDate lastDay;
    String name;
    Double initialCost;
    String description;
    LocalDate createDate;

    public Double getHoursOfCompletion() {
        return hoursOfCompletion;
    }

    public void setHoursOfCompletion(Double hoursOfCompletion) {
        this.hoursOfCompletion = hoursOfCompletion;
    }

    Double hoursOfCompletion;

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getBidWinnerId() {
        return bidWinnerId;
    }

    public void setBidWinnerId(String bidWinnerId) {
        this.bidWinnerId = bidWinnerId;
    }

    String bidWinnerId;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(Double initialCost) {
        this.initialCost = initialCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
