package me.rl24.unicorn.poll.payload;

import me.rl24.unicorn.poll.payload.bean.User;

public class UsersInfoResponsePayload {

    private boolean ok;
    private User user;
    private String error;

    public boolean isOk() {
        return ok;
    }

    public UsersInfoResponsePayload setOk(boolean ok) {
        this.ok = ok;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UsersInfoResponsePayload setUser(User user) {
        this.user = user;
        return this;
    }

    public String getError() {
        return error;
    }

    public UsersInfoResponsePayload setError(String error) {
        this.error = error;
        return this;
    }
}
