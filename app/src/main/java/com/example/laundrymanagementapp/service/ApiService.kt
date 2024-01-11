package com.example.laundrymanagementapp.service

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiService {
    object ApiServices {
        const val API_USERNAME = "user"
        const val API_PASSWORD = "password"
        val machinesApiService : MachinesApiService by lazy {
            Retrofit.Builder()
                .addConverterFactory(MoshiConverterFactory.create()) // (1)
                .baseUrl("http://automacorp-client-for-android.cleverapps.io/api/") // (2)
                .build()
                .create(MachinesApiService::class.java)
        }
    }
}