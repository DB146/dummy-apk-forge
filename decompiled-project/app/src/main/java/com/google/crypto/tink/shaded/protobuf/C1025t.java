package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025t implements O {

    /* renamed from: b, reason: collision with root package name */
    public static final C1025t f15816b = new C1025t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15817a;

    public /* synthetic */ C1025t(int i7) {
        this.f15817a = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final Z a(Class cls) {
        switch (this.f15817a) {
            case 0:
                if (!AbstractC1028w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (Z) AbstractC1028w.g(cls.asSubclass(AbstractC1028w.class)).f(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final boolean b(Class cls) {
        switch (this.f15817a) {
            case 0:
                return AbstractC1028w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
