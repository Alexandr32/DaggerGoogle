package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationViewModel
import dagger.BindsInstance
import dagger.Component

// говорит где использовать внедрение зависимостей
@Component(modules = [StorageModule::class])
interface AppComponent {
    //сообщаем Dagger, что RegistrationActivity запрашивает инъекцию и что он должен предоставить
    // зависимости, которые аннотируются с помощью @Inject (то есть, RegistrationViewModel).
    fun inject(registrationActivity: RegistrationActivity)

    // фабрика для контекста
    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }
}