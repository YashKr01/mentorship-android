package org.systers.mentorship.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import org.systers.mentorship.models.User;

public abstract class FragmentEditProfileBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgUserAvatar;

  @NonNull
  public final Switch switchAvailableToMentor;

  @NonNull
  public final Switch switchNeedsMentoring;

  @NonNull
  public final TextInputLayout tiBio;

  @NonNull
  public final TextInputLayout tiInterests;

  @NonNull
  public final TextInputLayout tiLocation;

  @NonNull
  public final TextInputLayout tiName;

  @NonNull
  public final TextInputLayout tiOccupation;

  @NonNull
  public final TextInputLayout tiOrganization;

  @NonNull
  public final TextInputLayout tiSkills;

  @NonNull
  public final TextInputLayout tiSlack;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvUsername;

  @Bindable
  protected User mUser;

  protected FragmentEditProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView imgUserAvatar, Switch switchAvailableToMentor,
      Switch switchNeedsMentoring, TextInputLayout tiBio, TextInputLayout tiInterests,
      TextInputLayout tiLocation, TextInputLayout tiName, TextInputLayout tiOccupation,
      TextInputLayout tiOrganization, TextInputLayout tiSkills, TextInputLayout tiSlack,
      TextView tvEmail, TextView tvUsername) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgUserAvatar = imgUserAvatar;
    this.switchAvailableToMentor = switchAvailableToMentor;
    this.switchNeedsMentoring = switchNeedsMentoring;
    this.tiBio = tiBio;
    this.tiInterests = tiInterests;
    this.tiLocation = tiLocation;
    this.tiName = tiName;
    this.tiOccupation = tiOccupation;
    this.tiOrganization = tiOrganization;
    this.tiSkills = tiSkills;
    this.tiSlack = tiSlack;
    this.tvEmail = tvEmail;
    this.tvUsername = tvUsername;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentEditProfileBinding>inflate(inflater, org.systers.mentorship.R.layout.fragment_edit_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentEditProfileBinding>inflate(inflater, org.systers.mentorship.R.layout.fragment_edit_profile, null, false, component);
  }

  public static FragmentEditProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentEditProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentEditProfileBinding)bind(component, view, org.systers.mentorship.R.layout.fragment_edit_profile);
  }
}
