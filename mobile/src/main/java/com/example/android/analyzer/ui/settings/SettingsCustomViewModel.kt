package com.example.android.analyzer.ui.settings

import android.arch.lifecycle.MutableLiveData
import android.databinding.Bindable
import com.example.android.analyzer.core.FeatureCore
import com.example.android.analyzer.core.PreferencesCore
import com.example.android.analyzer.core.entity.AppVersion
import com.example.android.core.arch.ObservableViewModel
import javax.inject.Inject

class SettingsCustomViewModel @Inject constructor(appVersion: AppVersion) : ObservableViewModel() {

//	@Inject
//	lateinit var appVersion: AppVersion

	@Inject
	lateinit var preferencesCore: PreferencesCore

	val token: MutableLiveData<String> = MutableLiveData()

	val notificationsEnabled: Boolean @Bindable get() = FeatureCore.notificationsEnabled

	val appVersionString = "${appVersion.versionName} (${appVersion.versionCode})"

//	val appVersionString = preferencesCore.sampleToken

	init {
		token.value = "testicek"
	}

//	val token : String = "ddd"

//	fun getToken(): LiveData<String> {
//		val ret = MutableLiveData<String>()
//		ret.value = "..."
//		return ret
//	}

}