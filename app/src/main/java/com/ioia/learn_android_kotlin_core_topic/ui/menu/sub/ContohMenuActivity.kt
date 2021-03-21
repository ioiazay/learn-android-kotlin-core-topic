package com.ioia.learn_android_kotlin_core_topic.ui.menu.sub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.ioia.learn_android_kotlin_core_topic.R
import kotlinx.android.synthetic.main.contoh_menu_act.*

class ContohMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contoh_menu_act)

        initToolbar()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.contoh_menu, menu)

        val item1 = menu?.findItem(R.id.item_add_alert)

        return true
    }

    private fun initToolbar(){
        setSupportActionBar(toolbar_contoh_menu)
        supportActionBar?.title = "Contoh Menu"
        toolbar_contoh_menu.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.item_add_alert -> {
                Toast.makeText(this, "Add Alert", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item_add_location -> {
                Toast.makeText(this, "Add Location", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
