package org.lwjglx.input;

public class KeyEvent {

    public int key;
    public int codepoint;
    public KeyState state;
    public long nano;
    public boolean queueOutOfOrderRelease;

    public KeyEvent(int key, int codepoint, KeyState state, long nano) {
        this.key = key;
        this.codepoint = codepoint;
        this.state = state;
        this.nano = nano;
    }

    public KeyEvent copy() {
        final KeyEvent ev = new KeyEvent(key, codepoint, state, nano);
        ev.queueOutOfOrderRelease = this.queueOutOfOrderRelease;
        return ev;
    }
}