package com.exmyth.mobile.fishing;

import android.test.InstrumentationTestCase;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.exmyth.mobile.fishing.net.RequestManager;
import com.exmyth.mobile.fishing.utils.ShowToast;

/**
 * Updated by exmyth on 15/4/27.
 */
public class TestClass extends InstrumentationTestCase{

	public TestClass(){

	}

	public void testGetCommentators() throws Exception {

	}

	protected void executeRequest(Request<?> request) {
		RequestManager.addRequest(request, this);
	}

	protected Response.ErrorListener errorListener() {
		return new Response.ErrorListener() {
			@Override
			public void onErrorResponse(VolleyError error) {
				ShowToast.Short(error.getMessage());
			}
		};
	}

}
