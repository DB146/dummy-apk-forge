package R9;

import G8.m;
import android.content.SharedPreferences;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8941a;

    public b(SharedPreferences sharedPreferences) {
        l.e(sharedPreferences, "sharedPreferences");
        this.f8941a = sharedPreferences;
    }

    public final Object a(Class clazz, String key) {
        l.e(key, "key");
        l.e(clazz, "clazz");
        boolean equals = clazz.equals(String.class);
        SharedPreferences sharedPreferences = this.f8941a;
        if (equals || clazz.equals(null)) {
            return sharedPreferences.getString(key, "");
        }
        if (clazz.equals(Boolean.class) || clazz.equals(Boolean.TYPE)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(key, false));
        }
        if (clazz.equals(Integer.class) || clazz.equals(Integer.TYPE)) {
            return Integer.valueOf(sharedPreferences.getInt(key, -1));
        }
        if (clazz.equals(Float.class) || clazz.equals(Float.TYPE)) {
            return Float.valueOf(sharedPreferences.getFloat(key, -1.0f));
        }
        if (clazz.equals(Long.class) || clazz.equals(Long.TYPE)) {
            return Long.valueOf(sharedPreferences.getLong(key, -1L));
        }
        return new m().b(sharedPreferences.getString(key, ""), new N8.a(clazz));
    }

    public final void b(Object value, String key) {
        l.e(key, "key");
        l.e(value, "value");
        Class<?> cls = value.getClass();
        boolean equals = cls.equals(String.class);
        SharedPreferences sharedPreferences = this.f8941a;
        if (equals || cls.equals(null)) {
            sharedPreferences.edit().putString(key, (String) value).apply();
            return;
        }
        if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
            sharedPreferences.edit().putBoolean(key, ((Boolean) value).booleanValue()).apply();
            return;
        }
        if (cls.equals(Integer.class) || cls.equals(Integer.TYPE)) {
            sharedPreferences.edit().putInt(key, ((Integer) value).intValue()).apply();
            return;
        }
        if (cls.equals(Float.class) || cls.equals(Float.TYPE)) {
            sharedPreferences.edit().putFloat(key, ((Float) value).floatValue()).apply();
        } else if (cls.equals(Long.class) || cls.equals(Long.TYPE)) {
            sharedPreferences.edit().putLong(key, ((Long) value).longValue()).apply();
        } else {
            sharedPreferences.edit().putString(key, new m().f(value)).apply();
        }
    }
}
