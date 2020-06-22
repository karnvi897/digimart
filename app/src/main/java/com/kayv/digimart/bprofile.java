package com.kayv.digimart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bprofile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bprofile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public bprofile() {

        private ImageView bbanner;
        private CircleImageView blogo;
        TextView bname;
        private ImageView editbutton;
        private EditText editbname;
        private EditText editbadd;


        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment bprofile.
     */
    // TODO: Rename and change types and number of parameters
    public static bprofile newInstance(String param1, String param2) {
        bprofile fragment = new bprofile();
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
        return inflater.inflate(R.layout.fragment_bprofile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        bbanner = view.findViewById(R.id.bbanner);
        blogo = (CircleImageView) findViewById(R.id.blogo);
        bname = (TextView) findViewById(R.id.bname);
        editbutton = (ImageView) findViewById(R.id.editbutton);
        editbname = (EditText) findViewById(R.id.editbname);
        editbadd = (EditText) findViewById(R.id.editbadd);
        super.onViewCreated(view, savedInstanceState);
    }
}