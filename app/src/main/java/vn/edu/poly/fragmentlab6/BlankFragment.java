package vn.edu.poly.fragmentlab6;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // khai layout cho fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }


    // xử lý các sự kiện tại đây
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final TextView tvFragment = view.findViewById(R.id.tvFragment);
        if (getArguments() != null) {
            String chuoi = getArguments().get("Doiso").toString();
            tvFragment.setText(chuoi);
        }

        tvFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), tvFragment.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
