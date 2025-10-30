package com.example.questuserinput_074

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@composable
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
                textNama = it
            }
        )
        Row {
            gender.forEach { item ->
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
                textAlamat = it
            }
            )
        }
    }
}