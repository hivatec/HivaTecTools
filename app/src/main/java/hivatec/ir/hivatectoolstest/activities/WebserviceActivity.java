package hivatec.ir.hivatectoolstest.activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.provider.Settings;
import android.widget.Toast;

import java.io.IOException;

import hivatec.ir.hivatectools.activityHelpers.ParentActivity;
import hivatec.ir.hivatectools.helper.G;
import hivatec.ir.hivatectools.helper.PhoneInformation;
import hivatec.ir.hivatectoolstest.R;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import retrofit2.http.POST;

public class WebserviceActivity extends ParentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void setContentViewActivity() {
		setContentView(R.layout.activity_webservice);
	}

	@Override
	protected void getIntentData() {

	}

	@Override
	protected void prepareToolbar() {

	}

	@Override
	protected void instantiateViews() {

	}

	@Override
	protected void setViewListeners() {

	}

	@Override
	protected void setActivityContent() {


	}

	@Override
	protected void refreshContent() {

	}

}
