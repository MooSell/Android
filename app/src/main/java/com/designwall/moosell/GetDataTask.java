package com.designwall.moosell;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static com.designwall.moosell.Config.BASIC_AUTH;

/**
 * Created by SCIT on 3/9/2017.
 */

public class GetDataTask extends AsyncTask<String, Integer, String[]> {
    public static final String METHOD_POST = "post";
    public static final String METHOD_GET = "get";
    public static final String METHOD_PUT = "put";
    public static final String METHOD_DELETE = "delete";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private OkHttpClient mClient;
    private String mMethod;
    private String mRequestBody;

    public GetDataTask(String method) {
        mMethod = method;
    }

    public GetDataTask(String method, String requestBody) {
        mMethod = method;
        mRequestBody = requestBody;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mClient = new OkHttpClient.Builder()
                .connectTimeout(40, TimeUnit.SECONDS)
                .writeTimeout(40, TimeUnit.SECONDS)
                .writeTimeout(40, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    @Override
    protected String[] doInBackground(String... urls) {
        String[] result = new String[urls.length];
        for (int i = 0; i < urls.length; i++) {
            Request request;
            try {
                switch (mMethod){
                    case METHOD_POST:
                    case METHOD_PUT:
                        RequestBody body = RequestBody.create(JSON, mRequestBody);
                        request = new Request.Builder()
                                .url(urls[i])
                                .post(body)
                                .header("Authorization", BASIC_AUTH)
                                .build();
                        break;
                    case METHOD_GET:
                    case METHOD_DELETE:
                    default:
                        request = new Request.Builder()
                                .url(urls[i])
                                .header("Authorization", BASIC_AUTH)
                                .build();

                }
                Response response = mClient.newCall(request).execute();
                result[i] = response.body().string();
                Log.v("Test", result[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        //TODO: Update Progress here
    }

    @Override
    protected void onPostExecute(String[] result) {
        super.onPostExecute(result);
        //TODO: Executing data here
        //Log.v("Test", result.toString());
    }
}
