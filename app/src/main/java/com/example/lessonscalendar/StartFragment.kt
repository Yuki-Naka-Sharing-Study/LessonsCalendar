package com.example.lessonscalendar

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview

import com.example.lessonscalendar.ui.theme.LessonsCalendarTheme

class StartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext()).apply {
            setContent {
                StartScreen()
            }
        }
        return composeView
    }
}

@Composable
fun StartScreen() {
    Text(
        text = "習い事を開始用画面"
    )
}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview() {
    LessonsCalendarTheme {
        StartScreen()
    }
}

@Composable
private fun WhatToLearnText() {
    Text(
        text = "開始する習い事"
    )
}

@Preview(showBackground = true)
@Composable
private fun WhatToLearnTextPreview() {
    LessonsCalendarTheme {
        WhatToLearnText()
    }
}

@Composable
private fun WhatToLearnTextField() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text("ピアノ") }
    )
}

@Preview(showBackground = true)
@Composable
private fun WhatToLearnTextFieldPreview() {
    LessonsCalendarTheme {
        WhatToLearnTextField()
    }
}

@Composable
private fun WhenToLearnText() {
    Text(
        text = "いつから開始？"
    )
}

@Preview(showBackground = true)
@Composable
private fun WhenToLearnTextPreview() {
    LessonsCalendarTheme {
        WhenToLearnText()
    }
}

@Composable
private fun MonthlyCostText() {
    Text(
        text = "習い事の月額費用"
    )
}

@Preview(showBackground = true)
@Composable
private fun MonthlyCostTextPreview() {
    LessonsCalendarTheme {
        MonthlyCostText()
    }
}

@Composable
private fun StartButton() {
    Button(onClick = { /*TODO*/ },) {
        Text(text = "習い事を開始")
    }
}

@Preview(showBackground = true)
@Composable
private fun StartButtonPreview() {
    LessonsCalendarTheme {
        StartButton()
    }
}