package l2;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class Z extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static Z f19197c;

    /* renamed from: d, reason: collision with root package name */
    public static final Y5.B f19198d = new Y5.B(12);

    /* renamed from: b, reason: collision with root package name */
    public final Application f19199b;

    public Z(Application application) {
        this.f19199b = application;
    }

    @Override // l2.b0, l2.a0
    public final Y a(Class cls) {
        Application application = this.f19199b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // l2.b0, l2.a0
    public final Y b(Class cls, o2.d dVar) {
        if (this.f19199b != null) {
            return a(cls);
        }
        Application application = (Application) dVar.f21663a.get(f19198d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC1457a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return E6.b.h(cls);
    }

    public final Y d(Class cls, Application application) {
        if (!AbstractC1457a.class.isAssignableFrom(cls)) {
            return E6.b.h(cls);
        }
        try {
            Y y10 = (Y) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.l.b(y10);
            return y10;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
