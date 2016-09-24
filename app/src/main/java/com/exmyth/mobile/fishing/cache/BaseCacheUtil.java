package com.exmyth.mobile.fishing.cache;

import com.socks.greendao.DaoSession;

import java.util.ArrayList;

/**
 * Updated by exmyth on 15/5/12.
 */
public abstract class BaseCacheUtil<T> {

	protected static DaoSession mDaoSession;

	public abstract void clearAllCache();

	public abstract ArrayList<T> getCacheByPage(int page);

	public abstract void addResultCache(String result, int page);

}
