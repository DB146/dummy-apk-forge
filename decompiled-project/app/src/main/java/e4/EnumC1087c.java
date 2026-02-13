package e4;

import d8.InterfaceC1058c;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1087c implements InterfaceC1058c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f16790a;

    EnumC1087c(int i7) {
        this.f16790a = i7;
    }

    @Override // d8.InterfaceC1058c
    public final int a() {
        return this.f16790a;
    }
}
