package com.example.agendiario;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "series")



public class TVSeries {

 
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "seriesId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "seriesTitle")
    private String mTitle;

    private String mPersonage;

    public TVSeries(@Nullable String title, String personage, int score, String creationDate) {
        mTitle = title;
        mPersonage = personage;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getPersonage() {
        return mPersonage;
    }

    public void setPersonage(String personage) {
        mPersonage = personage;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;

}