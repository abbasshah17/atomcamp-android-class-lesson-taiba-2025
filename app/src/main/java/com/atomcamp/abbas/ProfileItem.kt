package com.atomcamp.abbas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileItem(
    modifier: Modifier = Modifier,
    profileData: Profile,
) {
    val roundCornerPercentage = 20

    Column(
        modifier = modifier
            .background(
                color = Color.Red,
                shape = RoundedCornerShape(
                    topStartPercent = roundCornerPercentage,
                    topEndPercent = roundCornerPercentage,
                    bottomEndPercent = roundCornerPercentage,
                    bottomStartPercent = roundCornerPercentage,
                ),
            )
            .padding(vertical = 20.dp, horizontal = 10.dp)
            .fillMaxWidth(fraction = 0.8f),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = profileData.name,
        )
        Text(
            text = profileData.userName,
        )
    }
}