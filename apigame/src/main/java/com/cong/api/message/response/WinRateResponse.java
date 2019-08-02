package com.cong.api.message.response;

import com.cong.api.model.User;

public class WinRateResponse {
    private Long id;
    private String name;
    private String username;
    private int winRounds;
    private int totalRounds;
    private float winRate;

    public WinRateResponse(User user) {
        this.id =user.getId();
        this.name=user.getName();
        this.username=user.getUsername();
        this.winRounds=user.getWinRounds();
        this.totalRounds=user.getTotalRounds();
        this.winRate = (float) this.winRounds*100/this.totalRounds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getWinRounds() {
        return winRounds;
    }

    public void setWinRounds(int winRounds) {
        this.winRounds = winRounds;
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    public void setTotalRounds(int totalRounds) {
        this.totalRounds = totalRounds;
    }

    public float getWinRate() {
        return winRate;
    }

    public void setWinRate(float winRate) {
        this.winRate = winRate;
    }
}
