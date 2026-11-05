package com.example.navigasidata.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasidata.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update // Pastikan import ini ditambahkan

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())

    // Perbaikan 1: Gunakan _statusUI
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()
}