package org.ligi.survivalmanual

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

class PreferenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_prefs)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

   override fun onOptionsItemSelected(item: MenuItem) = when ( item.itemId) {
        android.R.id.home -> {
            finish()
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

}
