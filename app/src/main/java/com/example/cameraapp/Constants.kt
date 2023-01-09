package com.example.cameraapp

import android.Manifest

object Constants {
    const val TAG = "cameraX"
    const val FILE_NAME_FORMAT = "yy-MM-dd-HH-mm-ss-SSS"
    const val  REQUEST_CODE_PERMISSIONS = 123
    val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)
    const val REQUEST_CODE_GPS = 101
    val REQUIRED_GPS_PERMISSIONS = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)
}