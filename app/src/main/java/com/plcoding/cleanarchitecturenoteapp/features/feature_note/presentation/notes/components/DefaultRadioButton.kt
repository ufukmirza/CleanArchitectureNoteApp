package com.plcoding.cleanarchitecturenoteapp.features.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DefaultRadioButton(
    text:String,
    selected:Boolean,
    modifier:Modifier=Modifier,
    onSelect:()->Unit,
){

    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically){

        RadioButton(selected = selected, onClick = onSelect, colors = RadioButtonDefaults.colors(
            selectedColor = MaterialTheme.colors.primary,
            unselectedColor = MaterialTheme.colors.background
        ))
        Spacer(modifier.padding(8.dp))
        Text(text = text,style=MaterialTheme.typography.body1)
    }
}


@Preview
@Composable
fun DefaultRadioButtonPreview(){

    DefaultRadioButton(text = "order by name", selected =true ) {

    }


}