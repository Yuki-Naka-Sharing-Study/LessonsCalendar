package com.example.lessonscalendar

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import com.example.lessonscalendar.ui.theme.LessonsCalendarTheme

class ConfirmFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext()).apply {
            setContent {
                ConfirmScreen()
            }
        }
        return composeView
    }
}

@Composable
private fun ConfirmScreen() {
    Text(
        text = "習い事の記録確認用画面"
    )
}

@Preview(showBackground = true)
@Composable
private fun ConfirmScreenPreview() {
    LessonsCalendarTheme {
        ConfirmScreen()
    }
}

@Composable
private fun WhatToLearnText() {
    Text(
        text = "開始し始めた習い事"
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
private fun WhatToLearnUserEnteredText() {
    Text(
        text = "ピアノ"
    )
}

@Preview(showBackground = true)
@Composable
private fun WhatToLearnUserEnteredTextPreview() {
    LessonsCalendarTheme {
        WhatToLearnUserEnteredText()
    }
}

@Composable
private fun SinceStartText() {
    Text(
        text = "習い事を開始し始めてから"
    )
}

@Preview(showBackground = true)
@Composable
private fun SinceStartTextPreview() {
    LessonsCalendarTheme {
        SinceStartText()
    }
}