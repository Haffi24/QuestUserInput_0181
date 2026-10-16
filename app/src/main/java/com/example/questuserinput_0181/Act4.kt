package com.example.questuserinput_0181

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun FormDataDiri(modifier: Modifier){
    //variabel-variebl untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf(value = "")}
    var textAlamat by remember {mutableStateOf(value = "")}
    var textJK by remember {mutableStateOf(value = "")}


    //variabel2 untuk menyimpan data yang diperoleh dari kompnen UI
    var name by remember { mutableStateOf(value = "") }
}

