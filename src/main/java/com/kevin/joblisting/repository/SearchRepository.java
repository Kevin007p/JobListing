package com.kevin.joblisting.repository;

import com.kevin.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
