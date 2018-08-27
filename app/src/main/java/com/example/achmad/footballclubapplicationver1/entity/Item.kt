package com.example.achmad.footballclubapplicationver1.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (val name: String, val image: Int, val description: String) : Parcelable