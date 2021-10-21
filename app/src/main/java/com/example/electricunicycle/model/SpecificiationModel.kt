package com.example.electricunicycle.model

import java.io.Serializable

data class SpecificiationModel (
        val batteryCapacity: Int,
        val maxRange: Int,
        val topSpeed: Int,
        val motorPower: Int,
        val url: String
): Serializable