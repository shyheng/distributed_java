package com.shy.provider.model

import io.swagger.annotations.ApiModel
import java.io.Serializable

@ApiModel(value = "User对象", description = "")
data class Users(
    var id: Int,
    var name: String,
    var pass: String,
    var del: Int
) : Serializable
