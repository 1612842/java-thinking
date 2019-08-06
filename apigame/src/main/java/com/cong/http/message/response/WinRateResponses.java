package com.cong.http.message.response;

import com.cong.http.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class WinRateResponses extends Response {

    private List<WinRateResponse> winRateResponses;

    public WinRateResponses(String status, String message,List<User> users){
        super(status,message);
        winRateResponses = new ArrayList<WinRateResponse>();
        for (User user: users) {
            winRateResponses.add(new WinRateResponse(user));
        }
    }

    public WinRateResponses(List<User> users){
        winRateResponses = new ArrayList<WinRateResponse>();
        for (User user: users) {
            winRateResponses.add(new WinRateResponse(user));
        }
    }

}
