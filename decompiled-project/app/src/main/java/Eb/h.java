package Eb;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h extends AbstractList implements List, Sb.c {
    public abstract int b();

    public abstract Object o(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return o(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
