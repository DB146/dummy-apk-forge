package d3;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u.C2052e;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1045a {

    /* renamed from: a, reason: collision with root package name */
    public final C2052e f16507a;

    /* renamed from: b, reason: collision with root package name */
    public final C2052e f16508b;

    /* renamed from: c, reason: collision with root package name */
    public final C2052e f16509c;

    public AbstractC1045a(C2052e c2052e, C2052e c2052e2, C2052e c2052e3) {
        this.f16507a = c2052e;
        this.f16508b = c2052e2;
        this.f16509c = c2052e3;
    }

    public abstract C1046b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C2052e c2052e = this.f16509c;
        Class cls2 = (Class) c2052e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(X.c.j(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        c2052e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C2052e c2052e = this.f16507a;
        Method method = (Method) c2052e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1045a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1045a.class);
        c2052e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C2052e c2052e = this.f16508b;
        Method method = (Method) c2052e.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", cls, AbstractC1045a.class);
        c2052e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i7);

    public final int f(int i7, int i10) {
        return !e(i10) ? i7 : ((C1046b) this).f16511e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((C1046b) this).f16511e.readParcelable(C1046b.class.getClassLoader());
    }

    public final InterfaceC1047c h() {
        String readString = ((C1046b) this).f16511e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1047c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void i(int i7);

    public final void j(int i7, int i10) {
        i(i10);
        ((C1046b) this).f16511e.writeInt(i7);
    }

    public final void k(Parcelable parcelable, int i7) {
        i(i7);
        ((C1046b) this).f16511e.writeParcelable(parcelable, 0);
    }

    public final void l(InterfaceC1047c interfaceC1047c) {
        if (interfaceC1047c == null) {
            ((C1046b) this).f16511e.writeString(null);
            return;
        }
        try {
            ((C1046b) this).f16511e.writeString(b(interfaceC1047c.getClass()).getName());
            C1046b a9 = a();
            try {
                d(interfaceC1047c.getClass()).invoke(null, interfaceC1047c, a9);
                int i7 = a9.f16514i;
                if (i7 >= 0) {
                    int i10 = a9.f16510d.get(i7);
                    Parcel parcel = a9.f16511e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(interfaceC1047c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
