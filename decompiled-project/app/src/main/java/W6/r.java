package W6;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1030y;

/* loaded from: classes.dex */
public enum r implements InterfaceC1030y {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f10846a;

    r(int i7) {
        this.f10846a = i7;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f10846a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
