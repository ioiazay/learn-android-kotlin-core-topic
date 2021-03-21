package com.ioia.learn_android_kotlin_core_topic.ui.panel_aplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuItemCompat
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.panel_aplikasi_act.*

class PanelAplikasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.panel_aplikasi_act)

        initToolbar()
    }

    private fun initToolbar(){
        setSupportActionBar(toolbar_panel)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.panel_aplikasi_menu, menu)

        val itemBiasa = menu?.findItem(R.id.item_panel_biasa)
        val searchView = MenuItemCompat.getActionView(menu?.findItem(R.id.item_panel_search)) as SearchView
        val itemPanelLayout = menu?.findItem(R.id.item_panel_layout)

        val textPanel = itemPanelLayout?.actionView?.findViewById<TextView>(R.id.tv_panel)
        val imagePanel = itemPanelLayout?.actionView?.findViewById<ImageView>(R.id.iv_panel)

        textPanel?.text = "hai"
        imagePanel?.setOnClickListener {
            Toast.makeText(baseContext, "Yooo", Toast.LENGTH_SHORT).show()
        }

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.item_panel_biasa -> {
                Toast.makeText(baseContext, "Item Biasa", Toast.LENGTH_SHORT).show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

}
