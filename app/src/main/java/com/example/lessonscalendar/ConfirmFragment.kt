package com.example.lessonscalendar

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
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
fun ConfirmScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_16
                )
            )
        )

        WhatToLearnText()
        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_8
                )
            )
        )
        WhatToLearnUserEnteredText()

        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_32
                )
            )
        )
        SinceStartText()
        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_8
                )
            )
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            DayNumberText()
            DayText()
        }

        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_32
                )
            )
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            WeekNumberText()
            WeekText()
        }

        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_32
                )
            )
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            MonthNumberText()
            MonthText()
        }

        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_32
                )
            )
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            YearNumberText()
            YearText()
        }

        Spacer(
            modifier = Modifier.height(
                dimensionResource(
                    id = R.dimen.space_32
                )
            )
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
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
        text = stringResource(id = R.string.what_to_learn)
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
        text = stringResource(id = R.string.what_to_learn_user_entered)
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
        text = stringResource(id = R.string.since_start)
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
        text = stringResource(id = R.string.day_number)
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
        text = stringResource(id = R.string.day)
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
        text = stringResource(id = R.string.week_number)
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
        text = stringResource(id = R.string.week)
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
        text = stringResource(id = R.string.month_number)
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
        text = stringResource(id = R.string.month)
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
        text = stringResource(id = R.string.year_number)
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
        text = stringResource(id = R.string.year)
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
        text = stringResource(id = R.string.yen_number)
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
        text = stringResource(id = R.string.yen)
    )
}

@Preview(showBackground = true)
@Composable
private fun YenTextPreview() {
    LessonsCalendarTheme {
        YenText()
    }
}