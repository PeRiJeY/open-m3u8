package com.iheartradio.m3u8.data;

import java.util.Map;
import java.util.Objects;

public class TrackInfo {
    public final float duration;
    public final String title;
    public final Map<String, String> attributes;

    public TrackInfo(float duration, String title, Map<String, String> attributes) {
        this.duration = duration;
        this.title = title;
        this.attributes = attributes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, title, attributes);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TrackInfo)) {
            return false;
        }

        TrackInfo other = (TrackInfo) o;
        
        return this.duration == other.duration &&
                Objects.equals(this.title, other.title) &&
                Objects.equals(this.attributes, other.attributes);
    }

}
