package com.google.android.datatransport.cct;

import Z3.b;
import androidx.annotation.Keep;
import c4.AbstractC0901c;
import c4.C0900b;
import c4.InterfaceC0906h;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC0906h create(AbstractC0901c abstractC0901c) {
        C0900b c0900b = (C0900b) abstractC0901c;
        return new b(c0900b.f14333a, c0900b.f14334b, c0900b.f14335c);
    }
}
