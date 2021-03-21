package com.ioia.learn_android_kotlin_core_topic.ui.menu.sub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.contoh_menu_konteks_act.*

class ContohMenuKonteksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contoh_menu_konteks_act)

        initAction()
    }

    fun initAction(){
        registerForContextMenu(btn_show_context_menu)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.contoh_menu_konteks, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item_satu -> {
                Toast.makeText(this, "Item Satu", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item_dua -> {
                Toast.makeText(this, "Item Dua", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item_tiga -> {
                Toast.makeText(this, "Item Tiga", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onContextItemSelected(item)
        }
    }
}
