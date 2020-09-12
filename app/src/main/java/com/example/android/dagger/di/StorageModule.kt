package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

// сообщает какую реализацию должен использовать даггер
@Module
abstract class StorageModule {

    // Storage - это интерфейс, и его нельзя создать напрямую. Нам нужно указать Dagger,
    // какую реализацию Storage мы хотим использовать. В данном случае это SharedPreferencesStorage.

    // provideStorage- это просто произвольное имя метода, это может быть что угодно, для Dagger
    // это не имеет значения. Что касается Dagger, так это параметр и тип возвращаемого значения.
    //Storage Module - это abstractс ейчас , потому что provideStorage является абстрактным.

    // @Binds чтобы сообщить Dagger, какую реализацию необходимо
    // использовать при предоставлении интерфейса.
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}