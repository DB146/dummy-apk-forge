package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class G extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f15719c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(Object obj, int i7, long j) {
        E e2;
        List list = (List) l0.f15799d.i(obj, j);
        if (list.isEmpty()) {
            List e10 = list instanceof F ? new E(i7) : ((list instanceof W) && (list instanceof InterfaceC1031z)) ? ((InterfaceC1031z) list).j(i7) : new ArrayList(i7);
            l0.u(obj, j, e10);
            return e10;
        }
        if (f15719c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            l0.u(obj, j, arrayList);
            e2 = arrayList;
        } else {
            if (!(list instanceof g0)) {
                if (!(list instanceof W) || !(list instanceof InterfaceC1031z)) {
                    return list;
                }
                InterfaceC1031z interfaceC1031z = (InterfaceC1031z) list;
                if (((AbstractC1008b) interfaceC1031z).f15755a) {
                    return list;
                }
                InterfaceC1031z j10 = interfaceC1031z.j(list.size() + i7);
                l0.u(obj, j, j10);
                return j10;
            }
            E e11 = new E(list.size() + i7);
            e11.addAll((g0) list);
            l0.u(obj, j, e11);
            e2 = e11;
        }
        return e2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) l0.f15799d.i(obj, j);
        if (list instanceof F) {
            unmodifiableList = ((F) list).r();
        } else {
            if (f15719c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof W) && (list instanceof InterfaceC1031z)) {
                AbstractC1008b abstractC1008b = (AbstractC1008b) ((InterfaceC1031z) list);
                if (abstractC1008b.f15755a) {
                    abstractC1008b.f15755a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        l0.u(obj, j, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2, long j) {
        List list = (List) l0.f15799d.i(abstractC1028w2, j);
        List d10 = d(abstractC1028w, list.size(), j);
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        l0.u(abstractC1028w, j, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(Object obj, long j) {
        return d(obj, 10, j);
    }
}
