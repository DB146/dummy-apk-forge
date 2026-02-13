package s8;

import d8.InterfaceC1058c;

/* renamed from: s8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1999a implements InterfaceC1058c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f24191a;

    EnumC1999a(int i7) {
        this.f24191a = i7;
    }

    @Override // d8.InterfaceC1058c
    public final int a() {
        return this.f24191a;
    }
}
