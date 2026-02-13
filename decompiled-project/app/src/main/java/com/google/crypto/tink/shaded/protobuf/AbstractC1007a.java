package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1007a {
    protected int memoizedHashCode;

    public abstract int a();

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] c() {
        try {
            int a9 = a();
            byte[] bArr = new byte[a9];
            C1016j c1016j = new C1016j(bArr, a9);
            d(c1016j);
            if (a9 - c1016j.f15792d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(b("byte array"), e2);
        }
    }

    public abstract void d(C1016j c1016j);
}
