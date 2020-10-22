package com.ioia.learn_android_kotlin_core_topic.animation_transition

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.show_hide_view_animation_act.*

class ShowHideViewAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_hide_view_animation_act)

        initCrossfadeAnimation()
    }

    private fun initCrossfadeAnimation(){
        val contentView = content
        val loadingView = loading_spinner
        val shortAnimationDuration = 2000

        contentView.visibility = View.GONE

        contentView.apply {
            alpha = 0F
            visibility = View.VISIBLE

            animate()
                .alpha(1F)
                .setDuration(shortAnimationDuration.toLong())
                .setListener(null)
        }

        loadingView.apply {
            animate()
                .alpha(0F)
                .setDuration(shortAnimationDuration.toLong())
                .setListener(object : Animator.AnimatorListener{
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        loadingView.visibility = View.GONE
                    }
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationStart(animation: Animator?) {}
                })
        }
    }
}
