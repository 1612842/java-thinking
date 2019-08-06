package com.cong.http.message.response;

import com.cong.http.model.Round;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class GameResponse extends Response {
    private Long id;
    private Date time;
    private String userChoice;
    private String machineChoice;
    private String result;

    public GameResponse(String status, String message, Round round) {
        super(status,message);
        this.id = round.getId();
        this.time =round.getTime();
        this.result=round.getResult();
        this.userChoice=round.getChoice();
        this.machineChoice=round.getMachine();
    }

}
