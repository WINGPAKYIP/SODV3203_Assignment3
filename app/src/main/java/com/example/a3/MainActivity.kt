package com.example.a3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a3.data.A3
import com.example.a3.data.Datasource
import com.example.a3.ui.theme.A3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                A3Theme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        A3App()
                    }
            }
        }
    }
}

@Composable
fun A3App() {
    val (a3List, updateA3List) = remember { mutableStateOf(Datasource().loadA3s().distinctBy { it.day }) }

    A3List(
        a3List = a3List,
        onClick = { index ->
            updateA3List(a3List.mapIndexed { i, a3 ->
                if (i == index) {
                    a3.copy(isVerseVisible = !a3.isVerseVisible)
                } else {
                    a3
                }
            })
        }
    )
}


@Composable
fun A3List(a3List: List<A3>, modifier: Modifier = Modifier, onClick: (Int) -> Unit)  {
    LazyColumn(modifier = modifier) {
        itemsIndexed(a3List) { index, a3 ->
            A3Item(
                a3 = a3,
                modifier = Modifier.padding(8.dp),
                onClick = { onClick(index) }
            )
        }
    }
}




@Composable
fun A3Item(a3: A3, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Card(
        modifier = modifier.clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = a3.day,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = a3.reference,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = painterResource(id = a3.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            AnimatedVisibility(visible =  a3.isVerseVisible) {
                Text(
                    text = a3.verse,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}




@Preview(showBackground = true)
@Composable
fun A3ItemPreview() {
    A3Item(
        a3 = A3(
            imageResourceId = R.drawable.day1,
            day = "Day 1",
            verse = "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life.",
            reference = "- John 3:16",
            isVerseVisible = false
        ),
        onClick = {}
    )
}

