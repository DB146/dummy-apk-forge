package a8;

import java.util.Collections;
import java.util.Map;

/* renamed from: a8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12798a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12799b;

    public C0786c(String str, Map map) {
        this.f12798a = str;
        this.f12799b = map;
    }

    public static C0786c a(String str) {
        return new C0786c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0786c)) {
            return false;
        }
        C0786c c0786c = (C0786c) obj;
        return this.f12798a.equals(c0786c.f12798a) && this.f12799b.equals(c0786c.f12799b);
    }

    public final int hashCode() {
        return this.f12799b.hashCode() + (this.f12798a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f12798a + ", properties=" + this.f12799b.values() + "}";
    }
}
