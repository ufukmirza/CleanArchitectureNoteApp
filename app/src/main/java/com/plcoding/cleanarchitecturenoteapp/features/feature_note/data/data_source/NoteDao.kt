package com.plcoding.cleanarchitecturenoteapp.features.feature_note.data.data_source

import android.media.MediaCodec
import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    @Query("Select * from note")
    fun getNotes(): Flow<List<Note>>

    @Query("Select * from note Where id=:id")
    suspend fun getNoteById(id:Int):Note

    @Insert(onConflict =OnConflictStrategy.REPLACE
    )suspend fun instertNote(note:Note)

    @Delete
    suspend fun deleteNote(note:Note)


}