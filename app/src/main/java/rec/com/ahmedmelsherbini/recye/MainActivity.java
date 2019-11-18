package rec.com.ahmedmelsherbini.recye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> Image_link = new ArrayList<>();
    ArrayList<String> Video_name = new ArrayList<>();
    ArrayList<String> Video_Link = new ArrayList<>();
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intialize();
        recyclerview = findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(this,Video_name,Image_link,Video_Link);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);
    }

    private void intialize() {
        Image_link.add("https://1.bp.blogspot.com/-zGTv--LF0lg/XRZQYG3rhtI/AAAAAAAAAdc/pbjSBaiOmCkXi4fUzqhxgjpbgaaOQdongCLcBGAs/s640/Capture%2B2019-06-24%2B11.31.29.jpg");
        Video_name.add("سمعني نبضك >> سلمي رشيد ");
        Video_Link.add("https://bit.ly/2ZZR54W");

        Image_link.add("https://i.ytimg.com/vi/uaXO84d8KpI/sddefault.jpg");
        Video_name.add("تلاوة خاشعه للقارئ الشيخ هزاع البلوشى ");
        Video_Link.add("https://www.google.com");

    }

}
