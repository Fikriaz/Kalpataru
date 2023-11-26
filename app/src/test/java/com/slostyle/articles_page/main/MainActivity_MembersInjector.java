package com.slostyle.articles_page.main;

import javax.annotation.processing.Generated;
import javax.inject.Provider;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<AdapterNews> newsAdapterProvider;

  public MainActivity_MembersInjector(Provider<AdapterNews> newsAdapterProvider) {
    this.newsAdapterProvider = newsAdapterProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<AdapterNews> newsAdapterProvider) {
    return new MainActivity_MembersInjector(newsAdapterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectNewsAdapter(instance, newsAdapterProvider.get());
  }

  @InjectedFieldSignature("com.hadirahimi.worldnews.ui.main.MainActivity.newsAdapter")
  public static void injectNewsAdapter(MainActivity instance, AdapterNews newsAdapter) {
    instance.newsAdapter = newsAdapter;
  }
}
