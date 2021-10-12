package com.spartdark.mywebview.slice;

import com.spartdark.mywebview.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.webengine.WebConfig;
import ohos.agp.components.webengine.WebView;

public class MainAbilitySlice extends AbilitySlice {
    private WebView myWebview;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        //1.- implement WebView webview = (WebView) findComponentById(ResourceTable.Id_webview)
        // 2.- Set internet permissions
        //3.- In the slice/MainAbilitySlice.java file, use the webview.load(String url) method to access a specific web page and use the WebConfig class to configure the behavior of the WebView component. The sample code is as follows
        myWebview = (WebView) findComponentById(ResourceTable.Id_myWebView);
        WebConfig webConfig = myWebview.getWebConfig();
// WebView loads the URL. urlTextField is the TextField component where you can input the URL.
        myWebview.load("https://developer.harmonyos.com/en/documentation");
        //4.- The WebView component opens the target URL by default when the URL is redirected. You can use the WebAgent object to customize this behavior. The sample code is as follows

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
