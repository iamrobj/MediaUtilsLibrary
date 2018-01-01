package com.robj.radicallyreusable.base.utils;

import java.util.NoSuchElementException;

import io.reactivex.annotations.Nullable;

/**
 * Created by Rob J on 01/91/12.
 */

class Optional<T> {

    private final T optional;

    public Optional(@Nullable T optional) {
        this.optional = optional;
    }

    public boolean isEmpty() {
        return this.optional == null;
    }

    public T get() {
        if (optional == null)
            throw new NoSuchElementException("Item was null..");
        return optional;
    }
}
