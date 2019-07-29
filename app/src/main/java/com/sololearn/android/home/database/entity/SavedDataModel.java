package com.sololearn.android.home.database.entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Comparator;

@Entity(tableName = "saved_data")
public class SavedDataModel implements Comparator<SavedDataModel> {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;
    @ColumnInfo(name = "sectionName")
    private String sectionName;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "imageUrl")
    private String imageUrl;

    public SavedDataModel() {
    }


    public SavedDataModel(String sectionName, String title, String imageUrl) {
        this.sectionName = sectionName;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int compare(SavedDataModel savedDataModel, SavedDataModel t1) {
        return savedDataModel.getSectionName().compareTo(t1.getSectionName());
    }
}
