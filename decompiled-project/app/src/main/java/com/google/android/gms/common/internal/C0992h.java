package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992h {

    /* renamed from: a, reason: collision with root package name */
    public final Set f15061a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f15062b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f15063c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15064d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15065e;

    /* renamed from: f, reason: collision with root package name */
    public final Z5.a f15066f;
    public Integer g;

    public C0992h(Set set, String str, String str2) {
        Z5.a aVar = Z5.a.f12196a;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f15061a = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f15063c = emptyMap;
        this.f15064d = str;
        this.f15065e = str2;
        this.f15066f = aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            throw h3.o.j(it);
        }
        this.f15062b = Collections.unmodifiableSet(hashSet);
    }
}
