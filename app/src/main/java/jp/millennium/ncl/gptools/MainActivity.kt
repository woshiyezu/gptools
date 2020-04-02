package jp.millennium.ncl.gptools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.millennium.ncl.googleplaytools.appDetailOnPlayStore
import jp.millennium.ncl.googleplaytools.searchOnPlayStore
import jp.millennium.ncl.googleplaytools.developerOnPlayStore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //appDetailOnPlayStore()
        //searchOnPlayStore("test")
        developerOnPlayStore("5700313618786177705")
    }
}
