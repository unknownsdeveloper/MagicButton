package ankit.developer.unknowns.magicbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {
    MagicButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (MagicButton)findViewById(R.id.magicButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"CLicked",Toast.LENGTH_SHORT).show();
            }

        });
    }
}
