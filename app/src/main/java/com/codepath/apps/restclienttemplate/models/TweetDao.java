package com.codepath.apps.restclienttemplate.models;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TweetDao {

    @Query("SELECT * FROM Tweet ORDER BY id DESC LIMIT 300")
    List<TweetWithUser> recentItems();
}
