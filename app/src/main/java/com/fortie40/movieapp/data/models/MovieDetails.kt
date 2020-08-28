package com.fortie40.movieapp.data.models

import com.google.gson.annotations.SerializedName

data class MovieDetails(
    val title: String,
    val runtime: Int,

    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String
)