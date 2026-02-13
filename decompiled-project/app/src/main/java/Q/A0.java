package Q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A0 implements Iterable, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f8266a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8268c;

    public A0(z0 z0Var, int i7, int i10) {
        this.f8266a = z0Var;
        this.f8267b = i7;
        this.f8268c = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i7;
        ArrayList arrayList;
        int e2;
        z0 z0Var = this.f8266a;
        if (z0Var.f8593v != this.f8268c) {
            B0.f();
        }
        HashMap hashMap = z0Var.f8595x;
        C0478a c0478a = null;
        int i10 = this.f8267b;
        if (hashMap != null) {
            if (z0Var.f8592u) {
                AbstractC0508p.c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i10 >= 0 && i10 < (i7 = z0Var.f8587b) && (e2 = B0.e((arrayList = z0Var.f8594w), i10, i7)) >= 0) {
                c0478a = (C0478a) arrayList.get(e2);
            }
            if (c0478a != null) {
            }
        }
        return new J(z0Var, i10 + 1, z0Var.f8586a[(i10 * 5) + 3] + i10);
    }
}
