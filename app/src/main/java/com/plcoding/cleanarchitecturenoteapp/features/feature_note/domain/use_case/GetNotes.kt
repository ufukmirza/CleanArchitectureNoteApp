package com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.use_case


import com.plcoding.cleanarchitecturenoteapp.features.feature_note.data.repository.NoteRepositoryImp
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.repository.NoteRepository

import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class GetNotes(private val repository: NoteRepository) {
    operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OrderType.descending)): Flow<List<Note>> {
        return repository.getNotes().map { notes ->

            when (noteOrder.orderType) {
                is OrderType.descending -> {
                    when (noteOrder) {
                        is NoteOrder.Date -> {
                            notes.sortedBy { it.timestamp }
                        }
                        is NoteOrder.Color -> {
                            notes.sortedBy { it.color }
                        }
                        is NoteOrder.Title -> {
                            notes.sortedBy { it.title.lowercase() }
                        }
                    }
                }
                is OrderType.ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Date -> {
                            notes.sortedBy { it.timestamp }
                        }
                        is NoteOrder.Color -> {
                            notes.sortedBy { it.color }
                        }
                        is NoteOrder.Title -> {
                            notes.sortedBy { it.title.lowercase() }
                        }
                    }
                }
            }
        }
    }
}
