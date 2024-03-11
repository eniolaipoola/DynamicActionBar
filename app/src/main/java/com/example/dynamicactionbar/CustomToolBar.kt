package com.example.dynamicactionbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

/**
 * Class Description
 * Created by Eniola Ipoola on 29/02/2024.
 * Copyright (c) 2022 IDENTOS Inc. All rights reserved
 */

@ExperimentalMaterial3Api
@Composable
fun CustomToolBar(
    title: String,
    onBackClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(text = title)},
        modifier = modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.topAppBarColors(
            titleContentColor = Color.Black,
            containerColor = Color.White,
            actionIconContentColor = Color.Red
        )
    )
}


@Preview(showBackground = true)
@Composable
fun SearchViewPreview() {}