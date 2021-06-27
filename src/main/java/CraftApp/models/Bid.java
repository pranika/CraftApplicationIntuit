package CraftApp.models;

import java.time.LocalDate;

public class Bid {
    String buyerName;
    Double bidCost;
    String description;
    String projectId;

    public Double getPerHourCost() {
        return perHourCost;
    }

    public void setPerHourCost(Double perHourCost) {
        this.perHourCost = perHourCost;
    }

    Double perHourCost;

    public LocalDate getBidDate() {
        return bidDate;
    }

    public void setBidDate(LocalDate bidDate) {
        this.bidDate = bidDate;
    }

    LocalDate bidDate;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getBidId() {
        return bidId;
    }

    public void setBidId(String bidId) {
        this.bidId = bidId;
    }

    String bidId;

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Double getBidCost() {
        return bidCost;
    }

    public void setBidCost(Double bidCost) {
        this.bidCost = bidCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
