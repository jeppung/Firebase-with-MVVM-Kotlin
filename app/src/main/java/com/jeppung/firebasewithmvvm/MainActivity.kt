package com.jeppung.firebasewithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Firebase.firestore

        val user: MutableMap<String, Any> = HashMap()
        user["first"] = "Joshua"
        user["last"] = "Pulung"
        user["born"] = 2000

        db.collection("users").add(user).addOnSuccessListener { documentRef ->
            Log.d("TAG", "Document Snapshot added with ID: " + documentRef.id)
        }.addOnFailureListener { e ->
            Log.w("TAG", "Error adding document", e)
        }
    }
}