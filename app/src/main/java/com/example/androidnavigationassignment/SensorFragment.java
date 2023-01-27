package com.example.androidnavigationassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SensorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SensorFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SensorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SensorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SensorFragment newInstance(String param1, String param2) {
        SensorFragment fragment = new SensorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sensor, container, false);

//        String type, location;
//        if (getArguments().getString("sensorType").equals(null)) {
//            type = "";
//        }
//        else {
//            type = getArguments().getString("sensorType");
//        };
//
//        if (getArguments().getString("sensorLocation").equals(null)) {
//            location = "";
//        }
//        else {
//            location = getArguments().getString("sensorLocation");
//        };
//
//        EditText sensorListTextBox = view.findViewById(R.id.sensorListTextBox);
//        if (!(sensorListTextBox.getText().toString().isEmpty())) {
//            sensorListTextBox.append(type + location + "\n");
//        }

        view.findViewById(R.id.floatingActionButtonPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View plusButton) {
                Navigation.findNavController(view).navigate(R.id.action_sensorFragment_to_addFragment);
            }
        });

        view.findViewById(R.id.buttonSensorDown).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View sensorDownButton) {
                Navigation.findNavController(view).navigate(R.id.action_sensorFragment_to_helpFragment);
            }
        });

        return view;
    }
}