package filipe.rehder.list.presentation

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Filipe on 12/12/2017.
 */
class ListPresenter @Inject constructor(@Named("helloWorldList") private val helloWorld : String) {
    fun helloWorld() : String = helloWorld
}