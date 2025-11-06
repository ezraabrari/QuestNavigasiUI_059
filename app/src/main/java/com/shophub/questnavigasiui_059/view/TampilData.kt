package com.shophub.questnavigasiui_059.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.shophub.questnavigasiui_059.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Contoh nama"),
        Pair(stringResource(R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(R.string.alamat), "Yogyakarta")
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.tampil),
                        color = Color.White
                    )
                },
            )
        }){ isiRuang->

    }
}