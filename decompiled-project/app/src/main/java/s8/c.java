package s8;

import d8.InterfaceC1058c;

/* loaded from: classes.dex */
public enum c implements InterfaceC1058c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f24198a;

    c(int i7) {
        this.f24198a = i7;
    }

    @Override // d8.InterfaceC1058c
    public final int a() {
        return this.f24198a;
    }
}
