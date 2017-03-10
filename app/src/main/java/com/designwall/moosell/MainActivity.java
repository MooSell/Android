package com.designwall.moosell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;

import com.designwall.moosell.Adapter.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.designwall.moosell.Config.BASIC_AUTH;
import static com.designwall.moosell.Config.CONSUMER_KEY;
import static com.designwall.moosell.Config.CONSUMER_SECRET;

public class MainActivity extends AppCompatActivity {
    private OkHttpClient mClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Network.isAvailable(this)){
            new GetDataTask(GetDataTask.METHOD_GET).execute(Url.getProducts());
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        List<String> test = new ArrayList<>();
        test.add("DRESSED");
        test.add("SUITS");
        test.add("T-SHIRTS");
        test.add("WINTER");
        recyclerView.setAdapter(new CategoryAdapter(this, test));
    }

}
