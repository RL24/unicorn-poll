package me.rl24.unicorn.poll.payload;

import me.rl24.unicorn.poll.payload.bean.View;

public class ViewsOpenResponsePayload {

    private boolean ok;
    private View view;
    private String error;

    public boolean isOk() {
        return ok;
    }

    public ViewsOpenResponsePayload setOk(boolean ok) {
        this.ok = ok;
        return this;
    }

    public View getView() {
        return view;
    }

    public ViewsOpenResponsePayload setView(View view) {
        this.view = view;
        return this;
    }

    public String getError() {
        return error;
    }

    public ViewsOpenResponsePayload setError(String error) {
        this.error = error;
        return this;
    }
}
