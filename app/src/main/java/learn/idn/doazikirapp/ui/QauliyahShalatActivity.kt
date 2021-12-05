package learn.idn.doazikirapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import learn.idn.doazikirapp.R
import learn.idn.doazikirapp.adapter.DzikirDoaAdapter
import learn.idn.doazikirapp.model.DataDzikirDoa
import learn.idn.doazikirapp.model.DzikirDoa

class QauliyahShalatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyah = findViewById<RecyclerView>(R.id.rv_qauliyah_shalat)
        rvQauliyah.layoutManager = LinearLayoutManager(this)

        rvQauliyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}