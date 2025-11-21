package com.example.camara.ui

import android.app.Application
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.camara.viewmodel.MediaViewModel
import com.example.camara.viewmodel.MediaViewModelFactory
import com.example.camara.viewmodel.PlaybackViewModel
import com.example.camara.viewmodel.PlaybackViewModelFactory
import android.net.Uri
import com.example.camara.ui.screens.AudioListScreen
import com.example.camara.ui.screens.ImageListScreen
import com.example.camara.ui.screens.RecordingScreen
import com.example.camara.ui.screens.VideoListScreen
import com.example.camara.ui.screens.VideoPlayerScreen

// --- 12. Navegación ---
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val context = LocalContext.current
    val application = context.applicationContext as Application

    // Factories para los ViewModels
    val mediaViewModel: MediaViewModel = viewModel(
        factory = MediaViewModelFactory(application)
    )
    val playbackViewModel: PlaybackViewModel = viewModel(
        factory = PlaybackViewModelFactory(application)
    )

    Scaffold(
        bottomBar = {
            AppBottomNavBar(navController = navController)
        }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Recording.route,
            modifier = Modifier.padding(padding)
        ) {
            composable(Screen.Recording.route) {
                RecordingScreen(mediaViewModel = mediaViewModel, audioRecorder = com.example.camara.data.AudioRecorder(context))
            }
            composable(Screen.AudioList.route) {
                AudioListScreen(
                    mediaViewModel = mediaViewModel,
                    playbackViewModel = playbackViewModel
                )
            }
            composable(Screen.ImageList.route) {
                ImageListScreen(mediaViewModel = mediaViewModel)
            }
            composable(Screen.VideoList.route) {
                VideoListScreen(
                    mediaViewModel = mediaViewModel,
                    navController = navController
                )
            }
            composable(
                route = Screen.VideoPlayer.route,
                arguments = listOf(navArgument("uri") { type = NavType.StringType })
            ) { backStackEntry ->
                val uri = backStackEntry.arguments?.getString("uri")
                if (uri != null) {
                    VideoPlayerScreen(
                        uri = Uri.decode(uri),
                        playbackViewModel = playbackViewModel
                    )
                }
            }
        }
    }
}
