package com.example.lessonscalendar

import android.app.DatePickerDialog
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
    Row {
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            WhatToLearnText()
            WhatToLearnTextField()
            WhenToLearnText()
            WhenToLearnPicker()
            MonthlyCostText()
            MonthlyCostInputField()
            YenText()
            StartButton()
        }
    }
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
private fun WhenToLearnPicker() {
    val context = LocalContext.current
    var selectedDate by remember { mutableStateOf("") }

    Button(onClick = {
        // 日付選択ダイアログを表示
        DatePickerDialog(context, { _, year, month, day ->
            selectedDate = "2024年10月25日"
        }, 2024, 10, 25).show()
    }) {
        Text("日付を選択")
    }

    if (selectedDate.isNotEmpty()) {
        Text(text = "選択された日付: $selectedDate")
    }
}

@Preview(showBackground = true)
@Composable
private fun WhenToLearnPickerPreview() {
    LessonsCalendarTheme {
        WhenToLearnPicker()
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
private fun MonthlyCostInputField() {
    var inputValue by remember { mutableStateOf("") }

    TextField(
        value = inputValue,
        onValueChange = { newValue ->
            if (newValue.all { it.isDigit() || it == '.' }) {
                inputValue = newValue
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Number
        ),
        modifier = Modifier.fillMaxWidth(),
        label = { Text("10,000") }
    )
}

@Preview(showBackground = true)
@Composable
private fun MonthlyCostInputFieldPreview() {
    LessonsCalendarTheme {
        MonthlyCostInputField()
    }
}

@Composable
private fun YenText() {
    Text(
        text = "円"
    )
}

@Preview(showBackground = true)
@Composable
private fun YenTextPreview() {
    LessonsCalendarTheme {
        YenText()
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