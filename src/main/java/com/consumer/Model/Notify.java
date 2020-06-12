package com.consumer.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@Document(value="notification")
public class Notify {
    @Id
    private String productid;
    private ArrayList<String> useridList;
    public Notify(){}
    public Notify(NotifyQueueRequest notifyQueueRequest){
        this.productid=notifyQueueRequest.getProductid();
        this.useridList.add(notifyQueueRequest.getUserid());
    }
    public void setuseridList(String userid){
        this.useridList.add(userid);
    }
}
