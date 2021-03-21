package com.ioia.learn_android_kotlin_core_topic.ui.penelusuran.sub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuItemCompat
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.constraint_layout_act.view.*
import kotlinx.android.synthetic.main.penelusuran1_act.*

class Penelusuran1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.penelusuran1_act)

        initToolbar()
    }

    private fun initToolbar(){
        setSupportActionBar(toolbar_penelusuran_1)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.penelusuran_menu_1, menu)

        val searchViewItem = menu?.findItem(R.id.item_penelusuran)
        val searchView = MenuItemCompat.getActionView(searchViewItem) as SearchView

        searchView.queryHint = "Bola Basket"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(baseContext, query, Toast.LENGTH_SHORT).show()

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                Toast.makeText(baseContext, newText, Toast.LENGTH_SHORT).show()

                return false
            }

        })

        return true
    }
}
