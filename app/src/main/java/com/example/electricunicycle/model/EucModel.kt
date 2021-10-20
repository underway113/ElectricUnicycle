package com.example.electricunicycle.model

import androidx.annotation.DrawableRes

data class EucModel(
        val name: String,
        @DrawableRes val image: Int,
        val brand: String,
        val price: Int,
        val description: String,
        val installmentOption: Boolean,
        val spec: SpecificiationModel
)