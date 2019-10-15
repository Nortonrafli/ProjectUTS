package ProjectJalanJalan.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;
import android.content.Intent;
import ProjectJalanJalan.uts.Activity.WelcomeActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,WelcomeActivity.class));
                finish();
            }
        }, 5000);
    }
}
