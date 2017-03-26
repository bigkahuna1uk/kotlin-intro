package com.chriskelly.kotlincourse.classes;

import com.google.common.base.MoreObjects;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * CustomerJava
 *
 * @author bigkahuna
 * @since 26/03/2017
 */
public class CustomerJava {

    private final int id;
    private final String name;
    private final String email;

    public CustomerJava(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerJava that = (CustomerJava) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("email", email)
                .toString();
    }

    public void prettyPrint() {
        System.out.println("id = " + id + " name = " + name);
    }

    public @NotNull String neverNull()
    {
        return "A String";
    }

    public String sometimesNull()
    {
        return "A String";
    }
}
