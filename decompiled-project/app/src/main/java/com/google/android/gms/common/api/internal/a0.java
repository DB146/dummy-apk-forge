package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 extends Fragment implements InterfaceC0972m {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f14973b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final A4.s f14974a = new A4.s(14, false);

    @Override // com.google.android.gms.common.api.internal.InterfaceC0972m
    public final void d(String str, AbstractC0971l abstractC0971l) {
        this.f14974a.J(str, abstractC0971l);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f14974a.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        Iterator it = ((Map) this.f14974a.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onActivityResult(i7, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14974a.K(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        A4.s sVar = this.f14974a;
        sVar.f470a = 5;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A4.s sVar = this.f14974a;
        sVar.f470a = 3;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f14974a.L(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A4.s sVar = this.f14974a;
        sVar.f470a = 2;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        A4.s sVar = this.f14974a;
        sVar.f470a = 4;
        Iterator it = ((Map) sVar.f471b).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0971l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0972m
    public final AbstractC0971l r(Class cls, String str) {
        return (AbstractC0971l) cls.cast(((Map) this.f14974a.f471b).get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0972m
    public final Activity t() {
        return getActivity();
    }
}
