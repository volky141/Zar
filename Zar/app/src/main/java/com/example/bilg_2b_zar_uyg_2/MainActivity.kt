package com.example.bilg_2b_zar_uyg_2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val zarResimleri = listOf(
        R.drawable.zar_1,
        R.drawable.zar_2,
        R.drawable.zar_3,
        R.drawable.zar_4,
        R.drawable.zar_5,
        R.drawable.zar_6
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun zar_at(view: View)
    {
        var sayi1 = Random.nextInt(1,7)
        var sayi2 = Random.nextInt(1,7)

        findViewById<ImageView>(R.id.imageView).setImageResource(zarResimleri[sayi1-1])
        findViewById<ImageView>(R.id.imageView2).setImageResource(zarResimleri[sayi2-1])

    }
}