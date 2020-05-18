package com.example.kesturi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class HomeFragment extends Fragment {

    private Button buttonWorker;
    private Button buttonQna;
    private Button buttonTips;
    private Button buttonAgenda;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        buttonWorker = view.findViewById(R.id.bworker);
        buttonWorker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Objects.requireNonNull(getActivity()).getApplicationContext(), WorkerActivity.class));
                getActivity().finish();
            }
        });

        buttonQna = view.findViewById(R.id.bqna);
        buttonQna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Objects.requireNonNull(getActivity()).getApplicationContext(), QnaActivity.class));
                getActivity().finish();
            }
        });

        buttonTips = view.findViewById(R.id.btips);
        buttonTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Objects.requireNonNull(getActivity()).getApplicationContext(), TipsActivity.class));
                getActivity().finish();
            }
        });

        buttonAgenda = view.findViewById(R.id.bagenda);
        buttonAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Objects.requireNonNull(getActivity()).getApplicationContext(), AgendaActivity.class));
                getActivity().finish();
            }
        });

        return view;
    }
}