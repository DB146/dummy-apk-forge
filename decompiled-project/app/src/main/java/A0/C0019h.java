package A0;

import h0.InterfaceC1222i;

/* renamed from: A0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019h implements InterfaceC1222i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0019h f232a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f233b;

    @Override // h0.InterfaceC1222i
    public final boolean b() {
        Boolean bool = f233b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw X.c.c("canFocus is read before it is written");
    }

    @Override // h0.InterfaceC1222i
    public final void d(boolean z8) {
        f233b = Boolean.valueOf(z8);
    }
}
