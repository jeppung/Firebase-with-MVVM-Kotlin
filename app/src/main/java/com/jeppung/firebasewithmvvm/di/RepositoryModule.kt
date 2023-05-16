package com.jeppung.firebasewithmvvm.di

import com.google.firebase.firestore.FirebaseFirestore
import com.jeppung.firebasewithmvvm.data.repository.NoteRepository
import com.jeppung.firebasewithmvvm.data.repository.NoteRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository(database: FirebaseFirestore): NoteRepository {
        return NoteRepositoryImp(database)
    }

}