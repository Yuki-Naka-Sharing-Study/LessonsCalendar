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
import androidx.core.content.ContentProviderCompat.requireContext
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
    Text(
        text = "習い事の記録確認用画面"
    )
}

@Preview(showBackground = true)
@Composable
fun ConfirmScreenPreview() {
    LessonsCalendarTheme {
        ConfirmScreen()
    }
}