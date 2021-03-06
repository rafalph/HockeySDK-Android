package net.hockeyapp.android.metrics.model;

/**
 * Enum SessionState.
 */
public enum SessionState {
    START(0), END(1);

    private final int value;

    SessionState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
