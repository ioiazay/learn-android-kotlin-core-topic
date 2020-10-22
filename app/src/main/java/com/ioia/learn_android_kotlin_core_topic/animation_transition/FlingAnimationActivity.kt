package com.ioia.learn_android_kotlin_core_topic.animation_transition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.dynamicanimation.animation.FlingAnimation
import com.ioia.learn_android_kotlin_core_topic.R

class FlingAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fling_animation_act)
        initFlingAnimation()
    }

    private fun initFlingAnimation(){
    }
}
