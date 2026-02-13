package kb;

import yb.InterfaceC2471a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c implements InterfaceC2471a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19072a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f19073b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kb.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kb.c] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f19072a = r02;
        f19073b = new c[]{r02, new Enum("NEVER", 1)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f19073b.clone();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this == f19072a;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        return 2;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return true;
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        return null;
    }
}
