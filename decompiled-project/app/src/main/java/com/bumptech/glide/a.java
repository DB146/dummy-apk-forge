package com.bumptech.glide;

import W3.o;

/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public U3.a f14596a;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return o.b(this.f14596a, ((a) obj).f14596a);
        }
        return false;
    }

    public final int c() {
        U3.a aVar = this.f14596a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b(obj);
    }

    public final int hashCode() {
        return c();
    }
}
