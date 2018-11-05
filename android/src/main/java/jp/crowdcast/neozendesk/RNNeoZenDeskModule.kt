package jp.crowdcast.neozendesk

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import zendesk.core.Zendesk
import zendesk.support.guide.HelpCenterActivity

class RNNeoZenDeskModule(private val reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    @ReactMethod
    fun initialize(config: ReadableMap) {
        val appId = config.getString("appId")
        val zendeskUrl = config.getString("zendeskUrl")
        val clientId = config.getString("clientId")
        Zendesk.INSTANCE.init(reactContext, zendeskUrl, appId, clientId)
    }

    @ReactMethod
    fun showHelpCenterWithOptions(options: ReadableMap) {
        HelpCenterActivity.builder().show(reactContext)
    }

    override fun getName() = "RNZenDeskSupport"
}