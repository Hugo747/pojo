package com.proyectoc.pollofracmentopi.api;


import com.proyectoc.pollofracmentopi.model.RespuestaApi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {


@GET("api.php?amount=1&category=18&difficulty=medium&type=boolean")
Call<RespuestaApi> getQuestion();

}
