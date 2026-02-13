package com.google.android.gms.internal.pal;

import X.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzafw extends IllegalArgumentException {
    public zzafw(int i7, int i10) {
        super(c.e(i7, i10, "Unpaired surrogate at index ", " of "));
    }
}
