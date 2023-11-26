package com.slostyle.articles_page.repository;

import com.hadirahimi.worldnews.data.server.NewsApiService;

import javax.annotation.processing.Generated;
import javax.inject.Provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
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
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<NewsApiService> apiProvider;

  public MainRepository_Factory(Provider<NewsApiService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(apiProvider.get());
  }

  public static MainRepository_Factory create(Provider<NewsApiService> apiProvider) {
    return new MainRepository_Factory(apiProvider);
  }

  public static MainRepository newInstance(NewsApiService api) {
    return new MainRepository(api);
  }
}
