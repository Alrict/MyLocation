package com.hypnus.oem.mylocation.common;

import android.app.Application;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.hypnus.oem.mylocation.model.Gps;


/**
 * Created by xuqingfu on 2017/4/15.
 */
public class AppApplication extends Application {

	/**全局GPS*/
	public static Gps mMockGps;

	static {
		mMockGps = Config.COMPANY;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		// 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
//		SDKInitializer.initialize(this);
		//在使用SDK各组件之前初始化context信息，传入ApplicationContext
		SDKInitializer.initialize(this);
		//自4.3.0起，百度地图SDK所有接口均支持百度坐标和国测局坐标，用此方法设置您使用的坐标类型.
		//包括BD09LL和GCJ02两种坐标，默认是BD09LL坐标。
		SDKInitializer.setCoordType(CoordType.BD09LL);
	}

}