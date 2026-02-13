package db;

import oa.i;

/* renamed from: db.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1071d implements InterfaceC1070c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16623c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile i f16624a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f16625b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, db.d, db.c] */
    public static InterfaceC1070c a(i iVar) {
        ?? obj = new Object();
        obj.f16625b = f16623c;
        obj.f16624a = iVar;
        return obj;
    }

    @Override // Cb.a
    public final Object get() {
        Object obj = this.f16625b;
        if (obj != f16623c) {
            return obj;
        }
        i iVar = this.f16624a;
        if (iVar == null) {
            return this.f16625b;
        }
        Object obj2 = iVar.get();
        this.f16625b = obj2;
        this.f16624a = null;
        return obj2;
    }
}
