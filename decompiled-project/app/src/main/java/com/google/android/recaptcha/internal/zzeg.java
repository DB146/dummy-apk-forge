package com.google.android.recaptcha.internal;

import ac.g;
import ac.n;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzeg {
    private zzeg() {
        throw null;
    }

    public /* synthetic */ zzeg(f fVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String W10 = n.W("18.6.1", ".", "");
        int f02 = g.f0(W10, "-", 0, 6);
        if (f02 != -1) {
            W10 = W10.substring(0, f02);
            l.d(W10, "substring(...)");
        }
        return Integer.parseInt(W10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(g.t0("18.6.1", "-", ""));
    }
}
