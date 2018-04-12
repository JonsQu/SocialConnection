package shadow.fi.socialconnection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View view) {
        Intent signIn = new Intent(this, SignInActivity.class);
        startActivity(signIn);
    }

    public void login(View view) {
    }
}