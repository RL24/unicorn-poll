package me.rl24.unicorn.poll.payload;

import me.rl24.unicorn.poll.payload.bean.View;

public class CreatePollOpenResponsePayload {

    private boolean ok;
    private View view;

    public boolean isOk() {
        return ok;
    }

    public CreatePollOpenResponsePayload setOk(boolean ok) {
        this.ok = ok;
        return this;
    }

    public View getView() {
        return view;
    }

    public CreatePollOpenResponsePayload setView(View view) {
        this.view = view;
        return this;
    }
}
