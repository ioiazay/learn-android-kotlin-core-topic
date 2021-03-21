package com.ioia.learn_android_kotlin_core_topic.ui.penelusuran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.R
import com.ioia.learn_android_kotlin_core_topic.ui.penelusuran.sub.Penelusuran1Activity
import com.ioia.learn_android_kotlin_core_topic.ui.penelusuran.sub.Penelusuran2Activity
import kotlinx.android.synthetic.main.penelusuran_act.*

class PenelusuranActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.penelusuran_act)

        initLevel()
    }

    private fun initLevel(){
        val components = mutableMapOf(
            "Penelusuran 1" to Penelusuran1Activity::class.java,
            "Penelusuran 2" to Penelusuran2Activity::class.java
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
