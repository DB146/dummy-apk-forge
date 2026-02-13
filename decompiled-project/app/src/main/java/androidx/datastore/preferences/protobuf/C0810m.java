package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810m {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0810m f13433b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0810m f13434c = new C0810m();

    /* renamed from: a, reason: collision with root package name */
    public final Map f13435a = Collections.emptyMap();

    public static C0810m a() {
        T t5 = T.f13352c;
        C0810m c0810m = f13433b;
        if (c0810m == null) {
            synchronized (C0810m.class) {
                try {
                    c0810m = f13433b;
                    if (c0810m == null) {
                        Class cls = AbstractC0809l.f13432a;
                        C0810m c0810m2 = null;
                        if (cls != null) {
                            try {
                                c0810m2 = (C0810m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0810m2 == null) {
                            c0810m2 = f13434c;
                        }
                        f13433b = c0810m2;
                        c0810m = c0810m2;
                    }
                } finally {
                }
            }
        }
        return c0810m;
    }
}
