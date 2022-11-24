package au.edu.federation.itech3107.fedunimillionaire30393082;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Start extends AppCompatActivity {
    private Button button,button2;
    public static String name;
    private Dialog dialog;
    private AlertDialog.Builder builder;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button = findViewById(R.id.start);
        button2 = findViewById(R.id.history);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             showInput();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent();
                intent.setClass(Start.this,History.class);
                Start.this.startActivity(intent);
                Start.this.finish();
            }
        });
    }

        private void showInput() {
            final EditText editText = new EditText(this);
            builder = new AlertDialog.Builder(this).setTitle("Please input your name").setView(editText)
                    .setPositiveButton("Go Ahead", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        if (editText.getText().toString()==null||editText.getText().toString().length()==0){
                            Toast.makeText(Start.this, "Please input your name and play the game", Toast.LENGTH_SHORT).show();
                        }else {
                            name = editText.getText().toString();
                            Intent intent = new Intent();
                            intent.setClass(Start.this,MainActivity.class);
                            Start.this.startActivity(intent);
                            Start.this.finish();
                        }
                        }
                    }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(Start.this, "Please input your name and play the game", Toast.LENGTH_SHORT).show();
                            dialogInterface.dismiss();
                        }
                    });;
            builder.create().show();
        }

}