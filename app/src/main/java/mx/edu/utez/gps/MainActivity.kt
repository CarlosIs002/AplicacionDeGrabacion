package mx.edu.utez.gps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mx.edu.utez.gps.ui.theme.GPSTheme
import mx.edu.utez.gps.ui.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GPSTheme {
                AppNavigation()
            }
        }
    }
}

//Nuevas modifcaciones y la aplicacion completa

