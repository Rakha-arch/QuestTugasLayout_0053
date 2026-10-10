package com.example.day3praktugas // Sesuaikan dengan package project Anda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.day3praktugas.ui.theme.Day3praktugasTheme // Sesuaikan dengan nama theme Anda

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Day3praktugasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Memanggil fungsi utama tampilan kartu profil Anda
                    ActivitasPertama(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}