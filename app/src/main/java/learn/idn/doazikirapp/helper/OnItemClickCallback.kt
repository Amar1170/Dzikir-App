package learn.idn.doazikirapp.helper

import learn.idn.doazikirapp.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}