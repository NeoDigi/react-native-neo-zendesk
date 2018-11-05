package jp.crowdcast.neozendesk

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.ReactPackage
import com.facebook.react.uimanager.ViewManager

import java.util.Arrays
import java.util.Collections

class RNNeoZenDeskPackage : ReactPackage {

    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> =
        Arrays.asList(RNNeoZenDeskModule(reactContext))

    fun createJSModules(): List<Class<out JavaScriptModule>> = Collections.emptyList()

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> =
        Collections.emptyList()
}
