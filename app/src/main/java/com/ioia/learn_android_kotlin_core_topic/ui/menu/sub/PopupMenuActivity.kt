package com.ioia.learn_android_kotlin_core_topic.ui.menu.sub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.popup_menu_act.*

class PopupMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popup_menu_act)

        initAction()
    }

    private fun initAction(){
        btn_show_popup_menu.setOnClickListener {
            val popup = PopupMenu(this, it)
            val inflater = popup.menuInflater
            inflater.inflate(R.menu.contoh_popup_menu, popup.menu)
            popup.show()

            popup.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.item_popup_satu -> {
                        Toast.makeText(this, "Popup Satu", Toast.LENGTH_SHORT).show()
                    }

                    R.id.item_popup_dua -> {
                        Toast.makeText(this, "Popup Dua", Toast.LENGTH_SHORT).show()
                    }

                    R.id.item_popup_tiga -> {
                        Toast.makeText(this, "Popup Tiga", Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }
        }
    }

}
