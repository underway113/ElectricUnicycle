package com.example.electricunicycle.model

data class SpecificiationModel (
        val batteryCapacity: Int,
        val batteryVolt: Int,
        val maxRange: Int,
        val topSpeed: Int,
        val motorPower: Int,
        val speaker: Boolean,
        val buildInHandle: Boolean,
        val light: Boolean
)