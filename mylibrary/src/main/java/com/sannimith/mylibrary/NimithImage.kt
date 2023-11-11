package com.sannimith.mylibrary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun NimithImage(id:Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = id), contentDescription = null)
    }
}