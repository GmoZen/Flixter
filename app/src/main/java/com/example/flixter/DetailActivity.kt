package com.example.flixter

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var languageTextView: TextView
    private lateinit var releaseTextView: TextView
    private lateinit var ratingTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.movie_image)
        titleTextView = findViewById(R.id.movie_title)
        languageTextView = findViewById(R.id.original_language)
        releaseTextView = findViewById(R.id.release_date)
        ratingTextView = findViewById(R.id.vote_average)

        // TODO: Get the extra from the Intent
        val movie = intent.getSerializableExtra("MOVIE_EXTRA") as Movie

        // set view texts based on movie data
        titleTextView.text = movie.title
        languageTextView.text = movie.original_language
        releaseTextView.text = movie.release_date
        ratingTextView.text = movie.vote_average.toString()

    }
}