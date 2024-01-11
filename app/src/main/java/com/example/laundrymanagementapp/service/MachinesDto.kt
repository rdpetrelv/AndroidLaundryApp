package com.example.laundrymanagementapp.service

data class MachinesDto(
    val id: Long,
    val name: String,
    val currentTemperature: Double?,
    val targetTemperature: Double?,
)
