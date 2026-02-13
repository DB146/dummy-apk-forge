package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class g0 extends AbstractList implements F, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final E f15774a;

    public g0(E e2) {
        this.f15774a = e2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final List a() {
        return Collections.unmodifiableList(this.f15774a.f15718b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final void d(C1013g c1013g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f15774a.get(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, com.google.crypto.tink.shaded.protobuf.f0, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f15772a = this.f15774a.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, java.lang.Object, com.google.crypto.tink.shaded.protobuf.e0] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        ?? obj = new Object();
        obj.f15769a = this.f15774a.listIterator(i7);
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final F r() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15774a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final Object v(int i7) {
        return this.f15774a.f15718b.get(i7);
    }
}
