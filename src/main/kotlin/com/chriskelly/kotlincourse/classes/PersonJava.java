package com.chriskelly.kotlincourse.classes;

import com.google.common.base.MoreObjects;

/**
 * PersonJava
 *
 * @author bigkahuna
 * @since 26/03/2017
 */
public class PersonJava {

    private int id;

    public PersonJava(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }
}
