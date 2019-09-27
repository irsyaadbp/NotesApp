package com.irsyaad.dicodinglatihan.mynotesapp;

import com.irsyaad.dicodinglatihan.mynotesapp.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}