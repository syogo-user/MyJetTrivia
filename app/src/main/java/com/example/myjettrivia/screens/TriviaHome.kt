package com.example.myjettrivia.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.myjettrivia.component.Questions

@Composable
fun TriviaHome(viewModel: QuestionViewModel = hiltViewModel()) {
    Questions(viewModel = viewModel)
}