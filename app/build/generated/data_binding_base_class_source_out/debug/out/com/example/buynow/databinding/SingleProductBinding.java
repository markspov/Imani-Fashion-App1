// Generated by view binder compiler. Do not edit!
package com.example.buynow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.buynow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SingleProductBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final LinearLayout discountSingleProduct;

  @NonNull
  public final TextView discountTvSingleProduct;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final ImageView productAddToFavSingleProduct;

  @NonNull
  public final TextView productBrandNameSingleProduct;

  @NonNull
  public final ImageView productImageSingleProduct;

  @NonNull
  public final TextView productNameSingleProduct;

  @NonNull
  public final TextView productPriceSingleProduct;

  @NonNull
  public final RatingBar productRatingSingleProduct;

  private SingleProductBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull LinearLayout discountSingleProduct, @NonNull TextView discountTvSingleProduct,
      @NonNull LinearLayout linearLayout5, @NonNull ImageView productAddToFavSingleProduct,
      @NonNull TextView productBrandNameSingleProduct, @NonNull ImageView productImageSingleProduct,
      @NonNull TextView productNameSingleProduct, @NonNull TextView productPriceSingleProduct,
      @NonNull RatingBar productRatingSingleProduct) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.discountSingleProduct = discountSingleProduct;
    this.discountTvSingleProduct = discountTvSingleProduct;
    this.linearLayout5 = linearLayout5;
    this.productAddToFavSingleProduct = productAddToFavSingleProduct;
    this.productBrandNameSingleProduct = productBrandNameSingleProduct;
    this.productImageSingleProduct = productImageSingleProduct;
    this.productNameSingleProduct = productNameSingleProduct;
    this.productPriceSingleProduct = productPriceSingleProduct;
    this.productRatingSingleProduct = productRatingSingleProduct;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SingleProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SingleProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.single_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SingleProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.discount_singleProduct;
      LinearLayout discountSingleProduct = rootView.findViewById(id);
      if (discountSingleProduct == null) {
        break missingId;
      }

      id = R.id.discountTv_singleProduct;
      TextView discountTvSingleProduct = rootView.findViewById(id);
      if (discountTvSingleProduct == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = rootView.findViewById(id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.productAddToFav_singleProduct;
      ImageView productAddToFavSingleProduct = rootView.findViewById(id);
      if (productAddToFavSingleProduct == null) {
        break missingId;
      }

      id = R.id.productBrandName_singleProduct;
      TextView productBrandNameSingleProduct = rootView.findViewById(id);
      if (productBrandNameSingleProduct == null) {
        break missingId;
      }

      id = R.id.productImage_singleProduct;
      ImageView productImageSingleProduct = rootView.findViewById(id);
      if (productImageSingleProduct == null) {
        break missingId;
      }

      id = R.id.productName_singleProduct;
      TextView productNameSingleProduct = rootView.findViewById(id);
      if (productNameSingleProduct == null) {
        break missingId;
      }

      id = R.id.productPrice_singleProduct;
      TextView productPriceSingleProduct = rootView.findViewById(id);
      if (productPriceSingleProduct == null) {
        break missingId;
      }

      id = R.id.productRating_singleProduct;
      RatingBar productRatingSingleProduct = rootView.findViewById(id);
      if (productRatingSingleProduct == null) {
        break missingId;
      }

      return new SingleProductBinding((ConstraintLayout) rootView, cardView, discountSingleProduct,
          discountTvSingleProduct, linearLayout5, productAddToFavSingleProduct,
          productBrandNameSingleProduct, productImageSingleProduct, productNameSingleProduct,
          productPriceSingleProduct, productRatingSingleProduct);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
