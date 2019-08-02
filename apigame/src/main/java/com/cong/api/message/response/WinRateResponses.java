package com.cong.api.message.response;

import com.cong.api.model.User;

import java.util.*;

public class WinRateResponses {

    private List<WinRateResponse> winRateResponses;

    public WinRateResponses(List<User> users){
        winRateResponses = new ArrayList<WinRateResponse>();
        for (User user: users) {
            winRateResponses.add(new WinRateResponse(user));
        }
    }

    public List<WinRateResponse> getWinRateResponses() {
        return winRateResponses;
    }

    public void setWinRateResponses(List<WinRateResponse> winRateResponses) {
        this.winRateResponses = winRateResponses;
    }
}
