package com.ioia.learn_android_kotlin_core_topic

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_core_topic.activity.ActivityActivity
import com.ioia.learn_android_kotlin_core_topic.animation_transition.AnimationTransitionActivity
import com.ioia.learn_android_kotlin_core_topic.app_action.AppActionActivity
import com.ioia.learn_android_kotlin_core_topic.app_bundles.AppBundlesActivity
import com.ioia.learn_android_kotlin_core_topic.architecture.ArchitectureActivity
import com.ioia.learn_android_kotlin_core_topic.audio_video.AudioVideoActivity
import com.ioia.learn_android_kotlin_core_topic.background_task.BackgroundTaskActivity
import com.ioia.learn_android_kotlin_core_topic.camera.CameraActivity
import com.ioia.learn_android_kotlin_core_topic.camerax.CameraXActivity
import com.ioia.learn_android_kotlin_core_topic.codelab.CodelabActivity
import com.ioia.learn_android_kotlin_core_topic.connectivity.ConnectivityActivity
import com.ioia.learn_android_kotlin_core_topic.data_and_file.DataAndFileActivity
import com.ioia.learn_android_kotlin_core_topic.google_play.GooglePlayActivity
import com.ioia.learn_android_kotlin_core_topic.image_graphics.ImageGraphicsActivity
import com.ioia.learn_android_kotlin_core_topic.intent.IntentActivity
import com.ioia.learn_android_kotlin_core_topic.navigation.NavigationActivity
import com.ioia.learn_android_kotlin_core_topic.renderscripts.RenderscriptsActivity
import com.ioia.learn_android_kotlin_core_topic.sensors.SensorsActivity
import com.ioia.learn_android_kotlin_core_topic.slices.SlicesActivity
import com.ioia.learn_android_kotlin_core_topic.touch_input.TouchInputActivity
import com.ioia.learn_android_kotlin_core_topic.ui.UIActivity
import com.ioia.learn_android_kotlin_core_topic.user_location.UserLocationActivity
import com.ioia.learn_android_kotlin_core_topic.web_based.WebBasedActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initLevel()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun initLevel(){
        val components = mutableMapOf(
                "Activity" to ActivityActivity::class.java,
                "Component Architecture" to ArchitectureActivity::class.java,
                "Component Navigation" to NavigationActivity::class.java,
                "Intent and Intent Filter" to IntentActivity::class.java,
                "UI" to UIActivity::class.java,
                "Animation & Transition" to AnimationTransitionActivity::class.java,
                "Image & Graphics" to ImageGraphicsActivity::class.java,
                "Audio & Video" to AudioVideoActivity::class.java,
                "Background Task" to BackgroundTaskActivity::class.java,
                "Data & Files" to DataAndFileActivity::class.java,
                "User Data & Identity" to DataAndFileActivity::class.java,
                "User Location" to UserLocationActivity::class.java,
                "Touch & Input" to TouchInputActivity::class.java,
                "CameraX" to CameraXActivity::class.java,
                "Camera" to CameraActivity::class.java,
                "Sensors" to SensorsActivity::class.java,
                "Connectivity" to ConnectivityActivity::class.java,
                "Renderscripts" to RenderscriptsActivity::class.java,
                "Web-based Content" to WebBasedActivity::class.java,
                "Android App Bundles" to AppBundlesActivity::class.java,
                "Google Play" to GooglePlayActivity::class.java,
                "App Actions" to AppActionActivity::class.java,
                "Slice" to SlicesActivity::class.java,
                "Codelab" to CodelabActivity::class.java
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
