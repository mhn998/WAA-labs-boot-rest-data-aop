package com.example.waa_first_demo.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @NonNull
    private String name;

    List<Post> posts;

    Address address;

    public User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.posts = user.posts;
    }

    public User(int i, String name) {
        this.id = i;
        this.name = name;
    }

    public void setUser(User user) {
        this.id = user.id;
        this.name = user.name;
        this.posts = user.posts;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}