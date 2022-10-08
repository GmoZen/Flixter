package com.example.flixter
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


/**
 * The Model for storing a single movie from the moviedb API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */

@Keep
@Serializable
data class Movie(
    @SerializedName("title")
    var title: String? = null,

    @SerializedName("overview")
    var description : String? = null,

    @SerializedName("poster_path")
    var movieImageUrl : String? = null,

    @SerializedName("original_language")
    var original_language: String? = null,


    @SerializedName("release_date")
    var release_date: String? = null,

    @SerializedName("vote_average")
    var vote_average: Double? = null
)  : java.io.Serializable

//
//class Movie {
//
//    @JvmField
//    @SerializedName("title")
//    var title: String? = null
//
//    //TODO MovieImageUrl
//    @SerializedName("poster_path")
//    var movieImageUrl: String? = null
//
//    //TODO description
//    @SerializedName("overview")
//    var overview: String? = null
//
//    // Additional info for intent
//
//    @SerializedName("original_language")
//    var original_language: String? = null
//
//
//    @SerializedName("release_date")
//    var release_date: String? = null
//
//    @SerializedName("vote_average")
//    var vote_average: Double? = null
//}


