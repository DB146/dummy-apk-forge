package c4;

import android.content.Context;
import h3.o;
import k4.InterfaceC1421a;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900b extends AbstractC0901c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14333a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1421a f14334b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1421a f14335c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14336d;

    public C0900b(Context context, InterfaceC1421a interfaceC1421a, InterfaceC1421a interfaceC1421a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f14333a = context;
        if (interfaceC1421a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f14334b = interfaceC1421a;
        if (interfaceC1421a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f14335c = interfaceC1421a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f14336d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0901c)) {
            return false;
        }
        AbstractC0901c abstractC0901c = (AbstractC0901c) obj;
        if (this.f14333a.equals(((C0900b) abstractC0901c).f14333a)) {
            C0900b c0900b = (C0900b) abstractC0901c;
            if (this.f14334b.equals(c0900b.f14334b) && this.f14335c.equals(c0900b.f14335c) && this.f14336d.equals(c0900b.f14336d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14333a.hashCode() ^ 1000003) * 1000003) ^ this.f14334b.hashCode()) * 1000003) ^ this.f14335c.hashCode()) * 1000003) ^ this.f14336d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f14333a);
        sb2.append(", wallClock=");
        sb2.append(this.f14334b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f14335c);
        sb2.append(", backendName=");
        return o.p(sb2, this.f14336d, "}");
    }
}
