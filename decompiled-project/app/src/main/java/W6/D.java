package W6;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1030y;

/* loaded from: classes.dex */
public enum D implements InterfaceC1030y {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f10824a;

    D(int i7) {
        this.f10824a = i7;
    }

    public static D a(int i7) {
        if (i7 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i7 == 1) {
            return TINK;
        }
        if (i7 == 2) {
            return LEGACY;
        }
        if (i7 == 3) {
            return RAW;
        }
        if (i7 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f10824a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
