package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class K implements O {

    /* renamed from: a, reason: collision with root package name */
    public O[] f15722a;

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final Z a(Class cls) {
        for (O o10 : this.f15722a) {
            if (o10.b(cls)) {
                return o10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final boolean b(Class cls) {
        for (O o10 : this.f15722a) {
            if (o10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
