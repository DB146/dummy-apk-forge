package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 extends W1.C implements InterfaceC0972m {

    /* renamed from: n0, reason: collision with root package name */
    public static final WeakHashMap f14975n0 = new WeakHashMap();

    /* renamed from: m0, reason: collision with root package name */
    public final A4.s f14976m0 = new A4.s(14, false);

    @Override // W1.C
    public final void P(int i7, int i10, Intent intent) {
        super.P(i7, i10, intent);
        Iterator it = ((Map) this.f14976m0.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onActivityResult(i7, i10, intent);
        }
    }

    @Override // W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.f14976m0.K(bundle);
    }

    @Override // W1.C
    public final void U() {
        this.f10275S = true;
        A4.s sVar = this.f14976m0;
        sVar.f470a = 5;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onDestroy();
        }
    }

    @Override // W1.C
    public final void Z() {
        this.f10275S = true;
        A4.s sVar = this.f14976m0;
        sVar.f470a = 3;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onResume();
        }
    }

    @Override // W1.C
    public final void a0(Bundle bundle) {
        this.f14976m0.L(bundle);
    }

    @Override // W1.C
    public final void b0() {
        this.f10275S = true;
        A4.s sVar = this.f14976m0;
        sVar.f470a = 2;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onStart();
        }
    }

    @Override // W1.C
    public final void c0() {
        this.f10275S = true;
        A4.s sVar = this.f14976m0;
        sVar.f470a = 4;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0972m
    public final void d(String str, AbstractC0971l abstractC0971l) {
        this.f14976m0.J(str, abstractC0971l);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0972m
    public final AbstractC0971l r(Class cls, String str) {
        return (AbstractC0971l) cls.cast(((Map) this.f14976m0.f471b).get(str));
    }

    @Override // W1.C
    public final void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.y(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f14976m0.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
