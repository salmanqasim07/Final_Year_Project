package com.bakrin.fblive.model.response;

import com.bakrin.fblive.model.response.LeagueListItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Leagues {

    @SerializedName("leagues")
    @Expose
    private ArrayList<LeagueListItem> leagues;

    public ArrayList<LeagueListItem> getLeagues() {
        return leagues;
    }

    public void setLeagues(ArrayList<LeagueListItem> leagues) {
        this.leagues = leagues;
    }
}
