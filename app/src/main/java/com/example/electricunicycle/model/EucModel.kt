package com.example.electricunicycle.model

import androidx.annotation.DrawableRes
import java.io.Serializable

data class EucModel (
        val name: String,
        @DrawableRes val image: Int,
        val brand: String,
        val price: Int,
        val type: EucTypeEnum,
        val description: String,
        val installmentOption: Boolean,
        val spec: SpecificiationModel
): Serializable