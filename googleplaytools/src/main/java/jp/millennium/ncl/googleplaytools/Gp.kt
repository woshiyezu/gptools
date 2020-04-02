package jp.millennium.ncl.googleplaytools

import android.content.Context
import android.content.Intent
import android.net.Uri

fun Context.appDetailOnPlayStore(packageName: String? = null) {
    val intent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse("https://play.google.com/store/apps/details?id=${packageName ?: getPackageName()}")
    }

    startActivity(intent)
}

fun Context.searchOnPlayStore(query: String) {
    val intent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse("https://play.google.com/store/search?q=${query}&c=apps")
    }

    startActivity(intent)
}

fun Context.developerOnPlayStore(developerId: String) {
    val intent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse("https://play.google.com/store/apps/dev?id=${developerId}")
    }

    startActivity(intent)
}