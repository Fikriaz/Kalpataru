package com.slostyle.articles_page.main;

import android.content.Context;

import javax.annotation.processing.Generated;
import javax.inject.Provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ActivityContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdapterNews_Factory implements Factory<AdapterNews> {
  private final Provider<Context> contextProvider;

  public AdapterNews_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AdapterNews get() {
    return newInstance(contextProvider.get());
  }

  public static AdapterNews_Factory create(Provider<Context> contextProvider) {
    return new AdapterNews_Factory(contextProvider);
  }

  public static AdapterNews newInstance(Context context) {
    return new AdapterNews(context);
  }
}
