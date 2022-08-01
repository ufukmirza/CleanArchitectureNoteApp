package com.plcoding.cleanarchitecturenoteapp.features.feature_note.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.features.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.descending),
    val isOrderSectionVisible: Boolean = false
)
