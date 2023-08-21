package com.assessment.nycschools.data.service

import com.assessment.nycschools.data.model.School
import com.assessment.nycschools.data.model.SchoolDetail
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/*Web Service*/
interface WebService {
    @GET("s3k6-pzi2.json")
    suspend fun getSchools(): Response<List<School>>

    @GET("f9bf-2cp4.json")
    suspend fun getSchoolDetail(@Query(value = "dbn") dbn: String): Response<List<SchoolDetail>>
}