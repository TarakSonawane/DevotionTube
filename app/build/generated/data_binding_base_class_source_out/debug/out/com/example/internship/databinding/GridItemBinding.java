// Generated by view binder compiler. Do not edit!
package com.example.internship.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.internship.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView gridImage;

  @NonNull
  public final TextView itemName;

  private GridItemBinding(@NonNull ConstraintLayout rootView, @NonNull CircleImageView gridImage,
      @NonNull TextView itemName) {
    this.rootView = rootView;
    this.gridImage = gridImage;
    this.itemName = itemName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GridItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.grid_image;
      CircleImageView gridImage = ViewBindings.findChildViewById(rootView, id);
      if (gridImage == null) {
        break missingId;
      }

      id = R.id.item_name;
      TextView itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      return new GridItemBinding((ConstraintLayout) rootView, gridImage, itemName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}