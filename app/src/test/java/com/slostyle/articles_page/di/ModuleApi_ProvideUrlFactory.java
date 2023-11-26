package com.slostyle.articles_page.di;

import javax.annotation.processing.Generated;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ModuleApi_ProvideUrlFactory implements Factory<String> {
  @Override
  public String get() {
    return provideUrl();
  }

  public static ModuleApi_ProvideUrlFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideUrl() {
    return Preconditions.checkNotNullFromProvides(ModuleApi.INSTANCE.provideUrl());
  }

  private static final class InstanceHolder {
    private static final ModuleApi_ProvideUrlFactory INSTANCE = new ModuleApi_ProvideUrlFactory();
  }
}
