package com.example.lessonscalendar

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContentProviderCompat
import com.example.lessonscalendar.ui.theme.LessonsCalendarTheme

class SettinFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(ContentProviderCompat.requireContext()).apply {
            setContent {
                SettingScreen()
            }
        }
        return composeView
    }
}

@Composable
fun SettingScreen() {
    Text(
        text = "習い事の設定用画面"
    )
}

@Preview(showBackground = true)
@Composable
fun SettingScreenPreview() {
    LessonsCalendarTheme {
        SettingScreen()
    }
}