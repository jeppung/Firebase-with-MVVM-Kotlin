package com.jeppung.firebasewithmvvm.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.jeppung.firebasewithmvvm.data.model.Note
import java.util.*

class NoteRepositoryImp(val database: FirebaseFirestore): NoteRepository {

    override fun getNotes(): List<Note> {
        // Get data from database
        return arrayListOf(
            Note(
                id = "dfasd",
                text = "Note 1",
                date = Date()
            ),
            Note(
                id = "sdqvq",
                text = "Note 2",
                date = Date()
            ),
            Note(
                id = "jhgjj",
                text = "Note 3",
                date = Date()
            ),
        )
    }
}