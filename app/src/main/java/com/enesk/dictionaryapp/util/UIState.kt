package com.enesk.dictionaryapp.util

sealed class UIState {
    data class ShowSnackbar(val message: String) : UIState()
}
