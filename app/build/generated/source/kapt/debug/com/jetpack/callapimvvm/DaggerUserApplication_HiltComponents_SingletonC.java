// Generated by Dagger (https://dagger.dev).
package com.jetpack.callapimvvm;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.jetpack.callapimvvm.network.ApiInterface;
import com.jetpack.callapimvvm.network.ApiService;
import com.jetpack.callapimvvm.network.ApiService_ProvideUserRepositoryFactory;
import com.jetpack.callapimvvm.network.ApiService_ProvidesUserApiFactory;
import com.jetpack.callapimvvm.repository.UserRespository;
import com.jetpack.callapimvvm.viewmodel.UserViewModel;
import com.jetpack.callapimvvm.viewmodel.UserViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerUserApplication_HiltComponents_SingletonC extends UserApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final ApiService apiService;

  private final DaggerUserApplication_HiltComponents_SingletonC singletonC = this;

  private volatile Object apiInterface = new MemoizedSentinel();

  private volatile Object userRespository = new MemoizedSentinel();

  private DaggerUserApplication_HiltComponents_SingletonC(ApiService apiServiceParam,
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.apiService = apiServiceParam;

  }

  public static Builder builder() {
    return new Builder();
  }

  private ApiInterface apiInterface() {
    Object local = apiInterface;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiInterface;
        if (local instanceof MemoizedSentinel) {
          local = ApiService_ProvidesUserApiFactory.providesUserApi(apiService);
          apiInterface = DoubleCheck.reentrantCheck(apiInterface, local);
        }
      }
    }
    return (ApiInterface) local;
  }

  private UserRespository userRespository() {
    Object local = userRespository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = userRespository;
        if (local instanceof MemoizedSentinel) {
          local = ApiService_ProvideUserRepositoryFactory.provideUserRepository(apiService, apiInterface());
          userRespository = DoubleCheck.reentrantCheck(userRespository, local);
        }
      }
    }
    return (UserRespository) local;
  }

  @Override
  public void injectUserApplication(UserApplication userApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApiService apiService;

    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder apiService(ApiService apiService) {
      this.apiService = Preconditions.checkNotNull(apiService);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public UserApplication_HiltComponents.SingletonC build() {
      if (apiService == null) {
        this.apiService = new ApiService();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerUserApplication_HiltComponents_SingletonC(apiService, applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements UserApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerUserApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public UserApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityRetainedCImpl extends UserApplication_HiltComponents.ActivityRetainedC {
    private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl(DaggerUserApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;


    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private static final class ActivityCBuilder implements UserApplication_HiltComponents.ActivityC.Builder {
      private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private Activity activity;

      private ActivityCBuilder(DaggerUserApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
      }

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public UserApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
      }
    }

    private static final class ActivityCImpl extends UserApplication_HiltComponents.ActivityC {
      private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl = this;

      private ActivityCImpl(DaggerUserApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;


      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
      }

      @Override
      public Set<String> getViewModelKeys() {
        return Collections.<String>singleton(UserViewModel_HiltModules_KeyModule_ProvideFactory.provide());
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
      }

      private static final class FragmentCBuilder implements UserApplication_HiltComponents.FragmentC.Builder {
        private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private Fragment fragment;

        private FragmentCBuilder(DaggerUserApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;
        }

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public UserApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(singletonC, activityRetainedCImpl, activityCImpl, fragment);
        }
      }

      private static final class FragmentCI extends UserApplication_HiltComponents.FragmentC {
        private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private final FragmentCI fragmentCI = this;

        private FragmentCI(DaggerUserApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
            Fragment fragmentParam) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;


        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCI);
        }

        private static final class ViewWithFragmentCBuilder implements UserApplication_HiltComponents.ViewWithFragmentC.Builder {
          private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

          private final ActivityRetainedCImpl activityRetainedCImpl;

          private final ActivityCImpl activityCImpl;

          private final FragmentCI fragmentCI;

          private View view;

          private ViewWithFragmentCBuilder(
              DaggerUserApplication_HiltComponents_SingletonC singletonC,
              ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
              FragmentCI fragmentCI) {
            this.singletonC = singletonC;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCI = fragmentCI;
          }

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public UserApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(singletonC, activityRetainedCImpl, activityCImpl, fragmentCI, view);
          }
        }

        private static final class ViewWithFragmentCI extends UserApplication_HiltComponents.ViewWithFragmentC {
          private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

          private final ActivityRetainedCImpl activityRetainedCImpl;

          private final ActivityCImpl activityCImpl;

          private final FragmentCI fragmentCI;

          private final ViewWithFragmentCI viewWithFragmentCI = this;

          private ViewWithFragmentCI(DaggerUserApplication_HiltComponents_SingletonC singletonC,
              ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
              FragmentCI fragmentCI, View viewParam) {
            this.singletonC = singletonC;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCI = fragmentCI;


          }
        }
      }

      private static final class ViewCBuilder implements UserApplication_HiltComponents.ViewC.Builder {
        private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private View view;

        private ViewCBuilder(DaggerUserApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;
        }

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public UserApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(singletonC, activityRetainedCImpl, activityCImpl, view);
        }
      }

      private static final class ViewCI extends UserApplication_HiltComponents.ViewC {
        private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private final ViewCI viewCI = this;

        private ViewCI(DaggerUserApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
            View viewParam) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;


        }
      }
    }

    private static final class ViewModelCBuilder implements UserApplication_HiltComponents.ViewModelC.Builder {
      private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private SavedStateHandle savedStateHandle;

      private ViewModelCBuilder(DaggerUserApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
      }

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public UserApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
      }
    }

    private static final class ViewModelCImpl extends UserApplication_HiltComponents.ViewModelC {
      private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl = this;

      private volatile Provider<UserViewModel> userViewModelProvider;

      private ViewModelCImpl(DaggerUserApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;


      }

      private UserViewModel userViewModel() {
        return new UserViewModel(singletonC.userRespository());
      }

      private Provider<UserViewModel> userViewModelProvider() {
        Object local = userViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
          userViewModelProvider = (Provider<UserViewModel>) local;
        }
        return (Provider<UserViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return Collections.<String, Provider<ViewModel>>singletonMap("com.jetpack.callapimvvm.viewmodel.UserViewModel", (Provider) userViewModelProvider());
      }

      private static final class SwitchingProvider<T> implements Provider<T> {
        private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ViewModelCImpl viewModelCImpl;

        private final int id;

        SwitchingProvider(DaggerUserApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.viewModelCImpl = viewModelCImpl;
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.jetpack.callapimvvm.viewmodel.UserViewModel 
            return (T) viewModelCImpl.userViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private static final class ServiceCBuilder implements UserApplication_HiltComponents.ServiceC.Builder {
    private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerUserApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public UserApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ServiceCImpl extends UserApplication_HiltComponents.ServiceC {
    private final DaggerUserApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerUserApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }
}