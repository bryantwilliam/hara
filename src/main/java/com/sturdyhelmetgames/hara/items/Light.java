package com.sturdyhelmetgames.hara.items;

/**
 * Created by antti on 06/10/14.
 */
public class Light {

    private final long id;
    private final String name;

    public Light(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
