package app.mydemo.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ProductList extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerViewAdapter viewAdapter;
LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        recyclerView=findViewById(R.id.recycler);
        viewAdapter=new RecyclerViewAdapter(this);
        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(viewAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


    }
}
