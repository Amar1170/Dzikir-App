package learn.idn.doazikirapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import learn.idn.doazikirapp.R
import learn.idn.doazikirapp.adapter.DzikirDoaAdapter
import learn.idn.doazikirapp.model.DataDzikirDoa
import learn.idn.doazikirapp.model.DzikirDoa

class SetiapSaatDzikirActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_setiap_saat_dzikir)

        val rvSetiapSaatDzikir = findViewById<RecyclerView>(R.id.rv_dzikir_setiap_saat)
        rvSetiapSaatDzikir.layoutManager = LinearLayoutManager(this)
        rvSetiapSaatDzikir.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}