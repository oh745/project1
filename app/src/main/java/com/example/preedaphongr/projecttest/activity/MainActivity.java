package com.example.preedaphongr.projecttest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.SearchView;

import com.example.preedaphongr.projecttest.MyApplication;
import com.example.preedaphongr.projecttest.R;
import com.example.preedaphongr.projecttest.adapter.SearchAdapter;
import com.example.preedaphongr.projecttest.component.NetComponent;
import com.example.preedaphongr.projecttest.model.Restaurant;
import com.example.preedaphongr.projecttest.model.SearchResponse;
import com.example.preedaphongr.projecttest.presenter.SearchPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchPresenter.View {

    private List<Restaurant> restaurantList = new ArrayList<Restaurant>();
    private SearchAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //restaurantList.add(new Restaurant("dddd","dddd","dddd","dddd","ddd","ddd","ddd"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SearchPresenter presenter = new SearchPresenter(this, this);
        ((MyApplication) getApplication()).getNetComponent().inject(this);

        SearchView searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d("test","********" + query);
                presenter.sendSearchRequest(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.search_list);






    }


    @Override
    public void showRestaurant(SearchResponse searchResponse) {
        Log.d("show", "*************************" + "hh");
        adapter = new SearchAdapter(searchResponse.getRestaurantsList(),getBaseContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

      //  for(int i = 0 ; i< searchResponse.getRestaurantsList().size(); i++){
      //          restaurantList.add(searchResponse.getRestaurantsList().get(i));
      //  }

       // adapter.notifyDataSetChanged();
    }

}