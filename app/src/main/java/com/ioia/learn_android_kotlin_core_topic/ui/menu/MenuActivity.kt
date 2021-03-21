package com.ioia.learn_android_kotlin_core_topic.ui.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.R
import com.ioia.learn_android_kotlin_core_topic.ui.menu.sub.ContohMenuActivity
import com.ioia.learn_android_kotlin_core_topic.ui.menu.sub.ContohMenuKonteksActivity
import com.ioia.learn_android_kotlin_core_topic.ui.menu.sub.GroupMenuActivity
import com.ioia.learn_android_kotlin_core_topic.ui.menu.sub.PopupMenuActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        initLevel()
    }

    private fun initLevel(){
        val components = mutableMapOf(
            "Contoh Menu" to ContohMenuActivity::class.java,
            "Contoh Menu Konteks" to ContohMenuKonteksActivity::class.java,
            "Contoh Popup Menu" to PopupMenuActivity::class.java,
            "Contoh Group Menu" to GroupMenuActivity::class.java
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
