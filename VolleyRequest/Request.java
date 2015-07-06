package com.myapplication;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

public class Request {
    private static RequestQueue queue;
    private RetryPolicy retryPolicy;

    public Request(Context context) {
        if (queue == null) {
            queue = Volley.newRequestQueue(context);
        }
    }

    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    public void get(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        com.android.volley.Request request = new StringRequest(com.android.volley.Request.Method.GET, url, listener, errorListener);
        if (this.retryPolicy != null) {
            request.setRetryPolicy(this.retryPolicy);
        }
        queue.add(request);
    }

    public void post(String url, final Map<String, String> params, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        com.android.volley.Request request = new StringRequest(com.android.volley.Request.Method.POST, url, listener, errorListener) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return params;
            }
        };
        if (this.retryPolicy != null) {
            request.setRetryPolicy(this.retryPolicy);
        }
        queue.add(request);
    }
}
