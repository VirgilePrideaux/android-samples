RequestQueue queue = Volley.newRequestQueue(context);

Map<String, String> params = new HashMap<>();
params.put("param1", "foo");
params.put("param2", "bar");

queue.add(new CustomJsonRequest(Request.Method.POST, String.format(Constant.URL), params,
		new Response.Listener<JSONObject>() {
			@Override
			public void onResponse(JSONObject response) {
				Log.e("VolleyResponse", response.toString());
			}
		},
		new Response.ErrorListener() {
			@Override
			public void onErrorResponse(VolleyError arg0) {
				Log.e("VolleyError", arg0.getMessage());
			}
		}));