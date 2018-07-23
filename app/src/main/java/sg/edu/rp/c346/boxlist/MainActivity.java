package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColor;
    ArrayList<Color> alColor;
    CustomAdapter caColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor = findViewById(R.id.listViewColor);

        alColor = new ArrayList<>();
        Color item1 = new Color(0);
        Color item2 = new Color(1);
        Color item3 = new Color(2);
        alColor.add(item1);
        alColor.add(item2);
        alColor.add(item3);
        caColor = new CustomAdapter(this, R.layout.color, alColor);

        lvColor.setAdapter(caColor);
    }
}
