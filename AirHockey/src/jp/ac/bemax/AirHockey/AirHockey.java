package jp.ac.bemax.AirHockey;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

public class AirHockey extends Activity {
	private SurfaceView surfaceView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SurfaceView sview = (SurfaceView)findViewById(R.id.field);
        Field field = new Field(sview);
        //Field field = new Field(surfaceView, this);
    }

	@Override
	protected void onDestroy() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
	}

	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
	}
}