package com.jeppung.firebasewithmvvm.data.repository

import com.jeppung.firebasewithmvvm.data.model.Note

interface NoteRepository {

    fun getNotes(): List<Note>
}