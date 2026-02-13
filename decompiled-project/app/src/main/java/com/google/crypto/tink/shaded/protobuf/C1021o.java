package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021o {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1021o f15805b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1021o f15806c = new C1021o();

    /* renamed from: a, reason: collision with root package name */
    public final Map f15807a = Collections.emptyMap();

    public static C1021o a() {
        C1021o c1021o = f15805b;
        if (c1021o == null) {
            synchronized (C1021o.class) {
                try {
                    c1021o = f15805b;
                    if (c1021o == null) {
                        Class cls = AbstractC1020n.f15804a;
                        C1021o c1021o2 = null;
                        if (cls != null) {
                            try {
                                c1021o2 = (C1021o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c1021o2 == null) {
                            c1021o2 = f15806c;
                        }
                        f15805b = c1021o2;
                        c1021o = c1021o2;
                    }
                } finally {
                }
            }
        }
        return c1021o;
    }
}
