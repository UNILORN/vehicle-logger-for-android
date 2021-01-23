package com.example.vehiclelogger

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import net.openid.appauth.AuthorizationRequest
import net.openid.appauth.AuthorizationService
import net.openid.appauth.AuthorizationServiceConfiguration
import net.openid.appauth.ResponseTypeValues

private val ISSUER_URI = "https://auth.optim.cloud"
private val CLIENT_ID = ""
private val REDIRECT_URI = "net.paonejp.kndzyb.appauthdemo:/cb"

private val SCOPE = "profile"
private val API_URI = "https://www.googleapis.com/oauth2/v3/userinfo"

private val REQCODE_AUTH = 100
private val X_HTTP_NEED_REAUTHZ = -1
private val X_HTTP_ERROR = -9

private val LOG_TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun startAuthorization() {
//        AuthorizationServiceConfiguration.fetchFromIssuer(Uri.parse(ISSUER_URI), { config, ex ->
//            if (config != null) {
//                val req = AuthorizationRequest
//                        .Builder(config, CLIENT_ID, ResponseTypeValues.CODE, Uri.parse(REDIRECT_URI))
//                        .setScope(SCOPE)
//                        .build()
//                val intent = AuthorizationService(this).getAuthorizationRequestIntent(req)
//                startActivityForResult(intent, REQCODE_AUTH)
//            } else {
//                if (ex != null) {
//                    val m = Throwable().stackTrace[0]
//                    Log.e(LOG_TAG, "${m}: ${ex}")
//                }
//                whenAuthorizationFails(ex)
//            }
//        })
//    }
}