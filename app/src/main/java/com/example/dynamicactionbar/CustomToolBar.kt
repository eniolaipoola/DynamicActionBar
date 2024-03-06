package com.example.dynamicactionbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
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
    modifier: Modifier = Modifier,
    primaryColor: Color = Color.Black,
    titleColor: Color = Color.White,
    shouldShowBackButton: Boolean = true
) {
    TopAppBar(title = { "Splash Screen Page" },
        modifier = modifier)
}


@Preview(showBackground = true)
@Composable
fun SearchViewPreview() {}