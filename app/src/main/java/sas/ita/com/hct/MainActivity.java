package sas.ita.com.hct;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
String[] studentName;
TypedArray studentImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentName =getResources().getStringArray(R.array.Student_name);
        studentImage = getResources().obtainTypedArray(R.array.Random_image);
    }
}
