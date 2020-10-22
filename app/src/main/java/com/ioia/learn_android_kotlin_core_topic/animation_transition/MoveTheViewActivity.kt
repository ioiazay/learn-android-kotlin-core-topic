package com.ioia.learn_android_kotlin_core_topic.animation_transition

import android.animation.ObjectAnimator
import android.graphics.Path
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.PathInterpolator
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.move_the_view_act.*

class MoveTheViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.move_the_view_act)

        initMoveTheArrow()
//        initMoveThArrowWithPath()  ERROR, FIX SOON
    }

    private fun initMoveTheArrow(){
        ObjectAnimator.ofFloat(iv_arrow_forward, View.TRANSLATION_X, 100F).apply {
            duration = 2000
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
            start()
        }
    }

    private fun initMoveThArrowWithPath(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val path = Path().apply {
                arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true)
            }

            val pathInterpolator = PathInterpolator(path)

            ObjectAnimator.ofFloat(iv_arrow_forward_path, "translationX", 100f).apply {
                interpolator = pathInterpolator
                repeatCount = ObjectAnimator.INFINITE
                start()
            }
        }
    }

}
