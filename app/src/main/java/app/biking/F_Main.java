package app.biking;


import android.database.Cursor;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;


/**
 * A simple {@link Fragment} subclass.
 */
public class F_Main extends Fragment {


    private ListView lvStation;
    String urlBase = "https://wservice.viabicing.cat/v2/stations";
    stationsService servicio;
    StationsApi stationsApi;
    private Cursor cursor;
    ArrayList alStations;


    public F_Main() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_f_main, container, false);
        lvStation = (ListView) rootView.findViewById(R.id.livStation);

        createRetrofit();
        llamada();


        return rootView;
    }



    public void createRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(urlBase)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        servicio = retrofit.create(stationsService.class);
    }

    interface stationsService {
        @GET("stations")
        Call<StationsApi> getStations();
    }

    public void llamada(){

        Call <StationsApi> call = servicio.getStations();
        call.enqueue(new Callback<StationsApi>() {
            @Override
            public void onResponse(Response<StationsApi> response, Retrofit retrofit) {
                if (response.isSuccess()){
                    stationsApi = response.body();
                    List<Station> ltStations=  stationsApi.getStations();

                    fDataRow(ltStations);

                    ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>
                            (getActivity().getApplicationContext(), R.layout.itemlv_f_main, alStations);

                    lvStation.setAdapter(itemsAdapter);


                } else try {
                    Log.w("Response Error", response.errorBody().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

    }

    public void fDataRow (List<Station> ltStations){

        alStations = new ArrayList<String>();

        for (int i = 0; i < ltStations.size(); i++) {
            String renglon = "";

            renglon = ltStations.get(i).getId()+" - Latitud: "
                    +ltStations.get(i).getLatitude()+" - Longitude: "
                    +ltStations.get(i).getLongitude();

            alStations.add(1, renglon);

        }

    }

}
