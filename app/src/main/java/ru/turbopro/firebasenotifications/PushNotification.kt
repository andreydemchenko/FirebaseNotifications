package ru.turbopro.firebasenotifications

data class PushNotification(
    val data: NotificationData,
    val to: String
)