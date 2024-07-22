package com.builder;
// Para patrones de diseño build se añade el generico. Indica que puedo utilizar el patron de diseño en cualquier clase
public interface IBuilder<T> {
    public T build();
}
