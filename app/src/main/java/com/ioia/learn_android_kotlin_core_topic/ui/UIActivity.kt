package com.ioia.learn_android_kotlin_core_topic.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.R
import com.ioia.learn_android_kotlin_core_topic.ui.menu.MenuActivity
import com.ioia.learn_android_kotlin_core_topic.ui.panel_aplikasi.PanelAplikasiActivity
import com.ioia.learn_android_kotlin_core_topic.ui.penelusuran.PenelusuranActivity
import com.ioia.learn_android_kotlin_core_topic.ui.tampilan_dan_nuansa.TampilanNuansaActivity
import com.ioia.learn_android_kotlin_core_topic.ui.tata_letak.TataLetakActivity
import kotlinx.android.synthetic.main.ui_act.*

class UIActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ui_act)

        initLevel()
    }

    private fun initLevel(){
        val components = mutableMapOf(
            "Tata Letak" to TataLetakActivity::class.java,
            "Tampilan dan Nuansa" to TampilanNuansaActivity::class.java,
            "Panel Aplikasi" to PanelAplikasiActivity::class.java,
            "Menu" to MenuActivity::class.java,
            "Penelusuran" to PenelusuranActivity::class.java
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
