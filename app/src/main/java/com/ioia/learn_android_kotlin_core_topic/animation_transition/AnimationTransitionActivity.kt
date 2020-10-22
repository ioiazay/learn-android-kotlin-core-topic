package com.ioia.learn_android_kotlin_core_topic.animation_transition

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.animation_transition_act.*

class AnimationTransitionActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_transition_act)

        initLevel()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun initLevel(){
        val components = mutableMapOf(
            "Animation Drawable" to AnimationDrawerActivity::class.java,
            "Animated Vector" to AnimatedVectorActivity::class.java,
            "Show and Hide View Crossfade Animation" to ShowHideViewAnimationActivity::class.java,
            "Show and Hide View Card Flip Animation (Soon)" to ShowHideViewCardFlipAnimationActivity::class.java,
            "Show and Hide View Reveal Animation" to ShowHideViewRevealAnimationActivity::class.java,
            "Move The View Animation" to MoveTheViewActivity::class.java,
            "Fling Animation (Soon)" to FlingAnimationActivity::class.java,
            "Zoom Animation" to ZoomAnimationActivity::class.java,
            "To be continue...." to ZoomAnimationActivity::class.java
        )

        components.forEach {
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            val button = MaterialButton(this, null, R.attr.materialButtonStyle)

            params.setMargins(16, 16, 16, 16)
            button.layoutParams = params
            button.text = it.key

            button.setOnClickListener {_ ->
                if(it.key == "To be continue...."){
                    Toast.makeText(this, "To be continue....", Toast.LENGTH_SHORT).show()
                }else{
                    startActivity(Intent(this, it.value))
                }
            }

            ll_main.addView(button)
        }
    }
}

