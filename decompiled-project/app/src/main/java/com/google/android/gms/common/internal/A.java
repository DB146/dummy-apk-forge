package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f15015a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0990f f15017c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15018d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f15019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0990f f15020f;

    public A(AbstractC0990f abstractC0990f, int i7, Bundle bundle) {
        this.f15020f = abstractC0990f;
        Boolean bool = Boolean.TRUE;
        this.f15017c = abstractC0990f;
        this.f15015a = bool;
        this.f15016b = false;
        this.f15018d = i7;
        this.f15019e = bundle;
    }

    public abstract void a(F5.b bVar);

    public abstract boolean b();

    public final void c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this) {
            this.f15015a = null;
        }
        arrayList = this.f15017c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f15017c.zzt;
            arrayList2.remove(this);
        }
    }
}
