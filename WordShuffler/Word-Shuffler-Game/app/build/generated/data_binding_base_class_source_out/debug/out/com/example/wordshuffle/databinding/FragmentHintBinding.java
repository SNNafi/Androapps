// Generated by view binder compiler. Do not edit!
package com.example.wordshuffle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.wordshuffle.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHintBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton btnAgree;

  @NonNull
  public final ImageView closePopup;

  @NonNull
  public final TextView textHeader1;

  @NonNull
  public final TextView textInfo2;

  private FragmentHintBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton btnAgree, @NonNull ImageView closePopup,
      @NonNull TextView textHeader1, @NonNull TextView textInfo2) {
    this.rootView = rootView;
    this.btnAgree = btnAgree;
    this.closePopup = closePopup;
    this.textHeader1 = textHeader1;
    this.textInfo2 = textInfo2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHintBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHintBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_hint, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHintBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_agree;
      FloatingActionButton btnAgree = rootView.findViewById(id);
      if (btnAgree == null) {
        break missingId;
      }

      id = R.id.close_popup;
      ImageView closePopup = rootView.findViewById(id);
      if (closePopup == null) {
        break missingId;
      }

      id = R.id.text_header1;
      TextView textHeader1 = rootView.findViewById(id);
      if (textHeader1 == null) {
        break missingId;
      }

      id = R.id.text_info2;
      TextView textInfo2 = rootView.findViewById(id);
      if (textInfo2 == null) {
        break missingId;
      }

      return new FragmentHintBinding((ConstraintLayout) rootView, btnAgree, closePopup, textHeader1,
          textInfo2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}