package com.example.dynamicactionbar.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * Class Description
 * Created by Eniola Ipoola on 08/03/2024.
 * Copyright (c) 2022 IDENTOS Inc. All rights reserved
 */

@Composable
fun AndroidAlien(
    color: Color,
    modifier: Modifier = Modifier
) {
    Image(
      modifier = modifier,
        contentDescription = "Sample Image" ,
        painter = painterResource(id = androidx.core.R.drawable.ic_call_answer),
        colorFilter = ColorFilter.tint(color = color)

    )
}


@Composable
fun AndroidAliens(modifier: Modifier) {
    Row(modifier = modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        AndroidAlien(color = Color.Red,
            modifier = modifier
                .size(100.dp)
                .padding(8.dp)
        )
        AndroidAlien(color = Color.Black,
            modifier = modifier
                .size(100.dp)
                .padding(8.dp)
        )
        AndroidAlien(color = Color.White,
            modifier = modifier
                .size(100.dp)
                .padding(8.dp)
        )
    }

}