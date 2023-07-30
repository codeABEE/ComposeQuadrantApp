package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}


@Composable
fun QuadrantApp() {

    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {

            ComposableInfoCard(
                title = stringResource(id = R.string.text_composable_title),
                body = stringResource(id = R.string.text_composable_body),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )

            ComposableInfoCard(
                title = stringResource(id = R.string.image_composable_title),
                body = stringResource(id = R.string.image_composable_body),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

        }

        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(id = R.string.row_composable_title),
                body = stringResource(id = R.string.row_composable_body),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(id = R.string.column_composable_title),
                body = stringResource(id = R.string.column_composable_body),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )

        }
        
    }
}

@Composable
fun ComposableInfoCard(
    title: String,
    body: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
    
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold

        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
        
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        QuadrantApp()
    }
}