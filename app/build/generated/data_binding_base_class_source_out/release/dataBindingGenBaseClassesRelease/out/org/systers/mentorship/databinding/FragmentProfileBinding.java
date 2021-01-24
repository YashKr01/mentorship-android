package org.systers.mentorship.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textfield.TextInputLayout;
import org.systers.mentorship.models.User;

public abstract class FragmentProfileBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatEditText etUserName;

  @NonNull
  public final SwipeRefreshLayout srlProfile;

  @NonNull
  public final Switch switchAvailableToMentor;

  @NonNull
  public final Switch switchNeedMentorship;

  @NonNull
  public final AppCompatTextView textView2;

  @NonNull
  public final AppCompatTextView textView3;

  @NonNull
  public final TextInputLayout tiBio;

  @NonNull
  public final TextInputLayout tiEmail;

  @NonNull
  public final TextInputLayout tiInterests;

  @NonNull
  public final TextInputLayout tiLocation;

  @NonNull
  public final TextInputLayout tiOccupation;

  @NonNull
  public final TextInputLayout tiOrganization;

  @NonNull
  public final TextInputLayout tiSkills;

  @NonNull
  public final TextInputLayout tiSlackUsername;

  @NonNull
  public final TextInputLayout tiUsername;

  @Bindable
  protected User mUser;

  protected FragmentProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatEditText etUserName, SwipeRefreshLayout srlProfile,
      Switch switchAvailableToMentor, Switch switchNeedMentorship, AppCompatTextView textView2,
      AppCompatTextView textView3, TextInputLayout tiBio, TextInputLayout tiEmail,
      TextInputLayout tiInterests, TextInputLayout tiLocation, TextInputLayout tiOccupation,
      TextInputLayout tiOrganization, TextInputLayout tiSkills, TextInputLayout tiSlackUsername,
      TextInputLayout tiUsername) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etUserName = etUserName;
    this.srlProfile = srlProfile;
    this.switchAvailableToMentor = switchAvailableToMentor;
    this.switchNeedMentorship = switchNeedMentorship;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.tiBio = tiBio;
    this.tiEmail = tiEmail;
    this.tiInterests = tiInterests;
    this.tiLocation = tiLocation;
    this.tiOccupation = tiOccupation;
    this.tiOrganization = tiOrganization;
    this.tiSkills = tiSkills;
    this.tiSlackUsername = tiSlackUsername;
    this.tiUsername = tiUsername;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProfileBinding>inflate(inflater, org.systers.mentorship.R.layout.fragment_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProfileBinding>inflate(inflater, org.systers.mentorship.R.layout.fragment_profile, null, false, component);
  }

  public static FragmentProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentProfileBinding)bind(component, view, org.systers.mentorship.R.layout.fragment_profile);
  }
}
