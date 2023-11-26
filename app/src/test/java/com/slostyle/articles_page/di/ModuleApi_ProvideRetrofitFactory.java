package com.slostyle.articles_page.di;

import com.google.gson.Gson;
import com.hadirahimi.worldnews.data.server.NewsApiService;

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
public final class ModuleApi_ProvideRetrofitFactory implements Factory<NewsApiService> {
  private final Provider<String> base_urlProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> clientProvider;

  public ModuleApi_ProvideRetrofitFactory(Provider<String> base_urlProvider,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> clientProvider) {
    this.base_urlProvider = base_urlProvider;
    this.gsonProvider = gsonProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public NewsApiService get() {
    return provideRetrofit(base_urlProvider.get(), gsonProvider.get(), clientProvider.get());
  }

  public static ModuleApi_ProvideRetrofitFactory create(Provider<String> base_urlProvider,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> clientProvider) {
    return new ModuleApi_ProvideRetrofitFactory(base_urlProvider, gsonProvider, clientProvider);
  }

  public static NewsApiService provideRetrofit(String base_url, Gson gson, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(ModuleApi.INSTANCE.provideRetrofit(base_url, gson, client));
  }
}
