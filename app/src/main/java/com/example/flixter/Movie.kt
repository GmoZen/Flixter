package com.example.flixter

import com.google.gson.annotations.SerializedName


/**
 * The Model for storing a single movie from the moviedb API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO MovieImageUrl
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    //TODO description
    @SerializedName("overview")
    var overview: String? = null

}


