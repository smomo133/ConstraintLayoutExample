package test.com.constraintlayoutexample

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mTag = "activity_main"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mTag)

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        setContentView(mTag)
    }

    override fun onBackPressed() {
        if (mTag != "activity_main") {
            mTag = "activity_main"
            setContentView(mTag)
        } else {
            super.onBackPressed()
        }
    }

    fun show(v: View) {
        mTag = v.tag as String
        setContentView(mTag)
    }

    private fun setContentView(tag: String){
        val id = resources.getIdentifier(tag, "layout", packageName)
        setContentView(id)
    }

    companion object{
        private val TAG = MainActivity.javaClass::class.java.simpleName
    }
}