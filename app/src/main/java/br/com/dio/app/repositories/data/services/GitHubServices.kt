package br.com.dio.app.repositories.data.services

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}