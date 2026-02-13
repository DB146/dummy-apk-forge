package x1;

import b1.d;
import kotlin.jvm.internal.l;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2258b extends d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f26165c;

    public C2258b(int i7) {
        super(i7);
        this.f26165c = new Object();
    }

    @Override // b1.d
    public final Object a() {
        Object a9;
        synchronized (this.f26165c) {
            a9 = super.a();
        }
        return a9;
    }

    @Override // b1.d
    public final boolean c(Object instance) {
        boolean c10;
        l.e(instance, "instance");
        synchronized (this.f26165c) {
            c10 = super.c(instance);
        }
        return c10;
    }
}
