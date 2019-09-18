package com.noesis.disableAutofill;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.view.autofill.AutofillManager;
import android.content.Context;

public class DisableAutofill extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("disable")) {
            AutofillManager autofillManager = getSystemService(AutofillManager.class);
            autofillManager.disableAutofillServices();

            return true;

        } else {
            
            return false;

        }
    }
}
