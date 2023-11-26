package com.slostyle.articles_page.di;

import javax.annotation.processing.Generated;
import javax.inject.Provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

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
public final class ModuleApi_ProvideClientFactory implements Factory<OkHttpClient> {
  private final Provider<Long> timeProvider;

  public ModuleApi_ProvideClientFactory(Provider<Long> timeProvider) {
    this.timeProvider = timeProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideClient(timeProvider.get());
  }

  public static ModuleApi_ProvideClientFactory create(Provider<Long> timeProvider) {
    return new ModuleApi_ProvideClientFactory(timeProvider);
  }

  public static OkHttpClient provideClient(long time) {
    return Preconditions.checkNotNullFromProvides(ModuleApi.INSTANCE.provideClient(time));
  }
}
