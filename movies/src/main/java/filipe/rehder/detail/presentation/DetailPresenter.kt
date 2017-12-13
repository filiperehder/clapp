package filipe.rehder.detail.presentation

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Filipe on 12/12/2017.
 */
class DetailPresenter @Inject constructor(@Named("stringOfTest") private var stringOfTest : String) {

    fun helloWorld() {
        Log.i("Hello World", stringOfTest)
    }

}