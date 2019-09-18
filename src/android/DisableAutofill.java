package com.noesis.disableAutofill;

// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CordovaActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.view.autofill.AutofillManager;
import android.content.Context;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.os.Build;
import java.lang.Integer;


public class DisableAutofill extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("disable") && (Integer.valueOf(android.os.Build.VERSION.SDK_INT) >= 26) {
            cordova.getActivity().runOnUiThread(new Runnable() {
                @SuppressWarnings("ResourceType")
                @Override
                public void run() {

                    final CordovaActivity cordovaActivity = (CordovaActivity) cordova.getActivity();

                    ViewGroup mainViewGroup = (ViewGroup) webView.getView().getParent();

                    ViewGroup rootView = (ViewGroup) mainViewGroup.getParent();

                    rootView.setImportantForAutofill(View.IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS);
                }
            });
            return true;

        } else {
            
            return false;

        }
    }
}
