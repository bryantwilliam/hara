package com.sturdyhelmetgames.hara.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents an singular item that can be automated.
 * Items can range from small to big, for example a
 * single sensor or a light switch.
 * Created by antti on 06/10/14.
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long hwAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHwAddress() {
        return hwAddress;
    }

    public void setHwAddress(long hwAddress) {
        this.hwAddress = hwAddress;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hwAddress=" + hwAddress +
                '}';
    }
}
