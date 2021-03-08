package com.ioia.learn_android_kotlin_core_topic.ui.tata_letak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.R
import com.ioia.learn_android_kotlin_core_topic.ui.tata_letak.sub.ConstraintLayoutActivity
import com.ioia.learn_android_kotlin_core_topic.ui.tata_letak.sub.MotionLayoutActivity
import com.ioia.learn_android_kotlin_core_topic.ui.tata_letak.sub.RecyclerViewActivity
import kotlinx.android.synthetic.main.tata_letak_act.*

class TataLetakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tata_letak_act)

        initLevel()
    }

    private fun initLevel(){
        val components = mutableMapOf(
            "Constraint Layout" to ConstraintLayoutActivity::class.java,
            "Motion Layout" to MotionLayoutActivity::class.java,
            "Recycler View" to RecyclerViewActivity::class.java
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
