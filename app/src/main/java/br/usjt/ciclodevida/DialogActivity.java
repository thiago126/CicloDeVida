package br.usjt.ciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/*
@author Thiago Freitas
@ra 816119076
*/
public class DialogActivity extends Activity {
    /*
    @author Thiago Freitas
    @ra 816119076
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
    }

    /*
    @author Thiago Freitas
    @ra 816119076
    */
    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}

