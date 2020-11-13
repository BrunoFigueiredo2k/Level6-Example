package com.example.level6_example.interfaces

import com.example.level6_example.data.Trivia
import retrofit2.http.GET

interface TriviaApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia
}