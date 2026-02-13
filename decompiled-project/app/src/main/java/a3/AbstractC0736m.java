package a3;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: a3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0736m {
    public static <T, V> ObjectAnimator a(T t5, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t5, property, (TypeConverter) null, path);
    }
}
