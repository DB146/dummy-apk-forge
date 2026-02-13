package com.google.android.gms.internal.pal;

import java.security.SecureRandom;

/* loaded from: classes.dex */
final class zzyp extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
