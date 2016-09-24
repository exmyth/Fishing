package com.exmyth.mobile.fishing.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import com.exmyth.mobile.fishing.R;
import com.exmyth.mobile.fishing.base.BaseActivity;
import com.exmyth.mobile.fishing.ui.fragment.SettingFragment;

/**
 * 设置界面
 * Updated by exmyth on 15/5/4.
 */
public class SettingActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);

		ActionBar actionBar = getSupportActionBar();

		actionBar.setDisplayShowHomeEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setDisplayShowTitleEnabled(false);

		getFragmentManager().beginTransaction()
				.replace(android.R.id.content, new SettingFragment())
				.commit();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
			case android.R.id.home:
				finish();
				return true;
		}

		return super.onOptionsItemSelected(item);
	}

}
