package com.ahmedhnewa.services.mail

data class EmailMessage(
    val to: String,
    val subject: String,
    val body: String
)
