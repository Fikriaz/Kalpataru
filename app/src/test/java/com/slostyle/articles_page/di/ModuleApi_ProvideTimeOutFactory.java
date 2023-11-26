package com.slostyle.articles_page.di;

import javax.annotation.processing.Generated;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class ModuleApi_ProvideTimeOutFactory implements Factory<Long> {
  @Override
  public Long get() {
    return provideTimeOut();
  }

  public static ModuleApi_ProvideTimeOutFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static long provideTimeOut() {
    return ModuleApi.INSTANCE.provideTimeOut();
  }

  private static final class InstanceHolder {
    private static final ModuleApi_ProvideTimeOutFactory INSTANCE = new ModuleApi_ProvideTimeOutFactory();
  }
}
