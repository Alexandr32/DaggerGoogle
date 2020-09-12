package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface RegistrationComponent {

    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(fragment: EnterDetailsFragment)

    fun inject(fragment: TermsAndConditionsFragment)

    // сообщаем Dagger, что RegistrationActivity запрашивает инъекцию и что он должен предоставить
    // зависимости, которые аннотируются с помощью @Inject (то есть, RegistrationViewModel).
    fun inject(registrationActivity: RegistrationActivity)
}