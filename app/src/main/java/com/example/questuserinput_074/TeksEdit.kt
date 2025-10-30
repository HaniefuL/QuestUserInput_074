package com.example.questuserinput_074

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp

annotation class composable

@Composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf(" ") }
    var textJK by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf(" ") }
    var jenis by remember { mutableStateOf("") }


    val gender:List<String> = listOf("Laki-laki","Perempuan")

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = { Text(text = " Nama Lenkkap") },
            onValueChange = {
                val it = null
                textNama = it
            }
        )
        Row {
            gender.forEach { item ->
                val textJk = null
                Row (modifier = Modifier.selectable(
                    selected = textJk == item,
                    onClick = { textJk = item}
                ), verticalAlignment = Alignment.CenterVertically){
                    RadioButton(
                        selected = textJk == item,
                        onClick = {
                            textJk = item
                        })
                    Text(item)
                }
            }
        }
        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            modifier = Modifier.width(250.dp),
            label = {Text(text = "Alamat Lengkap")},
            onValueChange = {
                val it = null
                textAlamat = it
            }
        )
        Divider(
            modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_medium), top = dimensionResource)
            id = 30dp
            )),
            thickness = dimensionResource(1dp),
            color = Color.DarkGray
        )

        Button(
            modifier = Modifier.fillMaxWidth(fraction = if),
            //the button is enabled when the user makes a selection
            enabled = textAlamat.isNotEmpty(),
            onClick = {
                nama=textNama
                jenis=textJK
                alamat=textAlamat

            }
        )
    }
}