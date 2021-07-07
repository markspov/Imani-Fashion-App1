// Generated by view binder compiler. Do not edit!
package com.example.buynow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.buynow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText EmailEtSettingsPage;

  @NonNull
  public final ImageView backIvProfileFrag;

  @NonNull
  public final EditText nameEtSettingsPage;

  @NonNull
  public final Button saveSettingSettingsBtn;

  @NonNull
  public final ImageView searchIvProfileFrag;

  @NonNull
  public final LinearLayout topBarLayout;

  private ActivitySettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText EmailEtSettingsPage, @NonNull ImageView backIvProfileFrag,
      @NonNull EditText nameEtSettingsPage, @NonNull Button saveSettingSettingsBtn,
      @NonNull ImageView searchIvProfileFrag, @NonNull LinearLayout topBarLayout) {
    this.rootView = rootView;
    this.EmailEtSettingsPage = EmailEtSettingsPage;
    this.backIvProfileFrag = backIvProfileFrag;
    this.nameEtSettingsPage = nameEtSettingsPage;
    this.saveSettingSettingsBtn = saveSettingSettingsBtn;
    this.searchIvProfileFrag = searchIvProfileFrag;
    this.topBarLayout = topBarLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EmailEt_SettingsPage;
      EditText EmailEtSettingsPage = rootView.findViewById(id);
      if (EmailEtSettingsPage == null) {
        break missingId;
      }

      id = R.id.backIv_ProfileFrag;
      ImageView backIvProfileFrag = rootView.findViewById(id);
      if (backIvProfileFrag == null) {
        break missingId;
      }

      id = R.id.nameEt_SettingsPage;
      EditText nameEtSettingsPage = rootView.findViewById(id);
      if (nameEtSettingsPage == null) {
        break missingId;
      }

      id = R.id.saveSetting_SettingsBtn;
      Button saveSettingSettingsBtn = rootView.findViewById(id);
      if (saveSettingSettingsBtn == null) {
        break missingId;
      }

      id = R.id.searchIv_ProfileFrag;
      ImageView searchIvProfileFrag = rootView.findViewById(id);
      if (searchIvProfileFrag == null) {
        break missingId;
      }

      id = R.id.topBarLayout;
      LinearLayout topBarLayout = rootView.findViewById(id);
      if (topBarLayout == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((ConstraintLayout) rootView, EmailEtSettingsPage,
          backIvProfileFrag, nameEtSettingsPage, saveSettingSettingsBtn, searchIvProfileFrag,
          topBarLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
