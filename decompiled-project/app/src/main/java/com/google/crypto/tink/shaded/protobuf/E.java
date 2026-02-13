package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class E extends AbstractC1008b implements F, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15718b;

    static {
        new E(10).f15755a = false;
    }

    public E(int i7) {
        this(new ArrayList(i7));
    }

    public E(ArrayList arrayList) {
        this.f15718b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final List a() {
        return Collections.unmodifiableList(this.f15718b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        b();
        this.f15718b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1008b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        b();
        if (collection instanceof F) {
            collection = ((F) collection).a();
        }
        boolean addAll = this.f15718b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1008b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f15718b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1008b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f15718b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final void d(C1013g c1013g) {
        b();
        this.f15718b.add(c1013g);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        String str;
        ArrayList arrayList = this.f15718b;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1014h) {
            AbstractC1014h abstractC1014h = (AbstractC1014h) obj;
            abstractC1014h.getClass();
            Charset charset = A.f15705a;
            if (abstractC1014h.size() == 0) {
                str = "";
            } else {
                C1013g c1013g = (C1013g) abstractC1014h;
                str = new String(c1013g.f15773d, c1013g.z(), c1013g.size(), charset);
            }
            C1013g c1013g2 = (C1013g) abstractC1014h;
            int z8 = c1013g2.z();
            if (o0.f15808a.T(z8, c1013g2.f15773d, c1013g2.size() + z8)) {
                arrayList.set(i7, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, A.f15705a);
            P p10 = o0.f15808a;
            if (o0.f15808a.T(0, bArr, bArr.length)) {
                arrayList.set(i7, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC1031z
    public final InterfaceC1031z j(int i7) {
        ArrayList arrayList = this.f15718b;
        if (i7 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i7);
        arrayList2.addAll(arrayList);
        return new E(arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final F r() {
        return this.f15755a ? new g0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        b();
        Object remove = this.f15718b.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof AbstractC1014h)) {
            return new String((byte[]) remove, A.f15705a);
        }
        AbstractC1014h abstractC1014h = (AbstractC1014h) remove;
        abstractC1014h.getClass();
        Charset charset = A.f15705a;
        if (abstractC1014h.size() == 0) {
            return "";
        }
        C1013g c1013g = (C1013g) abstractC1014h;
        return new String(c1013g.f15773d, c1013g.z(), c1013g.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        b();
        Object obj2 = this.f15718b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC1014h)) {
            return new String((byte[]) obj2, A.f15705a);
        }
        AbstractC1014h abstractC1014h = (AbstractC1014h) obj2;
        abstractC1014h.getClass();
        Charset charset = A.f15705a;
        if (abstractC1014h.size() == 0) {
            return "";
        }
        C1013g c1013g = (C1013g) abstractC1014h;
        return new String(c1013g.f15773d, c1013g.z(), c1013g.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15718b.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final Object v(int i7) {
        return this.f15718b.get(i7);
    }
}
