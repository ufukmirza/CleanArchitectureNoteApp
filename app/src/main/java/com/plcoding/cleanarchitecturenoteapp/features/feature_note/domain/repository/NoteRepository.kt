package com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {


    fun getNotes(): Flow<List<Note>>


    suspend fun getNoteById(id:Int): Note


    suspend fun addNote(note: Note)


    suspend fun deleteNote(note: Note)


}