package co.ga.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    Button buttonBlue;
    Button buttonGreen;
    Button buttonRed;

    String lastColor;
    LinearLayout overall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (TextView) findViewById(R.id.myTextView);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        overall = (LinearLayout) findViewById(R.id.overall);

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastColor = myTextView.getText().toString();

                myTextView.setTextColor(getResources().getColor(R.color.buttonBlue));
                myTextView.setText("Blue");

                setBackground();
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastColor = myTextView.getText().toString();

                myTextView.setTextColor(getResources().getColor(R.color.buttonGreen));
                myTextView.setText("Green");

                setBackground();
            }
        });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastColor = myTextView.getText().toString();

                myTextView.setTextColor(getResources().getColor(R.color.buttonRed));
                myTextView.setText("Red");

                setBackground();
            }
        });

    }

    private void setBackground() {

        if (lastColor.equals("Blue")) {
            overall.setBackgroundColor(getResources().getColor(R.color.buttonBlue));
        } else if (lastColor.equals("Green")) {
            overall.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
        } else if (lastColor.equals("Red")) {
            overall.setBackgroundColor(getResources().getColor(R.color.buttonRed));
        }

    }

}
