package com.example.recyclerviewdearitzperez

import ColorsAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler: RecyclerView =
            findViewById(R.id. recycler)
        recycler.adapter = ColorsAdapter(buildColors())
//        recycler.adapter = ColorsAdapter(
//            listOf(
//                Color("Azul", "#2196F3"),
//                Color("Rojo", "#FF5733"),
//                Color("Naranja", "#FFA500"),
//                Color("Verde", "#4CAF50"),
//                Color("Amarillo", "#FFFF00"),
//                Color("Violeta", "#8A2BE2"),
//                Color("Rosa", "#FFC0CB"),
//                Color("Gris", "#808080"),
//                Color("Marrón", "#8B4513"),
//                Color("Cian", "#00FFFF"),
//                Color("Lavanda", "#E6E6FA"),
//                Color("Aqua", "#00FFFF"),
//                Color("Oro", "#FFD700"),
//                Color("Plata", "#C0C0C0"),
//                Color("Negro", "#000000"),
//                Color("Blanco", "#FFFFFF"),
//                Color("Turquesa", "#40E0D0"),
//                Color("Índigo", "#4B0082"),
//                Color("Magenta", "#FF00FF"),
//                Color("Amaranto", "#E52B50")
//
//
//
//
//            )
//        )

    }

    private fun buildColors (): List<Color> {
        return listOf(
            Color(getString(R.string. red), getColorHex(R.color. red),"https://loremflickr.com/320/240?lock=1" ),
            Color(getString(R.string. indigo), getColorHex(R.color. indigo), "https://loremflickr.com/320/240?lock=2" ),
            Color(getString(R.string. green), getColorHex(R.color. green),"https://loremflickr.com/320/240?lock=3" ),
            Color(getString(R.string. orange), getColorHex(R.color. orange),"https://loremflickr.com/320/240?lock=4" ),
            Color(getString(R.string. blue), getColorHex(R.color. blue),"https://loremflickr.com/320/240?lock=5" ),
            Color(getString(R.string. yellow), getColorHex(R.color. yellow),"https://loremflickr.com/320/240?lock=6" ),
            Color(getString(R.string. bluegrey), getColorHex(R.color. bluegrey),"https://loremflickr.com/320/240?lock=7" ),
            Color(getString(R.string. teal), getColorHex(R.color. teal),"https://loremflickr.com/320/240?lock=8" ),
            Color(getString(R.string. deeppurple), getColorHex(R.color. deeppurple),"https://loremflickr.com/320/240?lock=9" ),
            Color(getString(R.string. cyan), getColorHex(R.color. cyan),"https://loremflickr.com/320/240?lock=10" ),
            Color(getString(R.string. brown), getColorHex(R.color. brown),"https://loremflickr.com/320/240?lock=11" ),
            Color(getString(R.string. red), getColorHex(R.color. red),"https://loremflickr.com/320/240?lock=1" ),
            Color(getString(R.string. indigo), getColorHex(R.color. indigo), "https://loremflickr.com/320/240?lock=2" ),
            Color(getString(R.string. green), getColorHex(R.color. green),"https://loremflickr.com/320/240?lock=3" ),
            Color(getString(R.string. orange), getColorHex(R.color. orange),"https://loremflickr.com/320/240?lock=4" ),
            Color(getString(R.string. blue), getColorHex(R.color. blue),"https://loremflickr.com/320/240?lock=5" ),
            Color(getString(R.string. yellow), getColorHex(R.color. yellow),"https://loremflickr.com/320/240?lock=6" ),
            Color(getString(R.string. bluegrey), getColorHex(R.color. bluegrey),"https://loremflickr.com/320/240?lock=7" ),
            Color(getString(R.string. teal), getColorHex(R.color. teal),"https://loremflickr.com/320/240?lock=8" ),
            Color(getString(R.string. deeppurple), getColorHex(R.color. deeppurple),"https://loremflickr.com/320/240?lock=9" ),
            Color(getString(R.string. cyan), getColorHex(R.color. cyan),"https://loremflickr.com/320/240?lock=10" ),
            Color(getString(R.string. brown), getColorHex(R.color. brown),"https://loremflickr.com/320/240?lock=11" )
        )
    }
    private fun getColorHex (colorResId: Int): String {
        return String.format("#%06X", 0xFFFFFF and ContextCompat.getColor( this, colorResId))
    }
}