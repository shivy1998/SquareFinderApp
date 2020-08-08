package lockdown.org.findsquareapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    EditText etNum;
    Button btnFindSquare,btnFindCube;
    TextView tvResult;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        etNum = findViewById(R.id.etNum);
        btnFindSquare = findViewById(R.id.btnFindSquare);
        btnFindCube = findViewById(R.id.btnFindCube);
        tvResult = findViewById(R.id.tvResult);
        btnFindSquare.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String n = etNum.getText().toString();
                int num = Integer.parseInt(n);
                int square = num*num;
                tvResult.setText("Square of "+n+" is "+square);
            }
        });
        btnFindCube.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String n = etNum.getText().toString();
                int num = Integer.parseInt(n);
                int cube = num*num*num;
                tvResult.setText("Cube of "+n+" is "+cube);
            }
        });
    }
}