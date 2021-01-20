package br.com.luanadev.databinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import br.com.luanadev.databinding.R
import br.com.luanadev.databinding.databinding.PlainActivityBinding

class PlainActivity : AppCompatActivity() {
    private val viewModdel by lazy { ViewModelProvider(this).get(PlainViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: PlainActivityBinding = DataBindingUtil.setContentView(this, R.layout.plain_activity)
        binding.viewmodel = viewModdel
        binding.lifecycleOwner = this
    }
}