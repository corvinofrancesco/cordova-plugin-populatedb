/**
 * Main class of the plugin
 * it will implement cordova plugin interface and methods to configure database population.
 *
 */
package it.fcorvino.populatedb;

import org.apache.cordova.Config;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.util.Log;

public class PopulateDb extends CordovaPlugin {

    protected static final String LOG_TAG = "PopulateDb";

    public Object onMessage(String id, Object data) {
        if (id.equals("onPageFinished")) {
            String currentUrl = (String)data;
            Log.d(LOG_TAG, "PSEmpty pageDidLoad " + currentUrl);
        }
        return null;
    }

    /**
     * CordovaPlugin method execute
     *
     * init: (param: database name/file) force the creation of a database?
     * getCheck: return information on pervious operations?
     *
     * @param action
     * @param args
     * @param callbackContext
     * @return
     * @throws JSONException
     */
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("doNothing")) {
            doNothing();
            callbackContext.success();
            return true;
        }
        return false;
    }

    protected void doNothing() {
        Log.d(LOG_TAG, "Empty plugin did absolutely nothing");
    }

    private ConfPopulateDb getConfiguration(){
        ConfPolupateDb configuration = new ConfPopulateDb();

        Resources resources = this.getResources();
        AssetManager assetManager = resources.getAssets();

        // Read from the /assets directory
        try {
            InputStream inputStream = assetManager.open("createdb.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            System.out.println("The properties are now loaded");
            System.out.println("properties: " + properties);
        } catch (IOException e) {
            System.err.println("Failed to open microlog property file");
            e.printStackTrace();
        }

        return configuration;
    }
}
