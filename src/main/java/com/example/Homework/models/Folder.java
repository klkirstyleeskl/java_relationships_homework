package com.example.Homework.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")


public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "title")
    private String tile;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;



    private List<File> files;


    public Folder(String tile, Folder folder, List<File> files) {
        this.tile = tile;
        this.folder = folder;
        this.files = new ArrayList<>();

    }

    public Folder(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
