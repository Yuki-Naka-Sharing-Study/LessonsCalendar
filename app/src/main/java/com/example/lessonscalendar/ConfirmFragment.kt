package com.example.lessonscalendar

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
fun ConfirmScreen() {
    Row {
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            WhatToLearnText()
            WhatToLearnUserEnteredText()
            SinceStartText()
            DayNumberText()
            DayText()
            WeekNumberText()
            WeekText()
            MonthNumberText()
            MonthText()
            YearNumberText()
            YearText()
            YenNumberText()
            YenText()
        }
    }
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

@Composable
private fun DayNumberText() {
    Text(
        text = "1"
    )
}

@Preview(showBackground = true)
@Composable
private fun DayNumberTextPreview() {
    LessonsCalendarTheme {
        DayNumberText()
    }
}

@Composable
private fun DayText() {
    Text(
        text = "日経過"
    )
}

@Preview(showBackground = true)
@Composable
private fun DayTextPreview() {
    LessonsCalendarTheme {
        DayText()
    }
}

@Composable
private fun WeekNumberText() {
    Text(
        text = "2"
    )
}

@Preview(showBackground = true)
@Composable
private fun WeekNumberTextPreview() {
    LessonsCalendarTheme {
        WeekNumberText()
    }
}

@Composable
private fun WeekText() {
    Text(
        text = "週間経過"
    )
}

@Preview(showBackground = true)
@Composable
private fun WeekTextPreview() {
    LessonsCalendarTheme {
        WeekText()
    }
}

@Composable
private fun MonthNumberText() {
    Text(
        text = "3"
    )
}

@Preview(showBackground = true)
@Composable
private fun MonthNumberTextPreview() {
    LessonsCalendarTheme {
        MonthNumberText()
    }
}

@Composable
private fun MonthText() {
    Text(
        text = "ヶ月経過"
    )
}

@Preview(showBackground = true)
@Composable
private fun MonthTextPreview() {
    LessonsCalendarTheme {
        MonthText()
    }
}

@Composable
private fun YearNumberText() {
    Text(
        text = "4"
    )
}

@Preview(showBackground = true)
@Composable
private fun YearNumberTextPreview() {
    LessonsCalendarTheme {
        YearNumberText()
    }
}

@Composable
private fun YearText() {
    Text(
        text = "年経過"
    )
}

@Preview(showBackground = true)
@Composable
private fun YearTextPreview() {
    LessonsCalendarTheme {
        YearText()
    }
}

@Composable
private fun YenNumberText() {
    Text(
        text = "10,0000"
    )
}

@Preview(showBackground = true)
@Composable
private fun YenNumberTextPreview() {
    LessonsCalendarTheme {
        YenNumberText()
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