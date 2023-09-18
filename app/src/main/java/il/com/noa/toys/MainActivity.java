package il.com.noa.toys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    private RecyclerView rvToys;
    private ToyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRecyclerView();

    }

    public void initializeViews()
    {
        rvToys  =findViewById(R.id.rvToys);
    }

    public void setRecyclerView()
    {
        adapter = new ToyAdapter(this,toys, R.layout.single_toy_layout);
        rvToys.setAdapter(adapter);
        rvToys.setLayoutManager(new LinearLayoutManager(this));
    }


}