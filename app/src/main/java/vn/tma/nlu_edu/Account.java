package vn.tma.nlu_edu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.tma.nlu_edu.R;

public class Account extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                AlertDialog.Builder alBuilder = new AlertDialog.Builder(getActivity());
                alBuilder.setTitle("Đăng xuất");
                alBuilder.setMessage("Bạn có muốn đăng xuất không?");
                alBuilder.setPositiveButton("Đăng xuất", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        getActivity().finish();
                    }
                });
                alBuilder.setNegativeButton("Hủy bỏ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alBuilder.show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }
}