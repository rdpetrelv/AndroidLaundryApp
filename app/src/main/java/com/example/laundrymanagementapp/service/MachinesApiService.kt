package com.example.laundrymanagementapp.service

import retrofit2.Call
import retrofit2.http.GET

interface MachinesApiService {
    @GET("rooms")
    fun findAll(): Call<List<MachinesDto>>
}