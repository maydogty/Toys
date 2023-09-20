package il.com.noa.toys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    private RecyclerView rvToys;
    private ToyAdapter adapter;
    private Toys toys;
    Toy toy1;
    Toy toy2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        createToys();
        setRecyclerView();

    }

    private void initializeViews()
    {
        rvToys = findViewById(R.id.rvToys);
    }

    private void createToys(){
        toy1 = new Toy("Bear", 20);
        toys.add(toy1);

    }

    private void setRecyclerView()
    {
        adapter = new ToyAdapter(this, toys, R.layout.toy);
        rvToys.setAdapter(adapter);
        rvToys.setLayoutManager(new LinearLayoutManager(this));
    }


}