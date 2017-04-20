package com.lokeshkvn.android.quickdealtasks;

/**
 * Created by DELL PC on 20-04-2017.
 */

public class LeadsModel {

    private String nameLead;
    private String description;
    private String timeLead;
    private boolean unread;

    public LeadsModel(String nameLead, String description, String timeLead, boolean unread) {
        this.nameLead = nameLead;
        this.description = description;
        this.timeLead = timeLead;
        this.unread = unread;
    }

    public String getNameLead() {
        return nameLead;
    }

    public void setNameLead(String nameLead) {
        this.nameLead = nameLead;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeLead() {
        return timeLead;
    }

    public void setTimeLead(String timeLead) {
        this.timeLead = timeLead;
    }

    public boolean isUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }
}
