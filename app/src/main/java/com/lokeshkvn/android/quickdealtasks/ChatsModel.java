package com.lokeshkvn.android.quickdealtasks;

/**
 * Created by DELL PC on 20-04-2017.
 */

public class ChatsModel {

    private String name;
    private String message;
    private String time;
    private boolean unread;
    private String unread_count;
    private boolean deal_done;

    public ChatsModel(String name, String message, String time, boolean unread, String unread_count, boolean deal_done) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.unread = unread;
        this.unread_count = unread_count;
        this.deal_done = deal_done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public String getUnread_count() {
        return unread_count;
    }

    public void setUnread_count(String unread_count) {
        this.unread_count = unread_count;
    }

    public boolean isDeal_done() {
        return deal_done;
    }

    public void setDeal_done(boolean deal_done) {
        this.deal_done = deal_done;
    }
}
