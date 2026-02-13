package v2;

import java.util.LinkedHashMap;
import y.S;

/* renamed from: v2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2128B {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f24961b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24962a = new LinkedHashMap();

    public final void a(AbstractC2127A navigator) {
        kotlin.jvm.internal.l.e(navigator, "navigator");
        String s3 = O5.b.s(navigator.getClass());
        if (s3.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f24962a;
        AbstractC2127A abstractC2127A = (AbstractC2127A) linkedHashMap.get(s3);
        if (kotlin.jvm.internal.l.a(abstractC2127A, navigator)) {
            return;
        }
        boolean z8 = false;
        if (abstractC2127A != null && abstractC2127A.f24960b) {
            z8 = true;
        }
        if (z8) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + abstractC2127A).toString());
        }
        if (!navigator.f24960b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final AbstractC2127A b(String name) {
        kotlin.jvm.internal.l.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC2127A abstractC2127A = (AbstractC2127A) this.f24962a.get(name);
        if (abstractC2127A != null) {
            return abstractC2127A;
        }
        throw new IllegalStateException(S.b("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
