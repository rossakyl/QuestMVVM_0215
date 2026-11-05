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

    fun setSiswa(ls: MutableList<String>) {
        // Perbaikan 2: Panggil update dari _statusUI
        _statusUI.update { statusSaatIni ->
            // Perbaikan 3: Perbaiki typo 1 s [2] menjadi ls[2]
            statusSaatIni.copy(nama = ls[0], gender = ls[1], alamat = ls[2])
        }
    }
}