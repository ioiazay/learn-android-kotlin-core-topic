package com.ioia.learn_android_kotlin_core_topic.animation_transition

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.animation_drawer_act.*

class AnimationDrawerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_drawer_act)
    }

    override fun onStart() {
        super.onStart()
        initAnimationDrawable()
    }

    private fun initAnimationDrawable(){
        var arrowAnimation: AnimationDrawable

        iv_default.apply {
            setBackgroundResource(R.drawable.arrow_animation_list)
            arrowAnimation = background as AnimationDrawable
        }

        arrowAnimation.start()
    }
}
