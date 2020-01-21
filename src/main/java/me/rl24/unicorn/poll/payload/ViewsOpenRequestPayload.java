package me.rl24.unicorn.poll.payload;

import com.google.gson.annotations.SerializedName;
import me.rl24.unicorn.poll.payload.bean.View;

public class ViewsOpenRequestPayload {

    @SerializedName("trigger_id")
    private String triggerId;
    private View view;

    public String getTriggerId() {
        return triggerId;
    }

    public ViewsOpenRequestPayload setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }

    public View getView() {
        return view;
    }

    public ViewsOpenRequestPayload setView(View view) {
        this.view = view;
        return this;
    }
}
