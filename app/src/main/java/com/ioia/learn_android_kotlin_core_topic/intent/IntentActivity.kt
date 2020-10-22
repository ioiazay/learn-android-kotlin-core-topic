package com.ioia.learn_android_kotlin_core_topic.intent

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.intent_act.*

class IntentActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intent_act)

        initLevel()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun initLevel(){
        val components = mutableMapOf(
            "Basic Intent" to BasicIntentActivity::class.java
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
