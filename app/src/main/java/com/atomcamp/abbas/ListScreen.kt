package com.atomcamp.abbas

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    items: List<Data>,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        stickyHeader {
            ProfileExtendedItem(
                profileData = ProfileExtended.Example1,
            )
        }

        items(
            count = items.size,
            key = { index ->
                val item = items.get(index)
                item.userName
            },
            contentType = { index ->
                val item = items.get(index)

                when (item) {
                    is Profile -> {
                        "profile"
                    }

                    is ProfileExtended -> {
                        "profile-extended"
                    }
                }
            },
            itemContent = { index ->
                val item = items.get(index)

                when (item) {
                    is Profile -> {
                        ProfileItem(
                            profileData = item,
                        )
                    }

                    is ProfileExtended -> {
                        ProfileExtendedItem(
                            profileData = item
                        )
                    }
                }
            }
        )

        item {
            CircularProgressIndicator()
        }
    }
}