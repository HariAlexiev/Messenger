package messenger.hfad.com.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        Intent intent = new Intent(this,ReceiveMessageActivity.class);

        TextView messageView = findViewById(R.id.message);
        String message = messageView.getText().toString();

        intent.putExtra("message", message);

        startActivity(intent);
    }
}
