package me.rl24.unicorn.poll.util.request;

public class HeaderPair<T, U> {

    private final T key;
    private final U value;

    public HeaderPair(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public U getValue() {
        return value;
    }

}
