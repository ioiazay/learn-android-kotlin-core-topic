package com.ioia.learn_android_kotlin_core_topic.animation_transition

import android.animation.Animator
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.show_hide_view_reveal_animation_act.*
import kotlin.math.hypot

class ShowHideViewRevealAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_hide_view_reveal_animation_act)

        initListener()
    }

    private fun initListener(){
        btn_show.setOnClickListener {
            initShowRevealAnimation()
        }

        btn_Hide.setOnClickListener {
            initHideRevealAnimation()
        }
    }

    private fun initShowRevealAnimation(){
        val view = ll_main

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            val cx = view.width/2
            val cy = view.height/2

            val finalRadius = hypot(cx.toDouble(), cy.toDouble()).toFloat()

            val anim = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0F, finalRadius)
            view.visibility = View.VISIBLE
            anim.start()
        }else{
            view.visibility = View.INVISIBLE
        }
    }

    private fun initHideRevealAnimation(){
        val view = ll_main

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            val cx = view.width/2
            val cy = view.height/2

            val finalRadius = hypot(cx.toDouble(), cy.toDouble()).toFloat()

            val anim = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0F, finalRadius)
            anim.addListener(object : Animator.AnimatorListener{
                override fun onAnimationRepeat(animation: Animator?) {}
                override fun onAnimationEnd(animation: Animator?) {
                    view.visibility = View.INVISIBLE
                }
                override fun onAnimationCancel(animation: Animator?) {}
                override fun onAnimationStart(animation: Animator?) {}
            })
            anim.start()
        }else{
            view.visibility = View.VISIBLE
        }
    }
}
