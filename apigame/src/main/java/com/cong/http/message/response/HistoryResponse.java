package com.cong.http.message.response;

import com.cong.http.model.Game;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HistoryResponse extends Response {

    private List<Game> history;

    public HistoryResponse(String status, String message, List<Game> history){
        super(status,message);
       this.history=history;
    }

}
