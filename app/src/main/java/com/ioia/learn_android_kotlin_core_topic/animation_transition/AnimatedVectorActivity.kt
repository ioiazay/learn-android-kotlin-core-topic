package com.ioia.learn_android_kotlin_core_topic.animation_transition

import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.animated_vector_act.*

class AnimatedVectorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animated_vector_act)
    }

    override fun onStart() {
        super.onStart()
        initAnimatedVector()
    }

    private fun initAnimatedVector(){
        val animatedVector = AnimatedVectorDrawableCompat.create(this, R.drawable.animated_vector_drawable)!!
        var animatable: Animatable

        iv_vector_animated.apply {
            setImageDrawable(animatedVector)
            animatable = drawable as Animatable
        }

        animatable.start()
        iv_vector_animated.setOnClickListener {
            animatable.start()
        }
    }
}
