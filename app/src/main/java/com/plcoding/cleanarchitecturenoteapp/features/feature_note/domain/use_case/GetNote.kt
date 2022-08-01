package com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.repository.NoteRepository

class GetNote(val repository: NoteRepository){

    suspend operator fun invoke(noteId:Int):Note?{
       return repository.getNoteById(noteId)
    }

}