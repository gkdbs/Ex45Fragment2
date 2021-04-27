package com.milkywaylhy.ex45fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_my,container,false);
// 혹시 set Argumnet 로 전달될 값이 있다면..
        Bundle bundle = getArguments();
        String name= bundle.getString("name");
        int age= bundle.getInt("age",25);

        return view;
    }
}
