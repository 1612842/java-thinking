package com.cong.http.message.response;
import com.cong.http.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
