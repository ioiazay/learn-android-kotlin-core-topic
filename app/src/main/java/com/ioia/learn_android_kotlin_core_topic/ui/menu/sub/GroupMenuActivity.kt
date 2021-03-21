package com.ioia.learn_android_kotlin_core_topic.ui.menu.sub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.group_menu_act.*

class GroupMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.group_menu_act)

        initAction()
    }

    private fun initAction(){
        registerForContextMenu(btn_show_group_menu)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
//        val inflater =
    }


}
