package s8;

import d8.InterfaceC1058c;

/* loaded from: classes.dex */
public enum b implements InterfaceC1058c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f24195a;

    b(int i7) {
        this.f24195a = i7;
    }

    @Override // d8.InterfaceC1058c
    public final int a() {
        return this.f24195a;
    }
}
