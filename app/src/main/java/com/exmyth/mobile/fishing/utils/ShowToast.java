/*
 * Copyright (c) 2014, 青岛司通科技有限公司 All rights reserved.
 * File Name：ShowToast.java
 * Version：V1.0
 * Author：exmyth
 * Date：2014-8-7
 */
package com.exmyth.mobile.fishing.utils;

import android.widget.Toast;

import com.exmyth.mobile.fishing.base.AppAplication;

/**
 * @author exmyth
 * @ClassName: com.drd.piaojubao.utils.ShowToast
 * @Description: 显示Toast的工具类
 * @date 2014-8-7 上午11:21:48
 */
public class ShowToast {

	/**
	 * @param
	 * @return void
	 * @throws
	 * @Description: 显示短时间Toast
	 */
	public static void Short(CharSequence sequence) {
		Toast.makeText(AppAplication.getContext(), sequence, Toast.LENGTH_SHORT).show();
	}

	/**
	 * @param
	 * @return void
	 * @throws
	 * @Description: 显示长时间Toast
	 */
	public static void Long(CharSequence sequence) {
		Toast.makeText(AppAplication.getContext(), sequence, Toast.LENGTH_SHORT).show();
	}

}
