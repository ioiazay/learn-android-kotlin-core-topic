package com.ioia.learn_android_kotlin_core_topic.ui.tampilan_dan_nuansa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.R
import com.ioia.learn_android_kotlin_core_topic.ui.tampilan_dan_nuansa.sub.GayaTemaActivity
import com.ioia.learn_android_kotlin_core_topic.ui.tampilan_dan_nuansa.sub.OtherTampilanNuansaActivity
import kotlinx.android.synthetic.main.tampilan_nuansa_act.*

class TampilanNuansaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tampilan_nuansa_act)

        initLevel()
    }

    private fun initLevel(){
        val components = mutableMapOf(
            "Gaya Dan Tema" to GayaTemaActivity::class.java,
            "Other" to OtherTampilanNuansaActivity::class.java
        )

        components.forEach {
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            val button = MaterialButton(this, null, R.attr.materialButtonStyle)

            params.setMargins(16, 16, 16, 16)
            button.layoutParams = params
            button.text = it.key

            button.setOnClickListener {_ ->
                startActivity(Intent(this, it.value))
            }

            ll_main.addView(button)
        }
    }

}
