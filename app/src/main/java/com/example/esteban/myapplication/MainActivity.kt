package com.example.esteban.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var x =25 // en vez de una variable, es un array de url's

        //se recorre el array con un ciclo
        while (x > 0) {

            var newView: ImageView //crea una instancia de imageview en tiempo de ejecucion
            newView = ImageView(this)//La configura en el contexto, en este caso sería car_Details.kt
            layout_scroll.addView(newView)//layout_scroll es el LInear layour que hay dentro del scroll, dentro van a ir todos los imagesviews. Añada la instancia de imageview creada
            //ACÁ PONER EL TAMAÑO DE LA IMAGEN
            newView.layoutParams.height = 200
            newView.layoutParams.width = 200
            //Acá se le setea el url al imageview con Picasso, por facilicidad simplemente le estoy poniendo una imagen cualquiera
            //Picasso.get().load(i-ésimo url del array).into(newView)
            newView.setImageResource(R.drawable.abc_ic_search_api_material)
            x--
        }

    }
}
