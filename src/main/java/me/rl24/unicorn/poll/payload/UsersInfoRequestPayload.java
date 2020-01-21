package me.rl24.unicorn.poll.payload;

public class UsersInfoRequestPayload {

    private String token, user;

    public String getToken() {
        return token;
    }

    public UsersInfoRequestPayload setToken(String token) {
        this.token = token;
        return this;
    }

    public String getUser() {
        return user;
    }

    public UsersInfoRequestPayload setUser(String user) {
        this.user = user;
        return this;
    }
}
